package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server2 {
	private ServerSocket serverSocket;
	private Map<String,PrintWriter> allOut;
	private ExecutorService threadPool;
	Server2(){
		try {
			serverSocket = new ServerSocket(8088);
			allOut = new HashMap<String,PrintWriter>();
			threadPool = Executors.newFixedThreadPool(40);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private synchronized void addOut(String nickName,PrintWriter pw) {
		allOut.put(nickName, pw);
	}
	private synchronized void removeOut(String nickName) {
		allOut.remove(nickName);
	}
	private synchronized void sendMessage(String message) {
		for(PrintWriter pw : allOut.values()) {
			pw.println(message);
		}
	}
	private synchronized void sendMessageToOne(String name,String message) {
		PrintWriter pw = allOut.get(name);
		if(pw!=null) {
			pw.println(message);
		}
	}
	private class ClientHandler implements Runnable{
		private Socket socket;
		private String nickName;
		ClientHandler(Socket socket){
			this.socket = socket;
		}
		public void run() {
			PrintWriter pw = null;
			try {
				 pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8"),true);
				nickName = getNickName();
				addOut(nickName, pw);
				sendMessage(nickName+"上线了！");
					BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
					String message = null;
					while((message = br.readLine())!=null) {
						if(message.startsWith("\\")) {
							/*
							 * 私聊格式：\昵称:内容
							 */
							int index = message.indexOf(":");
							if(index>=0) {
								String name = message.substring(1,index);
								String info = message.substring(index+1, message.length());
								message = nickName+"对你说："+info;
								sendMessageToOne(name, message);
								continue;
							}
						}
						sendMessage(nickName+"说："+message);
					}
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				removeOut(nickName);
				sendMessage(nickName+"下线了！");
				System.out.println("当前在线人数："+allOut.size());
				if(socket!=null) {
					try {
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			
		}
		private String getNickName() throws Exception {
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
				PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8"),true);
				String nickName = br.readLine();
				while(true) {
					if("".equals(nickName.trim())) {
						pw.println("FAIL");
					}
					if(allOut.containsKey(nickName)) {
						pw.println("FAIL");
					}else {
						pw.println("OK");
						return nickName;
					}
					nickName = br.readLine();
				}
			} catch (Exception e) {
				throw e;
			}
		}
	}
	public void start() {
		try {
			while(true) {
				System.out.println("正在等待客户端连接...");
				Socket socket = serverSocket.accept();
				System.out.println("客户端连接成功！");
				ClientHandler handler = new ClientHandler(socket);
				Thread t = new Thread(handler);
				threadPool.execute(t);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		Server2 server = new Server2();
		server.start();
	}

}

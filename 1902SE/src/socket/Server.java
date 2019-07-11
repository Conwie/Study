package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * 聊天室服务端
 * @author soft01
 *
 */
public class Server {
	/*
	 * 运行在服务端的ServerSocket主要有两个作用：
	 * 1.向系统申请服务端口（客户端就是通过这个端口
	 * 	与服务端程序建立连接的）
	 * 2.监听端口，一旦一个客户端建立连接，那么就会
	 * 	自动创建一个Socket与该客户端通讯。
	 */
	private ServerSocket server;
	/*
	 * 该数组用于保存所有ClientHandler对应客户端
	 * 的输出流，便于这些ClientHandler转发消息
	 */
//	private PrintWriter[] allOut = {};
	private Collection<PrintWriter> allOut = new ArrayList<>();
	public Server() {
		try {
			System.out.println("正在启动服务端...");
			server = new ServerSocket(8088);
			System.out.println("服务端启动完毕！");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void start() {
		try {
			/*
			 * ServerSocket提供流接收客户端连接的方法：
			 * Socket accept()
			 * 这是一个阻塞方法，调用后服务端开始等待，
			 * 直到一个客户端通过这个端口与服务端建立连接为止，
			 * 这时该方法会返回一个Socket实例通过这个实例就
			 * 可以与该客户端通讯了。
			 * 多次调用accept方法可以等待多个客户端的连接
			 */
			while(true) {
				System.out.println("等待客户端连接...");
				Socket socket = server.accept();
				System.out.println("一个客户端连接了！");
				
				ClientHandler handler = new ClientHandler(socket);
				Thread t = new Thread(handler);
				t.start();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}
	/**
	 * 该线程任务是负责与指定客户端进行交互
	 * @author soft01
	 *
	 */
	private class ClientHandler implements Runnable{
		private Socket socket;
		private String host;
		ClientHandler(Socket socket){
			this.socket = socket;
			InetAddress address = socket.getInetAddress();
			host = address.getHostAddress();
		}
		public void run() {
			PrintWriter pw = null;
			try {
				/*
				 * 通过Socket获取输入流，可以读取远端计算机
				 * 发送过来的字节数据。
				 */
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in,"UTF-8");
				BufferedReader br = new BufferedReader(isr);
				
				/*
				 * 通过Socket获取输出流，以便将消息发送给客户端
				 */
				 pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8")),true);
				/*
				 * 将当前ClientHandler对应客户端的输出流
				 * 放入共享数组allOut中，以便其他的ClientHandler
				 * 也可以访问到，从而给这个客户端转发消息。
				 */
				
				 synchronized(allOut) {
					 	//1.对allOut扩容
/*					 	allOut = Arrays.copyOf(allOut, allOut.length+1);
						//2.将输出流存入到数组中
						allOut[allOut.length-1] = pw;*/
					 allOut.add(pw);
				 }
				
//				System.out.println(host+"上线了，当前在线人数："+allOut.length);
					System.out.println(host+"上线了，当前在线人数："+allOut.size());
				
				
				String message = null;
				while((message = br.readLine())!=null) {
					System.out.println(host+"说："+message);
				}
				synchronized(allOut) {
					//将消息发送给客户端
//					for(int i=0;i<allOut.length;i++) {
//						allOut[i].println("客户端说："+message);
//					}	
					for(PrintWriter out : allOut) {
						out.println(host+"说："+message);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				//处理客户端断开连接后的操作
				
				//1将当前客户端输出流从共享数组中删除
				synchronized(allOut) {
/*					for(int i=0;i<allOut.length;i++) {
						if(pw==allOut[i]) {
							allOut[i] = allOut[allOut.length-1];
							allOut = Arrays.copyOf(allOut, allOut.length-1);
							break;
						}
					}*/	
					allOut.remove(pw);
				}
				System.out.println(host+"下线了，当前在线人数："+allOut.size());
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}

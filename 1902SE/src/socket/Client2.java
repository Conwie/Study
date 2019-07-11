package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客户端
 * @author soft01
 *
 */
public class Client2 {
	private Socket socket;
	Client2(){
		try {
			socket = new Socket("localhost",8088);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private class ServerHandler implements Runnable{
		public void run() {
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
				String message = null;
				while((message = br.readLine())!=null) {
					System.out.println(message);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				if(socket!=null) {
					try {
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			
			
		}
	}
	public void start() {
		try {
			Scanner sc = new Scanner(System.in);
			inputNickName(sc);
			ServerHandler handler = new ServerHandler();
			Thread t = new Thread(handler);
			t.setDaemon(true);
			t.start();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8"),true);
			while(true) {
				pw.println(sc.nextLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	private void inputNickName(Scanner sc) {
		try {
			System.out.println("请输入昵称：");
			String nickName = sc.nextLine();
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8"),true);
			while(true) {
				if("".equals(nickName.trim())) {
					System.out.println("昵称不能为空");
				}else {
					pw.println(nickName);
					String pass = br.readLine();
					if(pass!=null && !"OK".equals(pass)) {
						System.out.println("昵称已被占用，请重新输入！");
					}else {
						System.out.println("你好"+nickName+"，开始聊天吧！");
						break;
					}
				}
				nickName = sc.nextLine();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		Client2 client = new Client2();
		client.start();
	}
}

package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 聊天室客户端
 * @author soft01
 *
 */
public class Client {
	/*
	 * java.net.Socket 套接字
	 * Socket封装了TCP连接和通讯的细节，使用它
	 * 可以通过两条流的读写完成与远端计算机的数据交互
	 */
	private Socket socket;
	/**
	 * 构造方法，用来初始化客户端
	 */
	public Client() {
		try {
			/*
			 * 实例化Socket时需要传入两个参数：
			 * 1：服务端计算机的IP地址
			 * 2：服务端应用程序打开的服务端口
			 * 我们通过IP可以找到网络上的服务端计算机
			 * 通过端口连接到该机器上的服务端应用程序
			 * 
			 * 实例化Socket的过程就是连接的过程，若
			 * 服务端没有响应这里会抛出异常
			 */
				System.out.println("正在连接服务端...");
				socket = new Socket("localhost",8088);
				System.out.println("已连接！");
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 客户端开始工作的方法
	 */
	public void start() {
		try {
			Scanner sc = new Scanner(System.in);
			//启动用于读取服务端发送过来消息的线程
			ServerHandler handler = new ServerHandler();
			Thread t = new Thread(handler);
			t.start();
			/*
			 * Socket提供的方法：
			 * OutputStream getOutputStream()
			 * 获取的字节输出流写出的字节会通过网络发送给远端计算机。
			 */
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(bw,true);
			
			while(true) {
				pw.println(sc.nextLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Client client = new Client();
		client.start();
	}
	
	/**
	 * 该线程负责读取服务端发送过来的消息
	 */
	private class ServerHandler implements Runnable{
		public void run() {
			try {
				//创建输入流读取服务端发送过来的消息
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
				while(true) {
					System.out.println(br.readLine());
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
}

package thread;

import java.util.Scanner;

/**
 * sleep阻塞
 * 
 * static void sleep(long ms)
 * 该方法可以让运行这个方法的线程进入阻塞状态指定毫秒，
 * 当超时后线程会自动回到RUNNABLE状态等待再次并发运行
 * @author soft01
 *
 */
public class SleepDemo {
	public static void main(String[] args) {
		System.out.println("预备～");
		/*
		 * 启动后在控制台输入一个数字，然后从这个
		 * 数字开始递减，当到0时停止。每秒递减一次
		 * 并输出对应的数字
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字：");
		int num = Integer.parseInt(sc.nextLine());
		while(num>0) {
			System.out.println(num--);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		sc.close();
		System.out.println("跑！");
	}
}

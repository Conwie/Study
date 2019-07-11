package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池 ExecutorService
 * 
 * 线程池主要解决两个问题：
 * 1：控制线程数量
 * 2：重用线程
 * 
 * 
 * @author soft01
 *
 */
public class ThreadPoolDemo {
	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		for(int i=0;i<5;i++) {
		Runnable runn = new Runnable() {
			public void run() {

					try {
						Thread t = Thread.currentThread();
						System.out.println(t.getName()+"：正在执行任务...");
						Thread.sleep(5000);
						System.out.println(t.getName()+":任务执行完毕！");
					} catch (Exception e) {
						System.out.println("线程被中断了！");
					}
				}
			};
			threadPool.execute(runn);
			System.out.println("指派一个任务");
		}
		
		/*
		 * shutdown方法调用后，线程池不再接收新的
		 * 任务，并且会将当前线程池已缓存任务全部执行
		 * 完毕后停止。
		 * 
		 * shutdownNow方法调用后，线程池会立即调用
		 * 内部线程的中断方法并停止线程池。
		 */
//		threadPool.shutdown();
		threadPool.shutdownNow();
		System.out.println("线程已停止！");
	}
}

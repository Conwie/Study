package thread;
/**
 * 第二种创建线程的方式
 * 实现runnnable接口单独定义线程任务
 * @author soft01
 *
 */
public class ThreadDemo2 {

	public static void main(String[] args) {
		//单独定义线程任务
		MyRunnable1 r1 = new MyRunnable1();
		MyRunnable2 r2 = new MyRunnable2();
		//创建线程指派任务
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		//执行线程
		t1.start();
		t2.start();
	}

}

class MyRunnable1 implements Runnable{

	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("你是谁？");
		}
		
	}
	
}

class MyRunnable2 implements Runnable{

	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("我是你爸爸～");
		}
		
	}
}

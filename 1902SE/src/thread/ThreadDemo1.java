package thread;
/**
 * 多线程
 * 线程将代码执行的方式改变了，将原有的“串行操作”改为
 * 了“并行操作”。
 * 
 * 线程有两种创建方式：
 * 1：继承Thread重写run方法
 * @author soft01
 *
 */
public class ThreadDemo1 {
	public static void main(String[] args) {
		Thread t1 = new MyThread1();
		Thread t2 = new MyThread2();
		/*
		 * 启动线程时要调用线程的start方法
		 * 注意：不要直接调用run方法。
		 * 当start方法调用完毕后，该线程纳入到线程
		 * 调度器中，一旦分配到时间片，那么它的run方
		 * 法会自动被调用。
		 */
		t1.start();
		t2.start();
	}

}
/**
 * 第一种创建线程的方式有两个设计不足：
 * 1：由于java是单继承的，这导致若继承了线程就无法再
 * 	继承其他类去复用方法，这在实际开发中很不方便
 * 2：直接重写run方法来定义线程任务会导致线程与任务
 * 	存在一个必然的耦合关系，不利于线程的重用。
 * @author soft01
 *
 */
class MyThread1 extends Thread{
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("Hello～姐！");
		}
	}
}
class MyThread2 extends Thread{
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("来了～老弟～");
		}
	}
}
package thread;
/**
 * 线程以供了一个静态方法：
 * static Thread currentTHread()
 * 该方法可以获取运行这个方法的线程
 * @author soft01
 *
 */
public class CurrentThreadDemo {
	/*
	 * java中所有的代码都是线程运行的
	 * main方法也是由一个线程运行的，我们称它为：主线程
	 */
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		System.out.println("运行main方法的线程是："+main);
		dosome();
		
		Thread t = new Thread() {
			public void run() {
				Thread t = Thread.currentThread();
				System.out.println("自定义线程："+t);
				dosome();
			}
		};
		t.start();
	}
	static void dosome() {
		Thread main = Thread.currentThread();
		System.out.println("运行dosome方法的线程是："+main);
	}
}

package thread;
/**
 * sleep方法要求处理中断异常
 * 当一个线程调用sleep方法处于阻塞状态的过程中，
 * 若此时该线程的中断方法被调用：interrupt()，那么
 * 此时该线程的睡眠阻塞会被立即打断，并在sleep这个
 * 方法处抛出异常。
 */
public class SleepDemo2 {
	public static void main(String[] args) {
		/*
		 * JDK8之前有一个要求（JDK8不再强制要求）
		 * 当一个方法的局部内部类中引用了这个方法的
		 * 其他局部变量时，这个变量必须声明为final的。
		 * 这其实是由于JVM内存分配问题导致的。
		 */
		final Thread lin = new Thread() {
			public void run() {
				System.out.println("林：刚美容完，睡一会吧～");
				try {
					Thread.sleep(1000000);
				} catch (InterruptedException e) {
					System.out.println("林：干嘛呢～干嘛呢～干嘛呢～干嘛呢～");
				}
				System.out.println("醒了！");
			}
		};
		Thread huang = new Thread() {
			public void run() {
				System.out.println("黄：开始砸墙！");
				for(int i=0;i<5;i++) {
					System.out.println("80～");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("咣当！");
				System.out.println("黄：搞定！");
				lin.interrupt();
			}
		};
		lin.start();
		huang.start();
	}
}

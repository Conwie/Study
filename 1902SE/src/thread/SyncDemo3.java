package thread;
/**
 * 静态方法若使用synchronized修饰，那么一定具有同步效果。
 * @author soft01
 *
 */
public class SyncDemo3 {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				Boo.dosome();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				Boo.dosome();
			}
		};
		t1.start();
		t2.start();
	}
}
class Boo{
	/*
	 * 静态方法的同步监视器对象为当前类的类对象
	 * 每个类在JVM内部都有且只有一个类对象（Class类
	 * 的实例），静态方法指定的类对象就是它。
	 * 获取一个类的类对象可以用：类名.class
	 */
//	public synchronized static void dosome() {
	public  static void dosome() {
		synchronized (Boo.class) {  
			try {
				Thread t = Thread.currentThread();
				System.out.println(t.getName()+":正在执行dosome()方法...");
				Thread.sleep(5000);
				System.out.println(t.getName()+":执行完毕！");
			} catch (Exception e) {
			}
		}
	}
}

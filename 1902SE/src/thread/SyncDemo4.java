package thread;
/**
 * 互斥锁
 * 当使用synchronized锁定多个代码片段，并且这些同步
 * 监视器对象指定的是同一个时，那么这些代码片段就是互斥的。
 * 多个线程不能同时执行互斥的代码片段。
 * @author soft01
 *
 */
public class SyncDemo4 {
	public static void main(String[] args) {
		final Foo foo = new Foo();
		Thread t1 = new Thread() {
			public void run() {
				foo.methodA();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				foo.methodB();
			}
		};
		t1.start();
		t2.start();
	}
}
class Foo{
	public synchronized void methodA() {
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+":正在执行A()方法...");
			Thread.sleep(5000);
			System.out.println(t.getName()+":执行A()方法完毕！");
		} catch (Exception e) {
		}
		
	}
//	public synchronized void methodB() {
	public  void methodB() {
		synchronized (this) {
			try {
				Thread t = Thread.currentThread();
				System.out.println(t.getName()+":正在执行B()方法...");
				Thread.sleep(5000);
				System.out.println(t.getName()+":执行B()方法完毕！");
			} catch (Exception e) {
			}
		}
	}
}

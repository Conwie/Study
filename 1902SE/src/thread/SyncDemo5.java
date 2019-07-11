package thread;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

/**
 * 同一个类的多个静态方法若都被synchronized修饰
 * 那么这几个静态方法之间就是互斥的。
 * @author soft01
 *
 */
public class SyncDemo5 {

	public static void main(String[] args) {
		final Coo c1 = new Coo();
		final Coo c2 = new Coo();
		Thread t1 = new Thread() {
			public void run() {
				c1.methodA();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				c2.methodB();
			}
		};
		t1.start();
		t2.start();
	}
}
class Coo{
	public synchronized static void methodA() {
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+":正在执行A()方法...");
			Thread.sleep(5000);
			System.out.println(t.getName()+":A()方法执行完毕！");
		} catch (Exception e) {
		}
	}
//	public synchronized static void methodB() {
	public  static void methodB() {
		synchronized (Coo.class) {
			try {
				Thread t = Thread.currentThread();
				System.out.println(t.getName()+":正在执行B()方法...");
				Thread.sleep(5000);
				System.out.println(t.getName()+":B()方法执行完毕！");
			} catch (Exception e) {
			}
		}
	}
}

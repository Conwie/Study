package thread;


/**
 * 在保证并发安全的前提下有效的缩小同步范围是可以
 * 提高并发效率的。
 * 
 * 同步块：
 * synchronized（同步监视器对象）{
 * 		需要同步运行的代码片段
 * }
 * 
 * @author soft01
 *
 */
public class SyncDemo2 {
	public static void main(String[] args) {
		final Shop shop = new Shop();
		Thread t1 = new Thread() {
			public void run() {
				shop.buy();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				shop.buy();
			}
		};
		t1.start();
		t2.start();
	}
}
class Shop{
	/*
	 * 在方法上使用synchronized，那么同步监视对象
	 * 就是该方法所属对象，即：方法中看到的this
	 */
	//public  synchronized void buy() {
	public  void buy() {
		try {
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+":正在挑衣服...");
			Thread.sleep(5000);
			/*
			 * 同步块可以更准确的锁定需要同步运行的代码片段。
			 * 这里需要注意，在指定同步监视器对象，即：上锁的对象
			 * 该对象可以是java中任何类型的实例，只要保证多个需要
			 * 排队执行其中代码的线程看到的这个对象是同一个即可。
			 */
			synchronized (this) {
				System.out.println(t.getName()+":正在试衣服...");
				Thread.sleep(5000);
			}
			System.out.println(t.getName()+":结帐离开。");
		} catch (Exception e) {
		}
		
	}
}

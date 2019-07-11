package thread;
/**
 * 多线程并发安全问题
 * 当多个线程并发操作同一临界资源时，由于线程切换时机
 * 不确定，导致操作代码的顺序未按照程序设计顺序执行，
 * 出现操作混乱。严重时可能导致系统瘫痪。
 * 
 * 被多个线程“同时”访问的数据，称为临界资源。
 * @author soft01
 */
public class SyncDemo {
	public static void main(String[] args) {
		final Table table = new Table();
		Thread t1 = new Thread() {
			public void run() {
				while(true) {
					int bean = table.getBeans();
					Thread.yield();
					System.out.println(getName()+":"+bean);
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				while(true) {
					int bean = table.getBeans();
					Thread.yield();
					System.out.println(getName()+":"+bean);
				}
			}
		};
		t1.start();
		t2.start();
	}
}
class Table{
	//桌子上有20个豆子
	private int beans = 20;
	/**
	 * 当一个方法使用了关键字：synchronized后，那么这个
	 * 方法称为“同步方法”
	 * 多个线程不能同时执行同步方法，必须排队执行。
	 * 这样做就可以解决并发安全问题了。
	 * @return
	 */
	public synchronized int getBeans() {
		if(beans==0) {
			throw new RuntimeException("没有豆子了！");
		}
		//主动让当前线程放弃本次CPU时间，模拟CPU没有时间发送切换
		Thread.yield();
		return beans--;
	}
}

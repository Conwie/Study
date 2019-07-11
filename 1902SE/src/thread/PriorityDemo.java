package thread;
/**
 * 线程的优先级
 * 线程的优先级有10个等级，分别用整数1-10表示。
 * 其中1为最低，10为最高，5为默认值
 * 
 * 理论上优先级越高的线程获取CPU时间片的次数越多。
 * @author soft01
 *
 */
public class PriorityDemo {
	public static void main(String[] args) {
		Thread max = new Thread() {
			public void run() {
				for (int i = 0; i < 10000; i++) {
					System.out.println("max");
				}
			}
		};
		
		Thread min = new Thread() {
			public void run() {
				for(int i=0;i<10000;i++) {
					System.out.println("min");
				}
			}
		};
		
		Thread norm = new Thread() {
			public void run() {
				for(int i=0;i<10000;i++) {
					System.out.println("nor");
				}
			}
		};
		
		max.setPriority(Thread.MAX_PRIORITY);
		min.setPriority(Thread.MIN_PRIORITY);
		max.start();
		min.start();
		norm.start();
	}
	
	
}

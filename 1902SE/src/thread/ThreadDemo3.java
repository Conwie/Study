package thread;
/**
 * 使用匿名内部类的方式完成两种线程的创建
 * @author soft01
 *
 */
public class ThreadDemo3 {
	public static void main(String[] args) {
		Thread t1 = new Thread(){
			public void run() {
				for(int i=0;i<1000;i++) {
					System.out.println("可以吃饭了吗？");
				}
			}
		};
		
		Runnable r2 = new Runnable() {
			public void run() {
				for(int i=0;i<1000;i++) {
					System.out.println("吃阿！");
				}
			}
		};
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}
	
}

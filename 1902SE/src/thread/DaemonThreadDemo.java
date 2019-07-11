package thread;
/**
 * 守护线程
 * 守护线程也称为“后台线程”，默认创建出来的线程都是
 * 普通线程，守护线程是需要再普通线程上进行设置变换
 * 为守护线程的。
 * 使用上它们没有差别。但是有一个明显的区别在于：
 * 结束时机上有一点不同，当进程结束时所有正在运行的
 * 守护线程会被强制终止。而进程结束是当这个进程中的
 * 所有普通线程都结束时进程就会结束。
 * @author soft01
 *
 */
public class DaemonThreadDemo {
	public static void main(String[] args) {
		Thread rose = new Thread() {
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("rose:let me go!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("rose:啊啊啊啊啊啊啊啊AAAAAAaaaaa...");
				System.out.println("扑通！");
			}
		};
		Thread jack = new Thread() {
			public void run() {
				while(true) {
					System.out.println("jack:You jump,I jump");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
		};
		rose.start();
		/*
		 * 设置守护线程必须要在线程启动前进行。
		 */
		jack.setDaemon(true);
		jack.start();
		//main方法为普通线程，此处最先结束的线程为main 
//		while(true) {
//			
//		}
	}
	
}

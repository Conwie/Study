package thread;
/**
 * void join()
 * 该方法允许调用这个方法的线程在该方法所属线程上等
 * 待（阻塞），直到该方法所属线程结束后方可解除阻塞
 * 继续运行。
 * 所以join方法可以协调线程同步运行
 * 同步运行：执行有顺序
 * 异步运行：各执行各的，多线程实际就是异步运行的。
 * @author soft01
 *
 */
public class JoinDemo {
	//表示图片是否下载完毕
	public static boolean isFinish = false;
	public static void main(String[] args) {
		final Thread download = new Thread() {
			public void run() {
				System.out.println("down：开始下载图片");
				for(int i=1;i<=100;i++) {
					System.out.println("down:"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("down:图片下载完成！");
				isFinish = true;
			}
		};
		download.start();
		Thread t = new Thread() {
			public void run() {
				try {
					System.out.println("开始显示文字");
					Thread.sleep(2000);
					System.out.println("文字显示完毕！");
					System.out.println("开始显示图片");
					
					 /*先等待下载线程将图片下载完毕
					 *
					 * show调用join方法后进入阻塞状态，直到
					  download线程结束才会解除阻塞继续向下执行*/
					 
					download.join();
					if(!isFinish) {
						throw new RuntimeException("图片加载失败！");
					}
					System.out.println("图片显示完毕！");
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		};
		t.start();
		
	}
}

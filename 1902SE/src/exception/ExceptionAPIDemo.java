package exception;
/**
 * 异常常用方法介绍
 * @author soft01
 *
 */
public class ExceptionAPIDemo {

	public static void main(String[] args) {
		System.out.println("程序开始了");
		
		try {
			String str = "a";
			System.out.println(Integer.parseInt(str));
		} catch (Exception e) {
			//输出错误堆栈信息，便于debug
//			e.printStackTrace();
			//获取错误消息
			String message = e.getMessage();
			System.out.println("message:"+message);
			System.out.println("出错了！");
		} 

		
		
		System.out.println("程序结束了");
	}

}

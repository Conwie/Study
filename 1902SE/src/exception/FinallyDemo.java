package exception;
/**
 * finally块
 * finally块是异常处理机制的最后一块，可以直接跟在
 * try块之后或者最后一个catch之后
 * 
 * finally可以保证只要代码执行到try当中，无论try语句
 * 块中的内容是否出现异常，finally块的代码必定执行。
 * 
 * 诸如释放资源这类操作（比如IO操作完的关闭u就可以放在这里
 * 确保执行）
 * @author soft01
 *
 */
public class FinallyDemo {
	public static void main(String[] args) {
		System.out.println("程序开始执行了");
		try {
			String str = "";
			System.out.println(str.length());
			//try语句块中报错以下的代码都不会运行
			return;
		} catch (Exception e) {
			System.out.println("出错了");
		}finally {
			System.out.println("finally中的代码执行了！");
		}
		System.out.println("程序结束了");
	}
}

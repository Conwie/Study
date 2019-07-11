package exception;
/**
 * java异常处理机制
 * try-catch块
 * 语法定义：
 * try{
 * 	代码片段
 * }catch(XXXException e){
 * 	当try块中代码抛出XXXException后的处理代码
 * }
 * @author soft01
 *
 */
public class Try_CatchDemo {

	public static void main(String[] args) {
		System.out.println("程序开始执行了");
		try {
			String str = "s";
			System.out.println(str.length());
			System.out.println(str.charAt(0));
			System.out.println(Integer.parseInt(str));
		} catch (NullPointerException e) {
			System.out.println("出现了空指针");
			/*
			 * 可以定义多个catch，当不同的异常我们有不同的
			 * 处理手段时，可以分别捕获这些异常并处理
			 */
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("字符串下标越界了！");
		}catch(Exception e) {
			System.out.println("反正就是出了个错！");
		}

		System.out.println("程序结束了");
	}

}

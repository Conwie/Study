package exception;
/**
 * 异常的抛出
 * @author soft01
 *
 */
public class ThrowDemo {

	public static void main(String[] args) {
		System.out.println("程序开始了");
		Person p = new Person();
		/*
		 * 当我们调用一个含有throws声明异常抛出的
		 * 方法时，编译器要求我们必须处理这个异常，
		 * 否则编译不通过。
		 * 处理异常的方式有两种：
		 * 1：使用try-catch主动处理这个异常
		 * 2：在当前方法上继续使用throws声明抛出
		 * 具体使用哪种处理方式取决于实际情况，看
		 * 该异常应当有谁解决。
		 */
			//语法满足，但是不满足业务需求
			try {
				p.setAge(10000);
			} catch (IllegalAgeException e) {
				e.printStackTrace();
			}
		System.out.println(p.getAge());
		System.out.println("程序结束了");
	}

}

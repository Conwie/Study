package lambda;
/**
 * lambda表达式 JDK8推出的一个新特性
 * lambda旨在让我们可以以“函数式编程”
 * 
 * lambda可以用更简便的语法创建匿名内部类
 * 语法：
 * （参数列表）->{
 * 	方法体
 * }
 * 
 * 需要注意，lambda创建的匿名内部类所属的接口必须
 * 只能有一个抽象方法，否则编译不通过。
 * @author soft01
 *
 */
public class LambdaDemo1 {
	public static void main(String[] args) {

		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("hello1");
			}
		};
		
		Runnable r2 = ()->{
			System.out.println("hello2");
		};
		/*
		 * 如果方法只有一句代码，那么lambda的{}也
		 * 可以省略
		 */
		Runnable r3 = ()->System.out.println("hello3");
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		t1.start();
		t2.start();
		t3.start();
	}
}

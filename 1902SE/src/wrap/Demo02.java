package wrap;

public class Demo02 {

	public static void main(String[] args) {
		/*
		 * "懒人"角度理解API
		 * 
		 * 自动包装  Auto Boxing
		 * 
		 * 1.Java5(Java1.5)开始提供了自动包装功能,可以简化编码
		 *    2.简单理解，就是包装类型和基本类型
		 *    	  之间可以自动转换类型赋值。
		 *    3. 自动包装是利用编译器实现的
		 *   Java 编译器将代码进行“擦除”（替换）
		 *   Integer i = 5;
		 *   		替换为
		 *   Integer i = Integer.valueOf(5);
		 *   
		 *   	int n = i;
		 *   		替换为
		 *   int n = i.intValue();
		 *    4.赋值，计算，参数传递，返回值等，都会发生自动包装
		 */
		//自动包装（装箱）：将基本类型自动包装为包装类型
		Integer i = 5;//Integer.valueOf(5);
		//自动拆包（拆箱）：将包装类型自动转换为基本类型
		int n = i;//i.intValue();
		System.out.println(i);
		System.out.println(n);
		
		//double 类型的自动包装：
		Double d = 4.5;//Double.valueOf(4.5);
		double x = d;//d.doubleValue();
		System.out.println(d);
		System.out.println(x);
		
		//自动包装
		Object obj = 5;
		double y = test(5.6,7);
		System.out.println(y);//12.6
	}
	
	public static double test(Double d,Integer i) {
		Double x = d + i;
		return x;
	}
}

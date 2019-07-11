package obj;

public class Demo01 {

	public static void main(String[] args) {
		/*
		 * Object
		 * 是所有java类的最终父类型
		 * 
		 * 包装类
		 * 用于将基本类型包装为对象
		 * 以及提供了Java中最基本的方法
		 * 
		 * Object
		 * 1.任何类型如果没有父类型，则默认继承与于Object。
		 * 	任何类最终都继承于Object
		 * 2.Java将全部类型都有的属性和方法
		 * 	定义到了Object类型上
		 * 4.Object定义的方法，任何对象都有
		 * equals方法
		 * toString方法
		 */
		
		/*
		 * toString()
		 * 1.返回对象的文本描述。
		 * 2.默认实现返回了“没有意义”的类全名@散列码
		 * 3.Java建议重写toString() 修改toString返回值，
		 * 	一般修改为返回对象当前的属性，用于Debug
		 * 4.Java的很多API会自动调用toString简化编程
		 * 5.Eclipse提供了快捷工具，帮你重写toString()返回对象属性
		 */
		Foo foo = new Foo();
		Point p = new Point();
		System.out.println(foo.toString());
		System.out.println(p.toString());
		
		//println方法会自动调用p的toString()方法
		System.out.println(p);
	}

}
class Foo{
	
}
class Point{
	int x;
	int y;
	
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}      
	
}

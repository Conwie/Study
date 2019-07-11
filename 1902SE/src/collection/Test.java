package collection;
/**
 * 面试题
 */
import java.util.ArrayList;
import java.util.Collection;

public class Test {

	public static void main(String[] args) {
		int a = 1;
		String s = "hello";
		Point p = new Point(1,2);
		Collection c = new ArrayList();
		c.add(p);
		test(a,s,p,c);
		System.out.println(a);//1
		System.out.println(s);//hello
		System.out.println(p);//(2,2)
		System.out.println(c);//[(5,4)]
	}
	private static void test(int a, String s, Point p, Collection c) {
			a++;  //a这里为局部变量+1     清除
			s = s + "world";   //字符串连接会重新创建一个新的对象       清除
			p.setX(2);	//将引用p的x值改为2
			p = new Point(3,4);	//将局部引用p指向新的地址（3，4）
			c.clear();   //清空局部引用c的元素
			c.add(p);    //往局部引用c的地址添加元素
			p.setX(5);		//将局部引用的值改为（5，4）   这里c的最终地址指向的元素是p（5，4）
			c = new ArrayList();  //将局部引用c指向新的地址    清除
			p = new Point(7,8);   //将局部引用p指向新的地址（7，8）   清除
			c.add(p);				//往局部引用c添加局部p（7，8）元素    清除
			//test方法执行完将清除所有的局部变量
			//GC会将没有引用的地址清除。
	}

}

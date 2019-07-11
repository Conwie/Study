package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * JDK5推出时推出了一个新的特性：增强for循环
 * 也称为新循环或for each
 * 
 * 新循环不取代传统for循环的工作，它是用来遍历集合
 * 或数组使用的。
 * @author soft01
 *
 */
public class NewForDemo {

	public static void main(String[] args) {
		String[] arr = {"one","two","three","four","five"};
		for(int i=0;i<arr.length;i++) {
			String str = arr[i];
			System.out.println(str);
		}
		/*
		 * 新循环是编译器认可而不是虚拟机。
		 * 编译器在编译后会将代码改为普通for循环
		 * 遍历数组。
		 */
		for(String str : arr) {
			System.out.println(str);
		}
		
		Collection c = new ArrayList();
		c.add("java");
		c.add("php");
		c.add("android");
		c.add("ios");
		c.add("c++");
		/*
		 * 新循环遍历集合就是迭代器遍历集合。
		 * 所以不要在遍历的过程中使用集合的方法
		 * 增删元素。
		 */
		for(Object obj : c) {
			String str = (String)obj;
			System.out.println(str);
		}
	}

}

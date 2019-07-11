package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 泛型  JDK5推出时推出的一个特性
 * 泛型又称为参数化类型，允许我们在使用一个类时指定
 * 其内部属性，方法的参数，方法的返回值等的类型，
 * 这使得我们在使用一个类时灵活性提高。
 * 
 * 泛型在集合中广泛应用，用于指定集合中元素的实际类型。
 * 若某个类支持泛型，我们使用时没有指定实际类型，则默认
 * 为原型Object.
 * @author soft01
 *
 */
public class TypeDemo {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
//		c.add(6);   编译不通过
		/*
		 * 新循环可以直接用泛型实际类型接收元素
		 */
		for(String str : c) {
			System.out.println(str);
		}
		/*
		 * 迭代器也支持泛型，与其遍历的集合泛型一致即可
		 */
		Iterator it = c.iterator();
		while(it.hasNext()) {
			String str = (String)it.next();
			System.out.println(str);
		}
	}

}

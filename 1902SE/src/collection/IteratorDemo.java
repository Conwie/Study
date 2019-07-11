package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 集合的遍历
 * Collection提供了对集合遍历元素的统一操作：迭代器
 * Iterator iterator()
 * 该方法会获取一个用于遍历当前集合元素的迭代器实现类
 * 
 * java.util.Iterator接口
 * 迭代器接口，规定了所有迭代器遍历集合的操作方法，
 * 我们不需要关心具体集合提供的迭代器实现类的名字，
 * 只要以多态的角度当他们是Iterator即可。
 * 
 * 迭代器遍历集合遵循的步骤是：问，取，删
 * 其中删除元素不是必须操作
 * @author soft01
 *
 */
public class IteratorDemo {

	public static void main(String[] args) {
		Collection c = new ArrayList();
//		Collection c = new HashSet();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		c.add("#");
		c.add("five");
		System.out.println(c);
		Iterator it = c.iterator();
		/*
		 * boolean hasNext()
		 * 判断集合是否还有元素可以遍历
		 * 
		 * E next()
		 * 获取集合下一个元素
		 */
		while(it.hasNext()) {
			String str = (String)it.next();
			System.out.print(str+" ");
			if("#".equals(str)) {
				/*
				 * 迭代器有一个要求，在遍历的过程中
				 * 不可以通过集合的方法增删元素
				 */
//				c.remove(str);
				/*
				 * 迭代器也提供了remove方法
				 * 删除的是通过next方法遍历的元素
				 */
				it.remove();
			}
		}
		System.out.println();
		System.out.println(c);
	}

}

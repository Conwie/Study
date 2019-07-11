package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * boolean contains(Object o)
 * 判断当前集合是否包含给定元素.
 * @author soft01
 *
 */
public class CollectionDemo2 {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(5,6));
		c.add(new Point(7,8));
		/*
		 * 集合重写了toString方法,而每个元素输出
		 * 时是利用元素自身toString返回的字符串
		 * 进行输出的.
		 */
			System.out.println(c);
			
			Point p = new Point(1,2);
			/*
			 * 是否包含是根据元素equals比较的结果而定的
			 */
			System.out.println("包含:"+c.contains(p));
	}

}

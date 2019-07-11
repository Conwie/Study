package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 删除集合元素
 * @author soft01
 *
 */
public class CollectionDemo3 {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(5,6));
		c.add(new Point(7,8));
		c.add(new Point(1,2));
		System.out.println(c);
		
		Point p = new Point(1,2);
		/*
		 * remove方法也是依靠元素自身equals比较结果进行删除的.
		 */
		c.remove(p);
		System.out.println(c);
	}

}

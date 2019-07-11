package collection;

import java.util.Collection;
import java.util.HashSet;

/**
 * java.util.Collection 集合框架
 * Collection是所有集合的顶级接口，定义了所有集合
 * 都应当具备的操作。
 * 
 * 集合和数组一样，用来保存一组元素，其提供了便于操作
 * 集合的相关方法，使用更方便
 * 
 * 常见的子接口：
 * java.util.List:可重复集合，并且有序
 * java.util.Set:不可重复集合
 * 元素是否重复的标准是依靠元素自身equals比较的结果
 * @author soft01
 *
 */
public class CollectionDemo1 {

	public static void main(String[] args) {
//			Collection c = new ArrayList();
			Collection c = new HashSet();
			/*
			 * boolean add(E e)
			 * 向集合中添加给定元素，若成功添加则返回true
			 */
			System.out.println(c.add("Aa"));
			System.out.println(c.add("Aa"));
			c.add("Bb");
			c.add("Cc");
			c.add("Dd");
			c.add("Ee");
			System.out.println(c);
			int size = c.size();
			System.out.println(size);
			c.add("Ff");
			System.out.println(c.size());
			/*
			 * boolean isEmpty()
			 * 判断当前集合是否为空集
			 */
			System.out.println("是否为空集:"+c.isEmpty());
			/*
			 * void clear()
			 * 清空集合
			 */
			c.clear();
			System.out.println(c);
			System.out.println("是否为空集:"+c.isEmpty());
	}

}

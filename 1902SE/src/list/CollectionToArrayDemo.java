package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 将一个集合转换为数组
 * Collection提供了将当前集合转换为数组的方法：toArray
 * @author soft01
 *
 */
public class CollectionToArrayDemo {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
		
		//Object[] array = c.toArray();
		String[] arr = c.toArray(new String[c.size()]);
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
	}
}

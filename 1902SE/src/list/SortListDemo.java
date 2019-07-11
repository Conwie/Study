package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


/**
 * List集合的排序
 * 
 * 集合的工具类：java.util.Collections
 * 其提供了很多便于操作集合的方法，其中有一个sort方法
 * 用来对List集合进行自然排序（从小到大）
 * @author soft01
 *
 */
public class SortListDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		/*
		 * 向集合中存放10个随机数（0-100之间）
		 */
		Random rd = new Random();
		for(int i=0;i<10;i++) {
			int num = (rd.nextInt(100));
			list.add(num);
		}
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		//乱序
		Collections.shuffle(list);
		System.out.println(list);
		
	}

}

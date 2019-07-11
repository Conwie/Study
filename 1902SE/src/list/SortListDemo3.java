package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class SortListDemo3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		/*
		 * 向集合中存放10个随机数
		 */
		Random rd = new Random();
		for(int i=0;i<10;i++) {
			list.add(rd.nextInt(100));
		}
		System.out.println(list);
		/*
		 * 按照数字从大到小排序
		 * 需要提供一个比较器
		 */
		Collections.sort(list, new Comparator<Integer>() {

			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		});
		System.out.println(list);
	}

}

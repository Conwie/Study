package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 排序自定义类型元素
 * @author soft01
 *
 */
public class SortListDemo2 {

	public static void main(String[] args) {
		List<Point> list = new ArrayList<>();
		list.add(new Point(2,4));
		list.add(new Point(12,2));
		list.add(new Point(3,17));
		list.add(new Point(5,7));
		list.add(new Point(3,8));
		list.add(new Point(1,8));
		System.out.println(list);
		/*
		 * sort方法在排序集合时，要求集合元素必须
		 * 实现接口：Comparable，否则编译不通过.
		 * java提供的类，比如包装类，String都实现了
		 * Comparable接口，可以直接使用。
		 * 但是在排序自定义类型元素时不推荐这样做。
		 */
//		Collections.sort(list);
		/*
		 * Collections提供了一个重载的sort方法：
		 * void static sort(List list,Comparator c)
		 * 该方法要求我们再传入一个参数，是一个比较器，
		 * 此方法会利用这个比较器来比较集合元素并按照比较
		 * 结果从小到大排序。
		 */
		Collections.sort(list,new Comparator<Point>() {
			/**
			 * 定义比较规则：
			 * 当返回值>0:o1大于o2
			 * 当返回值<0:o1小于o2
			 * 当返回值=0:o1等于o2
			 */
			public int compare(Point o1, Point o2) {
				int len1 = o1.getX()*o1.getX()+o1.getY()*o1.getY();
				int len2 = o2.getX()*o2.getX()+o2.getY()*o2.getY();
				return len1 - len2;
			}
			
		});
		System.out.println(list);
	}

}

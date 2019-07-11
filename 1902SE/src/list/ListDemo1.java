package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * java.util.List  线性表
 * List是Collection常用的子接口，是一个可重复集合
 * 并且有序，其单独提供了一套可以通过下标操作元素的方法。
 * 常用实现类：
 * java.util.ArrayList:
 * 使用数组实现，查询效率好，增删元素慢
 * 
 * java.util.LinkedList:
 * 使用链表实现，增删元素效率好（首尾增删元素最快），
 * 查询效率慢
 * 
 * 在对性能没有特别苛刻的要求时通常用ArrayList
 * @author soft01
 *
 */
public class ListDemo1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println(list);
		/*
		 * E get(int index)
		 * 获取指定下标对应的元素
		 */
		String str = list.get(1);
		System.out.println(str);
		//普通for循环可以遍历List集合
		for(int i=0;i<list.size();i++) {
			 str = list.get(i);
			 System.out.println(str);
		}
		/*
		 * E set(int index,E e)
		 * 将给定元素设置到指定位置，返回值为原位置对应元素
		 */
		//[one,2,three,four,five]
		str = list.set(1, "2");
		System.out.println(list);
		
		/*
		 * 在不创建新集合的前提下，
		 * 将list集合元素倒序
		 */
		//[five,four,three,2,one]
		for(int i=0;i<list.size()/2;i++) {
			str = list.get(i);
			str = list.set(list.size()-1-i, str);
			list.set(i, str);
		}
		System.out.println(list);
	}

}

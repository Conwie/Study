package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 有参方法
 * @author soft01
 *
 */
public class LambdaDemo2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("苍老师");
		list.add("传奇");
		list.add("小泽老师");

//		Comparator<String> c = (o1,o2)->{
//			return o1.length()-o2.length();
//		};
		/*
		 * 如果可以省略{}，那么方法有return关键字
		 * 时该关键字也必须省略。
		 */
		Comparator<String> c = (o1,o2)->
				o1.length()-o2.length();
		
		Collections.sort(list, c);
		System.out.println(list);
	}
}

package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * 排序字符串
 */
public class SortListDemo4 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("张无忌");
		list.add("金毛狮王");
		list.add("赵敏");
		list.add("周芷若");
		System.out.println(list);
		/*
		 * String已经实现了Comparable接口，定义的
		 * 比较规则时按照字符的unicode编码大小比较
		 * 对于排序中文时没有什么效果。
		 */
		Collections.sort(list);
		//定义一个比较器，按照字符多少排序
		Collections.sort(list, new Comparator<String>() {

			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}
		});
		System.out.println(list);
	}

}

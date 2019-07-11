package regex;

import java.util.Arrays;

public class Demo10 {

	public static void main(String[] args) {
		/*
		 * split
		 * String[] arr = contect.split(分隔符规则)
		 * 如使用分隔符： ,\s
		 * 结果{"1","范传奇","110","fancq@tedu.cn"}
		 */
		String contect = "1, 范传奇, 110, fancq@tedu.cn";
		//按照分隔符“， ”劈开，获取全部信息
		//劈开以后，结果中没有分隔符
		String[] s = contect.split(",\\s");
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}

	}

}

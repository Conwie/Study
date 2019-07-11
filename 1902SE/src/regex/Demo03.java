package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo03 {

	public static void main(String[] args) {
		/*
		 * 正则规则
		 * 1.字符集：约定字符范围
		 * 	[0123456789]  一个字符其范围0～9
		 * 2.如果连续的字符可以使用-
		 * 	Hello[0-9]
		 * 	P[a-z]
		 * 	P[A-Z]
		 * 	P[A-Za-z]
		 * 3.缩写的字符集，用特定符号代表一个字符范围，可以简化正则的书写
		 * [0-9]可以缩写为\d
		 * [~[0-9]] 代表不是数字\D
		 */
		Pattern p = Pattern.compile("匪兵[甲乙丙丁]");
		String str = "英雄来了手撕匪兵甲，匪兵乙遁去";
		Matcher m = p.matcher(str);
		boolean b =m.find();
		System.out.println(b);
		System.out.println(m.start());
		System.out.println(m.end());
		System.out.println(m.group());
		//查找下一个
		m.find();
		System.out.println(b);
		System.out.println(m.start());
		System.out.println(m.end());
		System.out.println(m.group());
		//\d
		Pattern p1 = Pattern.compile("Hello\\d");
		String str1 = "Hey,Hello5";
		Matcher m1 = p1.matcher(str1);
		boolean b1 = m1.find();
		System.out.println(b1);
		System.out.println(m1.start());
		System.out.println(m1.end());
		System.out.println(m1.group());
	}

}

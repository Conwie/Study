package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo02 {
	public static void main(String[] args) {
		/*
		 * 区别find和matches
		 */
		//1.创建正则规则
		Pattern p = Pattern.compile("Hello");
		//2.检测目标文本str
		String str = "Hello";
		Matcher m = p.matcher(str);
		//3.处理检测结果哦，整体检测
		//如果str的整体符合规则"Hello"则返回true
		boolean b = m.matches();
		System.out.println(b);//true
	}
}

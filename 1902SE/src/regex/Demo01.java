package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo01 {

	public static void main(String[] args) {
		/*
		 * 正则表达式
		 * 1.本身是一个字符串
		 * 2.用于规定目标字符串的规则
		 * 3.经常用于检测文本字符串的文本规则
		 * 4.很多开发工具和操作系统编程语言都支持正则表达式
		 * Eclipse vim/vi Linus Java PHP Python ...
		 */
		//如：正则"Hello"规定了规则是一共5个字符，其出现的顺序是Hello
		
		//使用Java提供的API处理正则表达式
		//1.解析正则表达式规则为一个Pattern对象
		Pattern p = Pattern.compile("Hello");
		//2.检测目标字符串文本
		String str = "今天是个好日子!HelloWorld!";
		//matcher方法：用p代表的规则检测str中哪些文字符合规则。
		//m代表检测的结果
		Matcher m = p.matcher(str);
		//3.处理检测结果：是否找到，以及找到位置
		boolean b = m.find();
		//显示是否找到
		System.out.println(b);
		//显示找到的位置
		System.out.println(m.start());
		System.out.println(m.end());
		//显示找到的结果
		System.out.println(m.group());//Hello
	}

}

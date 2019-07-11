package regex;

public class Demo09 {

	public static void main(String[] args) {
		/*
		 * String中的正则API
		 * 1.matches()方法，底层就是正则API
		 * matches方法。
		 *   2.功能一样，都是对字符串整体进行规则匹配
		 *   3.相对于正则matches()方法，String的matches()使用更加简便。
		 *   
		 *   案例：检查用户名是否8～10个单词字符
		 */
		String name = "Jerry666";
		String reg = "^\\w{8,10}$";
		//检查name的整体是否符合reg规则的方法
		boolean b = name.matches(reg);
		System.out.println(b);
		//String的matches()方法只做规则检查
		//不返回匹配结果，如果需要匹配结果请使用
		//Java 正则API

	}

}

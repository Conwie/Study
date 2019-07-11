package regex;

public class Demo06 {

	public static void main(String[] args) {
		/*
		 * 匹配jar文件名规则
		 * 多个单词字符.jar
		 * jar文件：\w+\.jar
		 * 
		 * >特殊字符：使用转义，如：\.用于匹配
		 * 
		 * 数量词：
		 * x{n}  x必须出现n次
		 * x{n,m} x至少出现n次，最多m次
		 * x{n,}  x出现最少n次，最多不限
		 */
		String text = "root_234.txt,plane_.jar,king_1.jar,conwie.png,jerry.jar,spring.jar,mybatis.jar";
		
		String reg = "\\w+\\.jar";
		Utils.test(reg, text);
		//错误的正则："."可以匹配到任何字符
	  reg = "\\w+.jar";
		Utils.test(reg, text);
		//抓取全部的文件名
		reg = "\\w+\\.\\w{3,4}";
		Utils.test(reg, text);
		
		//抓取以“——数字”为结尾的文件
		//1.\\w以一个以上的单词字符为开头
		//2._用于匹配下划线
		//3.\\d*数字可以没有或更多个数字
		//4.\\.jar匹配.jar
		reg = "\\w+_\\d*+\\.jar";
		Utils.test(reg, text);
	}

}

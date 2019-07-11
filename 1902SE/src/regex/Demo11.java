package regex;

public class Demo11 {

	public static void main(String[] args) {
		/*
		 * 演示：过滤文本中的敏感词，将敏感词全部替换为*
		 * 替换字符串str的被正则匹配的文本为“替换文本”
		 * str.replaceAll(正则，替换文本)
		 * 
		 * str.replaceAll("我[草去]","**");
		 */
		String text = "我草，这么牛B！";
		String regex = "[草]|[B]";
		String newText = text.replaceAll(regex, "*");
		System.out.println(newText);
	}

}

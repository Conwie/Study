package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 正则测试工具类
 */
public class Utils {
	/*
	 * 正则表达式测试工具方法
	 * @param regex 正则表达式
	 * @param text 被检测的文本
	 */
	public static void test(String regex,String text) {
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(text);
		while(m.find()) {
			int start = m.start();
			int end = m.end();
			String str = m.group();
			System.out.println("在"+start+"到"+end+" 找到："+str);
		}
	}
}

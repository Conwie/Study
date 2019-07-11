package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo07 {
	public static void main(String[] args) {
		/*
		 * 从一个收到货地址中获得手机号码
		 */
		String address = "北京海淀区北三环西路甲18号，中鼎大厦B座7层达内，"
											+ "流川枫 0086 15665478964"
											+ "+86 15665478964"
											+ "008615665478964"
											+ "15665478964收";
		//()表示分组
		//| 表示或者
		//？表示可有可无
		String regex = "(\\+86|0086)?\\s?1\\d{10}";
		Utils.test(regex, address);
/*		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(address);
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
		}*/
	}
}

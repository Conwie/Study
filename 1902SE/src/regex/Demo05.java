package regex;

import homework.RegExUtils;

public class Demo05 {
	public static void main(String[] args) {
		/*
		 * 从一个收到货地址中获得手机号码
		 */
		String address = "北京海淀区北三环西路甲18号，中鼎大厦B座7层达内，"
											+ "流川枫 15665478964收";
		String reg = "1\\d{10}";
		Utils.test(reg, address);
	}
}

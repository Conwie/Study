package regex;

public class Demo04 {

	public static void main(String[] args) {
		/*
		 * 测试数字字符集
		 */
		String reg = "Hello\\d";
		String text = "为什么不试试Hello1 Hello8 Hello9 Hello Kitty";
		Utils.test(reg, text);
	}

}

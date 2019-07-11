package string;

public class Demo10 {

	public static void main(String[] args) {
		/**
		 * 转换大小写
		 */
		String str = "您好Java";
		String s = str.toUpperCase();
		System.out.println(s);
		//转换小写
		s = str.toLowerCase();
		System.out.println(s);
		
		//经典用途：比较验证码
		//6e8H 与 6E8H比较，判断是否一致
		
		//直接比较：
		String code = "6e8H";
		String input = "6E8H";
		System.out.println(code.equals(input));
		//转小写比较编码是否一致
		System.out.println(code.equalsIgnoreCase(input));//忽略大小写进行比较
		System.out.println(code.toLowerCase().equals(input.toLowerCase()));
		//判断文件是否以png为结尾
		String file = "airplane.PNG";
		System.out.println(file.toLowerCase().endsWith(".png"));
	}

}

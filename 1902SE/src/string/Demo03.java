package string;

public class Demo03 {

	public static void main(String[] args) {
		String str = "您好Hello";
		int len = str.length();//7
		char c = str.charAt(1);
		System.out.println(c);//好
		System.out.println((int)c);//Unicode值
		c = str.charAt(3);
		System.out.println(c);//e
		System.out.println((int)c);
		int n = 0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
				n++;
			}
		}
		System.out.println(n);
	}

}

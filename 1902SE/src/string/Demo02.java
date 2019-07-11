package string;

public class Demo02 {
	public static String  S = "ABC";
	public static void main(String[] args) {
		/**
		 * String常量池
		 * 1.JAVA将静态字符串
		 * 		字面量“ABC”
		 * 		常量 static final String S;
		 * 		字面量常量的运算结果：'A'+"BC"
		 * 2.Java会将静态字符串的引用缓存到
		 * 	 Java常量池，在“一样”时候重用相同
		 *       字符串对象
		 *   3.动态字符串，不会被重用
		 *  new创建的字符串
		 *     字符串变量连接的结果
		 */
		  String s1 = "ABC";
		  String s2 = "ABC";
		  String s4 = 'A'+"BC";//字面量连接
		  String s5 = S;
		  String ss1 = "A";
		  String ss2 = "BC";
		  String s6 = ss1+ss2;//变量连接
		  String s3 = new String("ABC");//动态字符串
		  System.out.println(s1==s2);//true
		  System.out.println(s1==s3);//false
	}

}

package string;

public class Demo07 {

	public static void main(String[] args) {
		/*
		 * 去除字符串两端的空白
		 * 1.空白包含Unicode编码：0000～0020范围的字符，
		 * 这个范围都是控制字符（空白）
		 * 2.字符串中间的空白不会被去除
		 * 3.一定接收返回值，返回值才是去除空白以后的字符串副本
		 * 4.原字符串对象不变
		 */
		String str = "\t\n\tyou are pig \n\t";
		String ss = str.trim();
		System.out.println(ss);
		
		//trim方法经常用于处理用户表弹参数
		//过滤并且去除用户意外输入的空白
		String name = " Jerry ";
		name = name.trim();
		System.out.println(name);
	}

}

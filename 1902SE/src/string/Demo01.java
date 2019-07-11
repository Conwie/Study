package string;

public class Demo01 {

	public static void main(String[] args) {
		/*
		 * String对象是不可变的
		 * String类型的引用可以改变
		 */
		//str是String类型的引用，
		//"ABC"是String类型的对象
		String str = "ABC";
		String s = str;
		str += "CBD";
		System.out.println(str);
		System.out.println(s);
	}

}

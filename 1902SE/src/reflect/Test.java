package reflect;

public class Test {
	public static void main(String[] args) {
		dosome(50);
		dosome(70,"老人");
		dosome(40,"中年人");
		dosome(30,"年轻人","小伙子");
	}
	
	public static void dosome(int age,String... arg) {
		System.out.println(arg.length);
		for(String str : arg) {
			System.out.println(str);
		}
	}
}

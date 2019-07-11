package regex;

public class Demo08 {

	public static void main(String[] args) {
		/*
		 * 检查用户名规则
		 * ^匹配开头
		 * $匹配结尾
		 * 
		 * 提示：^$+find()方法相当于matches()方法
		 */
		String name = "Jerry924345r31422366666";
		String reg = "\\w{8,18}";
		System.out.println("正则："+reg+" name:"+name);
		Utils.test(reg, name);
		
		name = "Jerry23245";
		reg = "^\\w{8,18}$";
		System.out.println("正则："+reg+" name:"+name);
		Utils.test(reg, name);
	}

}

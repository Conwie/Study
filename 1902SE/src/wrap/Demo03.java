package wrap;

public class Demo03 {

	public static void main(String[] args) {
		/*
		 * Java中与人进行交互的核心方法，
		 * 被封装到包装类中
		 * 
		 * 一个简单理解：将字符串转换为基本数据类型
		 * 准确理解：实现人和计算机之间沟通桥梁
		 * 
		 * 1.将人类熟悉10进制字符串转换为，计算机
		 * 	内部能够处理的2进制（基本类型是2进制）
		 * 2.将计算机内部的2进制转换为人能够识别的
		 * 	10进制字符串。
		 * 3.一般情况下，这些方法都是自动调用。
		 * 	如果需要手动转换时候，就调用这些方法
		 * 	完成转换。
		 * 
		 * 	如果输入字符串无法完成转换会抛出异常
		 * 	NumberFormatException
		 */
		Boolean b = true;
		System.out.println(b.toString());
		
		String str = "886";
		//将10进制数字字符串转换为2进制int
		int n = Integer.parseInt(str);
		n++;
		//toString() 将2进制的int转换10进制字符串
		System.out.println(Integer.toString(n));
		
		double b1 = Double.parseDouble(str);
		System.out.println(Double.toString(b1));

	}

}

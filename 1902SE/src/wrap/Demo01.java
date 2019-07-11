package wrap;

public class Demo01 {

	public static void main(String[] args) {
		/*
		 * 包装类wrap class
		 * 
		 * 1.将基本类型数据包装为对象
		 * 2.基本类型不是对象，利用包装类将基本类型转换为对象，
		 * 可以将基本类型作为对象管理
		 * 3.java为了性能，设计了基本类型
		 * 	为了将基本类型转换为对象设计了包装类
		 */
		int n = 5;
		Integer i = new Integer(5);
		System.out.println(n);//5
		System.out.println(i);//5，重写toString
		
		//8种包装类
//		1.Byte byte
//		2.Short short
//		3.Integer int
//		4.Long long
//		5.Float float
//		6.Double double
//		7.Boolean boolean
//		8.Character char
		
		/*
		 * 数值类型Byte,Short,Integer,Long,Float,Double
		 * 的父类型是Number
		 * 
		 * 1.Java将数值类型的公共方法定义在Number类型上。
		 * 2.Number类型上定义了数值类型相互转换的方法。
		    * 3.与基本类型类似，转换类型时候会发生精度损失，
		 * 	  或者溢出现象。
		    * 4.也可以获取当前包装类型对象中的值
		 */
		Double d = new Double(2.5);
		//intValue 将d中的数据转换为int值
		int num = d.intValue();
		System.out.println(num);//2
		Byte b = new Byte((byte)2);
		//intValue 将b中的数据转换为int值
		int num2 = b.intValue();
		System.out.println(num2);//2
		
		Integer num3 = new Integer(6);
		//doubleValue 将num转换为double类型
		double num4 = num3.doubleValue();
		System.out.println(num4);//6.0
		
		//将num中包装的数据取出来赋值到k
		int k = num3.intValue();
		System.out.println(k);//6
		
		//longValue  将num5转换为long类型
		Double num5 = new Double(6.6);
		long num6 = num5.longValue();
		System.out.println(num6);//6
		Long num7 = new Long(888l);
		double num8 = num7.doubleValue();
		System.out.println(num8);//888.0
	}

}

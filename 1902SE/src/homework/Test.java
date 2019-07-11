package homework;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws ParseException {
/*		Emp e = new Emp("张三",26, 'm',5600);
		Emp e2 = new Emp("张三",27, 'm',7500);
		System.out.println(e.toString());
		System.out.println(e.equals(e2));*/
		
		//用户输入一个数字，判断是浮点数还是整数
		Scanner sc = new Scanner(System.in);
/*		
		String input = sc.nextLine();
		String IntReg = "\\d+";
		String DoubleReg = "\\d+\\.\\d+";
		if(input.matches(IntReg)) {
			System.out.println("这是一个整数："+input);
		}else if(input.matches(DoubleReg)) {
			System.out.println("这是一个小数："+input);
		}else {
			System.out.println("数字格式不正确！");
		}*/
		//用户输入商品生产日期和保质期，通过程序计算促销日期。
		//计算规则为：到保质期前14天所在周的周三为促销日。
		System.out.println("请输入生产日期：（yyyy-MM-dd）");
		String inputDate = sc.nextLine();
		System.out.println("请输入保质期：");
		int days = sc.nextInt();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(inputDate);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.DAY_OF_YEAR, days);
		c.add(Calendar.DAY_OF_YEAR, -14);
		c.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		Date newDate =c.getTime();
		String strDate = sdf.format(newDate);
		System.out.println("促销日期为："+strDate);
	}
}

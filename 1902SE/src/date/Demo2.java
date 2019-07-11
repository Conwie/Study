package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 计算商品促销日期
 * 程序启动后要求输入一个商品的生产日期：yyyy-MM-dd
 * 然后再输入一个数字表示保质期的天数。
 * 经过程序计算，输出该商品的促销日，格式同上。
 * 
 * 计算规则：商品过期日前两周的周三
 * @author soft01
 *
 */
public class Demo2 {
	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入商品生产日期   格式：yyyy-MM-dd");
		String pDate = sc.nextLine();
		
		System.out.println("请输入商品的保质期： （天数）");
		int days = Integer.parseInt(sc.nextLine());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(pDate);
		//使Calendar表示生产日期
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		//调整为促销日
		//计算过期日
		calendar.add(Calendar.DAY_OF_YEAR, days);
		//计算促销日
		calendar.add(Calendar.DAY_OF_YEAR, -14);
		//设置为当周周三
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		//转换日期格式为"yyyy-MM-dd"
		Date newDate = calendar.getTime();
		String sDate = sdf.format(newDate);
		
		System.out.println("促销日为："+sDate);
	}
}

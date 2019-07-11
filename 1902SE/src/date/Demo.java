package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 编写一段程序：
 * 用户在控制台输入自己的生日，格式如：yyyy-MM-dd
 * 然后经过程序计算，输出到今天为止一共活了多少天。
 * 再输出其出生10000天的纪念日是哪天，格式同上。
 * 
 * @author soft01l
 *
 */
public class Demo {
	public static void main(String[] args) throws ParseException {
	
			Scanner sc = new Scanner(System.in);
		System.out.println("请输入自己的生日：  格式如：yyyy-MM-dd");
		String input = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birthday = sdf.parse(input);
		Date now = new Date();
		long time = now.getTime()-birthday.getTime();
		long days = time/1000/60/60/24;
		System.out.println("到今天为止，您一共活了"+days+"天！");
		time = birthday.getTime()+10000l*24*60*60*1000;
		Date date = new Date(time);
		String dateStr = sdf.format(date);
		System.out.println("您出生10000天后的纪念日为："+dateStr);
	}
}

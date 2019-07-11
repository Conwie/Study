package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 * 可以按照指定的日期格式在Date与String只见相互转换。
 * @author soft01
 *
 */
public class SimpleDateFormatDemo1 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		/*
		 *  2019-04-25      10:25:33
		* yyyy-MM-dd HH:mm:ss
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a E");
		/*
		 * String format(Date date)
		 * 将给定的Date对象按照SDF指定的日期格式转换为字符串
		 */
		String str = sdf.format(date);
		System.out.println(str);
	}
}

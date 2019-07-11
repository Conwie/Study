package date;

import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calendar 日历类
 * Calendar是一个抽象类，定义了操作时间的一系列方
 * 法。常用实现类：GregorianCalendar,即：阳历
 * 
 * Calendar提供了静态方法getInstance,可以根据当前
 * 系统所在地区获取一个适用的实现类的实例，大部分获取
 * 的都是阳历。
 * @author soft01
 *
 */
public class CalendarDemo1 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		/*
		 * 将当前Calendar表示的日期以Date实例形式返回。
		 */
		Date date = calendar.getTime();
		System.out.println(date);
		
		/*
		 * void setTime(Date date)
		 * 调整Calendar表示给定的Date对象所表示的日期
		 */
		calendar.setTime(date);
	}
}

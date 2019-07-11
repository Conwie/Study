package date;

import java.util.Calendar;

/**
 * void set(int field,int value)
 * 调整当前Calendar指定时间为给定的值
 * @author soft01
 *
 */
public class CalendarDemo3 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		/*
		 * 调整为2008-08-08 20:08:08
		 */
		calendar.set(Calendar.YEAR, 2008);
		calendar.set(Calendar.MONTH, Calendar.AUGUST);
		calendar.set(Calendar.DATE, 8);
		
		calendar.set(Calendar.HOUR_OF_DAY, 20);
		calendar.set(Calendar.MINUTE, 8);
		calendar.set(Calendar.SECOND, 8);
		System.out.println(calendar.getTime());
	}
}

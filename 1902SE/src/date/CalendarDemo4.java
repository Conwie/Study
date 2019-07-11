package date;

import java.util.Calendar;

/**
 * void add(int field,int amount)
 * 对指定时间分量加上给定的值，若给定的值为负数
 * 则是减去
 * @author soft01
 *
 */
public class CalendarDemo4 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		/*
		 * 3年2个月零25天以后是哪天？
		 */
		//加3年
		calendar.add(Calendar.YEAR, 3);
		
		//加2个月
		calendar.add(Calendar.MONTH, 2);
		
		//加25天
		calendar.add(Calendar.DATE, 25);
		
		System.out.println(calendar.getTime());
		
		//查看星期五为哪一天，设置成周五
		calendar.set(calendar.DAY_OF_WEEK, Calendar.FRIDAY);
		System.out.println(calendar.getTime());
	}
}

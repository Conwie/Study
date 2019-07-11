package date;

import java.util.Calendar;

/**
 * Calendar提供了获取指定时间分量对应值的方法:
 * int get(int field)
 * 
 * Calendar定义了大量的常量表示不同的时间分量。
 * @author soft01
 *
 */
public class CalendarDemo2 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		//获取年
		int year = calendar.get(Calendar.YEAR);
		
		//获取月（月从0开始，0表示1月，1表示2月...）
		int month = calendar.get(Calendar.MONTH)+1;
		
		/*
		 * 获取日
		 * 与“天”相关的时间分量
		 * DAY_OF_MONTH：月中的天
		 * DAY_OF_WEEK ：周中的天
		 * DAY_OF_YEAR ：年中的天
		 * DATE        ：月中的天
		 */
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"-"+month+"-"+day);
		
		int h = calendar.get(Calendar.HOUR_OF_DAY);
		int m = calendar.get(Calendar.MINUTE);
		int s = calendar.get(Calendar.SECOND);
		System.out.println(h+":"+m+":"+s);
		
		//今天是今年的第几天？
		int days = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("今天是今年的第"+days+"天");
		
		//今天是周几
		int dow = calendar.get(Calendar.DAY_OF_WEEK)-1;
		String[] data = {"日","一","二","三","四","五","六"};
		System.out.println("今天是周"+data[dow]);
		
		days =calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("今年共"+days+"天");
		
		days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("本月共"+days+"天");
	}
}

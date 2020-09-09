package api07.Date;

/**
 * @author : 김아름
 * @date   : 2020. 5. 14.
 * @description : java.util.Calendar
 */

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class CalendarEx {

	public static void main(String[] args) {
		
		Calendar today=Calendar.getInstance();
		System.out.println(today.toString());
		
		// 날짜-시간 바꿔야한다.
		Date date=today.getTime();
		System.out.println(date);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date));
		System.out.println("============================");
		
		int year=today.get(Calendar.YEAR);
		int month=today.get(Calendar.MONTH)+1;
		int day=today.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"\t"+month+"\t"+day);
		
		int hour=today.get(Calendar.HOUR);
		int minute=today.get(Calendar.MINUTE);
		int seconds=today.get(Calendar.SECOND);
		System.out.println(hour+"\t"+minute+"\t"+seconds);
		System.out.println("============================");
	}

}

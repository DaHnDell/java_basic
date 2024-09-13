package lesson12_api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarEx2 {
	public static void main(String[] args) {
		// 보통 날짜 관련 작업은 DB로.
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(new Date(cal.getTimeInMillis())));
		
		cal.add(Calendar.DATE, -10000);
		System.out.println(sdf.format(new Date(cal.getTimeInMillis())));
		
		cal.add(Calendar.MONTH, 200);
		System.out.println(sdf.format(new Date(cal.getTimeInMillis())));
		
		cal.roll(Calendar.DATE, 4);
		System.out.println(sdf.format(new Date(cal.getTimeInMillis())));
		
		// 달력 만들기..
	}
}

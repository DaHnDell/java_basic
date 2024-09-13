package Hw0913;

import static java.util.Calendar.DATE;
import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.ERA;
import static java.util.Calendar.MONTH;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class hw0913 {
	public static void main(String[] args) {
		// 달력 출력(최소 이번 달)
		// 이전달, 다음달, 이전해, 다음해, 특정 연 월 입력시 parse 사용해서 해당 연 월 달력 출력 
		
		Calendar cal = new GregorianCalendar();
		Date da = new Date(cal.getTimeInMillis());
		
		da.setTime(cal.getTimeInMillis()); // 데이트 시간을 캘린더 타입
		
		cal.setTimeInMillis(da.getTime());; // 스트링과 스트링 타입 처럼 캘린더와 데이트 사이의 관계는 에포크를 기준으로
		
		int year = cal.get(Calendar.YEAR);
		System.out.println((year));
		int month = cal.get(Calendar.MONTH);
		System.out.println((month));
		int date = cal.get(Calendar.DATE);
		System.out.println((date));
		
//		cal.Fir
		
		
	}
}

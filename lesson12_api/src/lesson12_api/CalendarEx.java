package lesson12_api;

import static java.util.Calendar.*; // 캘린더 필드에 있는 요소들에 직접적 접근ㅇ ㅣ가능.ㅣ
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarEx {
	public static void main(String[] args) {
		// 캘린더 클래스는 추상 클래스여서..
		
		Calendar cal = new GregorianCalendar();
//		Calendar cal2 = Calendar.getInstance(); // 겟인스턴스 써도 그레고리안이 생성됨
		
		Date date = new Date(cal.getTimeInMillis());
		date.setTime(cal.getTimeInMillis()); // 데이트 시간을 캘린더 타입
		
		cal.setTimeInMillis(date.getTime());; // 스트링과 스트링 타입 처럼 캘린더와 데이트 사이의 관계는 에포크를 기준으로 
		//상호작용 하기가 매우 적절함.
		
//		cal.getActualMaximum(); 특정 달의 데이트 최댓값, 즉 마지막 날의 데이트 값을 반환
		int year = cal.get(Calendar.YEAR);
		System.out.println((year));
		System.out.println(cal.get(MONTH));
		System.out.println(cal.get(DATE));
		System.out.println(cal.get(ERA));
		System.out.println(cal.get(DAY_OF_MONTH));
		System.out.println(cal.get(DAY_OF_WEEK));
		
//		setter 는 getter 보다 파라미터가 1개 더 많습니다. 당연한 것!
		cal.set(DATE, 15); // 일요일은 0일수도, 1일수도 있지만 일이 1일 경우 토는무조건 7
		System.out.println(cal.get(DAY_OF_WEEK));
		System.out.println(cal.get(DAY_OF_WEEK_IN_MONTH)); // 이 날이 이 달의 몇 번째 등장하였습니까?
		System.out.println(cal.get(ZONE_OFFSET) / 1000 / 60 / 60 );
	}
}

package Hw0913;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class hwCalCalcal {
	public static void main(String[] args) throws ParseException {
		Calendar cal = Calendar.getInstance(); // 인스턴스를 생성한 그 순간의 날짜 정보를 가지고 있음.
		// 달력에선 당연히 연과 월이 중요함. 나머지 일수는 연산을 통해 얻어진 결과물일 뿐.
		// 최소한 입력데이터가 연과 월이 되어야 함.  항상 시작날짜는 1이고 마지막 날짜에 다른 변경점만 존재함.
//		
		// 연월 마지막 날짜(연산을 통해) 시작 날짜의 요일(연산을 통해, 1일의 요일 구하기)
		
//		cal.set(Calendar.MONTH, 9);
		cal.add(Calendar.MONTH, 5); //  add 를 통해서 달의 값을 변경할 수 있음.
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		// 코딩 중간중간에 언제나 출력물을 확인해가면서 하기!
		System.out.println(year);
		System.out.println(month);
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		System.out.println(lastDate);
		cal.set(Calendar.DATE, 1); // 이 시점에서부터 24년 9월 1일의 값으로 날짜가 바뀜.
		int startDay = cal.get(Calendar.DAY_OF_WEEK); // 캘린더 값에서 요일 값으로 값 반환.
		System.out.println(startDay);
		//  (int i = 1 -startDay + 1; i <= lastDate; i++)
//		for(int i = 1-startDay +1; i <= lastDate; i++) {
//			System.out.printf("%4d", i); // 별찍기를 하듯이 언제 줄바꿈을 할지가 주요함
//			if(i % 7 == (7 -startDay + 1) % 7) {
//				System.out.println();
//			}
//			else {
//				System.out.println("   ");
//			}
//			if(i % 7 == 5) {
////				System.out.println();
//			}
			// 별찍기를 하듯이 빈칸의 삽입 요소와 그에 따른 조건의 추가적인 조치만 해주면 문제없음.
			// 마지막 날짜에 따른 반복문의 시작값을 추가로 조정해주는 방식이 매우 편리한 편임.
		
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("1.이전 2.다음 3.이전해 4.다음해 5.달지정(검색)");
			switch (Integer.parseInt(scanner.nextLine())) {
			case 1: {
//				cal.add(Calendar.MONTH, -1);
				cal.set(Calendar.MONTH, cal.get(Calendar.MONTH)-1);
				break;
			}
			case 2: {
//				cal.add(Calendar.MONTH, -1);
				cal.set(Calendar.MONTH, cal.get(Calendar.MONTH)-1);
				break;
			}
			case 3: {
//				cal.add(Calendar.MONTH, -1);
				cal.set(Calendar.MONTH, cal.get(Calendar.MONTH)-1);
				break;
			}
			case 4: {
//				cal.add(Calendar.MONTH, -1);
				cal.set(Calendar.MONTH, cal.get(Calendar.MONTH)-1);
				break;
			}
			case 5: {
				System.out.println("연도 입력 > ");
				cal.set(Calendar.YEAR, scanner.nextInt());
				System.out.println("월 입력 > ");
				cal.set(Calendar.MONTH, scanner.nextInt()-1);
				
				System.out.println("연도, 월을 입력해주세요 ex) 2024/09 > ");
				String str = scanner.nextLine();
				cal.setTime(new SimpleDateFormat("yyyy/MM").parse(scanner.nextLine())); 
				
				break;
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + scanner.nextInt());
			}
			printCal(cal);
		}
	}

	
	
	
	static void printCal(Calendar cal) {
		System.out.println(cal.get(Calendar.YEAR)+ " / " + cal.get(Calendar.MONTH)+1);
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		System.out.println(lastDate);
//		cal.set(Calendar.DATE, 1); // 이 시점에서부터 24년 9월 1일의 값으로 날짜가 바뀜.
		int startDay = cal.get(Calendar.DAY_OF_WEEK); // 캘린더 값에서 요일 값으로 값 반환.
		System.out.println(startDay);
		for(int i = 1-startDay +1; i <= lastDate; i++) {
			System.out.printf("%4d", i); // 별찍기를 하듯이 언제 줄바꿈을 할지가 주요함
			if(i % 7 == (7 -startDay + 1) % 7) {
				System.out.println();
			}
			else {
				System.out.println("   ");
			}
		}
		System.out.println();
	}
	
}

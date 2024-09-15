package Hw0913;

import static java.util.Calendar.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
//impory java.util.
import java.util.Scanner;

import student.StudentUtils;


public class hw0913 extends CalEx{
	public static void main(String[] args) {
		// 달력 출력(최소 이번 달)
		// 이전달, 다음달, 이전해, 다음해, 특정 연 월 입력시 parse 사용해서 해당 연 월 달력 출력 
		Calendar cal = new GregorianCalendar();
		// 그레고리안력 우리가 아는 표준 달력 형식으로 사용	
		int year = cal.get(YEAR);
		int month = cal.get(MONTH)+1;
		System.out.println(year + " : " + month);
//		CalEx calEx = new CalEx();
//		calEx.set(DATE, 1);
//		System.out.println("현재날짜는 " + sdf.format(new Date(cal.getTimeInMillis()))+ "입니다.");
//		System.out.println("========"+sdf.format(new Date(cal.getTimeInMillis()))+"월===========");
		int startDay = cal.get(DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(DAY_OF_MONTH);
		int input = 0;
		CalEx.printcal2(cal);
		while(true) {
			try {
				input = CalEx.nextInt("1. 이전달 2. 다음달 3. 이전해 4. 다음해 5. 날짜 검색  6. 종료");
				if(input < 1 || input > 6) {
					System.out.println("1~6 이내의 숫자를 입력하세요");
					continue;
				}
			}catch(NumberFormatException e) {
				System.out.println("숫자를 입력하세요");
				continue;
			}
			switch(input) {
			case 1: 
				cal.set(MONTH, cal.get(MONTH)-1);
				System.out.println();
				CalEx.printcal2(cal);
				break;
			case 2: 
				cal.set(MONTH, cal.get(MONTH) +1);
				CalEx.printcal2(cal);
				break;
			case 3: 
				cal.set(YEAR, cal.get(YEAR) -1);
				CalEx.printcal2(cal);
				break;
			case 4: 
				cal.set(YEAR, cal.get(YEAR) +1);
				CalEx.printcal2(cal);
				break;
			case 5: 
				int searchYear = nextInt("검색할 연도");
				int searchMonth = nextInt("검색할 달");
				cal.set(searchYear, searchMonth-1, 1);
				CalEx.printcal2(cal);
				break;
			case 6: 
				System.out.println("종료합니다.");
				return;
				
			default:
				break;
			}
			}
	}
}







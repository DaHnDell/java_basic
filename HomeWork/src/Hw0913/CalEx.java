package Hw0913;

import static java.util.Calendar.DATE;
import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.DAY_OF_WEEK;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalEx {
	Calendar cal = new GregorianCalendar();
	static int startDay;
	static int lastDay;
	int month;
	int year;
	
	public void setStartDay(int startDay) {
		startDay = cal.get(DAY_OF_WEEK);
		CalEx.startDay = startDay;
	}
//
	public void setLastDay(int lastDay) {
		lastDay = cal.getActualMaximum(DAY_OF_MONTH);
		CalEx.lastDay = lastDay;
	}
	
	public static void printcal2(Calendar cal) {
		
		cal.set(DATE, 1);
		
		int startDay = cal.get(DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(DAY_OF_MONTH);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
		System.out.println("========"+sdf.format(new Date(cal.getTimeInMillis()))+"월===========");
		System.out.printf("%-2c %-3c %-3c %-3c %-3c %-3c %-3c\n", '일', '월', '화', '수', '목','금','토');
		
		for(int i = 1; i < startDay; i++) { // 첫째날까지의 공백을 출력
			System.out.print("    ");
		}
		int cnt = startDay;
		for(int i = 1; i <= lastDay; i++) {
			if(cnt == 8) {
				System.out.println();
				cnt = 1;
			}
			System.out.printf("%02d  ", i);
			cnt++;
		}
		System.out.println();
		System.out.println("===========================");
		System.out.println();
	}
	
	
	static Scanner scanner = new Scanner(System.in);
		
		static String nextLine(String msg) {
			System.out.println(msg);
			System.out.print("> ");
			return scanner.nextLine();
		}
		static int nextInt(String msg) {
			return Integer.parseInt(nextLine(msg));
		}
	
}

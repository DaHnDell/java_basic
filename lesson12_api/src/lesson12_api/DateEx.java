package lesson12_api;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		// Date 1.0
		// Calendar 1.1
		
		// 특정 날짜 및 시간 + 30일
		
//		Date date = new Date();
////		System.out.println(date);
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy - MM - dd HH : mm : ss");
//		System.out.println(sdf.format(date));
//		
//		long target = date.getTime() + (3000L * 24 * 60 * 60 * 1000);
//		System.out.println(new Date(target));
////		System.
		
		Date christ = new Date(123, 11, 25, 00, 00, 00); // DATE는 언제나 Epoch 값을 활용을 하거나 long 값을 활용할 때 
		System.out.println(christ);
//		System.out.println(christ.get()); // 요일 자체의 값(월화수목금토일)은 바꿀 수 없다. 즉, setDay 함수는 없다.
		
	}
}

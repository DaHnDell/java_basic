package lesson12_api;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatEx {
	public static void main(String[] args) throws ParseException {
		// format = 원시 > 문자열
		// parse = 언제나 parsed 예외 유발. 문자열 > 원시
		double[] scores = {90.555, 80.6666, 70.7777, 60.6666, 50.5};
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println(df.format(scores[i]));
		}
		
		Number number = df.parse("9,99.99989999"); // 해석할 수 있을 때 까지만 해석함.
		System.out.println(number);
		double dou = number.doubleValue();
		System.out.println(dou);
	}
}	

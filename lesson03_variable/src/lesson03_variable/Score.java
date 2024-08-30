package lesson03_variable;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
//		char deco_1 = '=';		
		Scanner scanf = new Scanner(System.in);
		System.out.println("이름은?"); String name = scanf.nextLine();
		System.out.println("국어점수는?"); int kor = scanf.nextInt();
		System.out.println("수학점수는?"); int mat = scanf.nextInt();
		System.out.println("영어점수는?"); int eng = scanf.nextInt();
		
		int total = kor + mat + eng;
		// 평균 소수점 둘째자리로 반올림
		double avg = ((total / 3.0)*100 + 0.5)/100;
		
		System.out.println(avg);
		
//		System.out.println((char)((deco_1)*34));
		System.out.println("==================================");
		System.out.println("이름  국어  영어  수학  총점  평균");
		System.out.println("==================================");
		System.out.printf("%-4s %4d %4d %6d %6d %4.2f", name, kor, eng, mat, total, avg);
		
		
	}
}

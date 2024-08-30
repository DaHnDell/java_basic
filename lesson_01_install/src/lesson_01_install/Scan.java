package lesson_01_install;

import java.util.Scanner;

public class Scan {
	public static void main(String[] args ) {
		Scanner scanner = new Scanner(System.in); // 예외처리를 강제하는 프로그램이라 이렇게 하는게 편함.
		int num = scanner.nextInt();
		
		System.out.println(num * num);
	}

}

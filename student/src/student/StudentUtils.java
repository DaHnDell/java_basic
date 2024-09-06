package student;

import java.util.Scanner;

public class StudentUtils {
	// 문자열 입력
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

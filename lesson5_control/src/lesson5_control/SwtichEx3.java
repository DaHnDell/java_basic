package lesson5_control;

import java.util.Scanner;

public class SwtichEx3 {
	public static void main(String[] args) {
		// 가 = 1 바 = 2 보 = 3
		// 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위(1), 바위(2), 보(3) 중에 하나를 선택하세요");
		int me = scanner.nextInt();
		
		int com = (int)(Math.random()*3)+1;
		
		switch(me - com) {
		case -2 : case 1 : {
			System.out.println("win!");
			break;
		}
		case 0 : {
			System.out.println("Draw!");
			break;
		}
		default : 
			System.out.println("lose");
		}
		System.out.println("나의 선택 : "+me+"컴퓨터의 선택 : "+com);
		// 맨 앞자리 숫자부터 각각 2, 3, 4, 5, 6, 7, 8, 9 를 곱하고 다음에는 다시 2, 3, 4, 5 로 곱한다.
		// 그리고 위 값을 모두 더하고 11로 나누어 나머지 값을 구하고, 나머지 값을 뺀 숫자에서 남은 것이 
		// 검증코드이다.
	}
}

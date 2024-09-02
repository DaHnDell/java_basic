package lesson5_control;

import java.util.Scanner;

public class WhileEx3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		scanner.nextLine(); //String  타입으로 입력을 받음. 콘솔 자체적인 버그 때문에..
		
		int sum = 0; // 초기화
		boolean flag = true; // 반복 여부의 판단
		while (flag) {
			System.out.println("input num >> ");
			String input = scanner.nextLine();
			int num = Integer.parseInt(input);
			sum += num;
			if (num == 0) {
				flag = false; // 조건판별 하기 싫으면(불린값으로) 그냥 break 문 넣으면 됨 
			}
		}
		System.out.println("sum = "+ sum);
	
		scanner.close();
	}
}

package lesson5_control;

import java.util.Scanner;

public class WhileEx2 {
	public static void main(String[] args) {
		//   정수값을 입력받습니다. 이후 각 자릿수의 합계를 구합니다.
		
		Scanner scanner = new Scanner(System.in);
		
		int num = 123123; // 12  
		int sum = 0;
		

	
//		while(num !=0) {
//			sum += num % 10; 
//			num /= 10;
//		}

//		for (num = 123123; num >= 0; num /=10)
//		{
//			sum += num %10;
//			System.out.println(sum);
//		
//			
//		}
//		
		for(;num !=0;) {
			sum += num%10;
		}
		
		
		
	}
}

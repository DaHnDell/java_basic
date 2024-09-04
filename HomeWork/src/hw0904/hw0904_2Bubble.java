package hw0904;

import java.util.Arrays;
import java.util.Scanner;

public class hw0904_2Bubble {
//	public static void main(String[] args) {
//	
//		int money = 123456;
//		// 얼마짜리가 얼마나 쓰였느냐에 대한 것
//		int[] units = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1}; // 가능하다면 이 부분도 반복문으로 만들어 볼것
//		int[] counts = new int[10];
//		int tmp = 0;
//		
//		for(int i =0; i < units.length; i++) {
//			counts[i] = money / units[i];
//			money = money % units[i];
//			System.out.println(Arrays.toString(counts));
//		}
//	}
	// 지폐 및 동전 세기 
	// 초기 연산자 문제의 응용
		
		
	//{2, 2, 0, 3, 0, 4, 1, 0, 1, 1};
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 2. 사용자 ui를 사용해서, 사람 이름을 입력받습니다. Scanner 사용~ 계속 받습니다. 무한으로! while(boolean) 값 , String
	// 입력 글자 중, q를 입력하면 입력이 종료됩니다.
	// 사람 이름들을 문자열 배열으로 만들어서 프로그램 종료직전, 확인할 수 있도록 합니다. ~~ 아마 count 값을 이용해서 배열의 길이에 넣고 선언하는 식으로 ..?
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String nameIn = "";
////		boolean flag = true;
//		int count = 0;
//		
////		int count = 0;
////		while (flag) {
////			count++;
////			nameIn = scan.nextLine();
////			
////			String[] name = new String[count];
////			
////		}
//		
//		int a = 10;
//		String[] name = new String[a];
//		
//		for(int i = 0; i < 10; i++) {
//			count++;
//			nameIn = scan.nextLine();
//			String[] tmp = new String[count];
//			tmp[i] = nameIn;
//			name[i] = tmp[i];
//			System.out.println(Arrays.toString(name));
////			System.out.println(Arrays.toString(tmp));
////			if(name[i] == ) {
////				break;
////			}
//			
//		}
//	}
		Scanner scan = new Scanner(System.in);
		String endQ = new String("q");
		String nameIn = " ";
		
		while(nameIn != endQ) {
			nameIn=scan.nextLine();	
			System.out.println(nameIn);
			
		}
		
	}
}

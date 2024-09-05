package hw0904;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.reflect.Array;


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
//			money = money % units[i]; // money %= units[i];
//			System.out.print(Arrays.toString(counts)+" ");
//		}
	/* for (int i = 0; i < counts.length; i++){
	 *  System.out.printf("%d 원 짜리가 %d" + (unit[i] >=1000 ? "장" : "개") + "\n", unit[i], counts[i]); //  짧은 형태의 출력문일수록 3항연산자를 고려해 보자.
	 * 
	 * }
	
	
	*/
//	}
	// 지폐 및 동전 세기 
	// 초기 연산자 문제의 응용
		
		// 어려우면 언제나 리터럴값을 이용해서 값을 분석합니다.
	// 수식을 만들 때..
	//{2, 2, 0, 3, 0, 4, 1, 0, 1, 1};
	
	
	// 2. 사용자 ui를 사용해서, 사람 이름을 입력받습니다. Scanner 사용~ 계속 받습니다. 무한으로! while(boolean) 값 , String
	// 입력 글자 중, q를 입력하면 입력이 종료됩니다.
	// 사람 이름들을 문자열 배열으로 만들어서 프로그램 종료직전, 확인할 수 있도록 합니다. ~~ 아마 count 값을 이용해서 배열의 길이에 넣고 선언하는 식으로 ..?
//	public static void main(String[] args) {
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
//		Scanner scan = new Scanner(System.in);
//		String endQ = new String("q");
//		String nameIn = " ";
//		
//		while(nameIn != endQ) {
//			nameIn=scan.nextLine();	
//			System.out.println(nameIn);
//			
////		}
//		
//	}
//}
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in); //객체 이름은 클래스 이름의 카멜형 첫 소문자를 이용한 표현을 해보자
			String nameIn = ""; 
			int count = 0;
			String[] tmp = null; //배열 이름은 배열 자료형의 복수형(s)를 사용해서 자동완성 시켜주기도 함.
			String[] putCopy = new String[2];

			while(true) { // 인덱스가 필요할 때는 for 문이 최적값임
				// for(int i = 0;; i++)
//				while(!(nameIn.equals("q"))) {
				nameIn = scan.nextLine(); // 콘솔 특성상 nextLine을 사용하는 것이 좋음
				System.out.println(nameIn + " 을 입력하였습니다.");
				if (nameIn.equals("q")) {
					System.out.println("입력했던 값들을 반환합니다.");
					for(int i = 0; i < count; i++) { // s가 null일 때 출력하지 않는 식으로, 가능
						// for(String s : strings){
						// if(s==null){ break; }
						// }
						System.out.print(putCopy[i]+" ");
					}
					break;
					/*for(String s : strings){
					 * 	
					 * }
					*/
				}
				count++;
				tmp = new String[count];
				tmp[count-1] = nameIn;
//				System.out.println("tmp : " + Arrays.toString(tmp));
//				System.out.println("cnt : " + count);
				System.arraycopy(tmp, count-1, putCopy, count-1, 1);
				if(putCopy.length == count) {	
					tmp = putCopy;
					putCopy = new String[putCopy.length*2];
					// strings = (Arrays.copyOf(strings, strings.length*2);
					System.arraycopy(tmp, 0, putCopy, 0, tmp.length);
				}
//				System.out.println("cop : " + Arrays.toString(putCopy));
//				for(int i = 0; i < putCopy.length-1; i++) {
//					tmp[i]=putCopy[i];
//				}
//				
//				System.out.println(Arrays.toString(tmp));
//				System.out.println(Arrays.toString(putCopy));
			}
		}
	}
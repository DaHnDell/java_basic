package lesson06_array;

import java.util.Scanner;

public class Prca {
//	public static void main(String[] args) { // do while 문을 이용한 풀이 역시도 가능하다. 어차피 한번 시행은 무조건 하는 것이기 때문에
//
//		int history = 0;
//		int rollcount = 0;
//		boolean rollIf = true;
//		while(rollIf) {
//			int ranDice1 = (int)(Math.random()*6)+1;
//			int ranDice2 = (int)(Math.random()*6)+1;
//			boolean diceIf = ranDice1 == ranDice2;
//			rollcount ++;
//			System.out.println(rollcount + "번째 실행");
//			System.out.println("주사위 하나 : " + ranDice1 + "  주사위 둘 : " + ranDice2);
//			history += ranDice1 + ranDice2;
//			if(diceIf) {
//				System.out.println("운이 좋네요! 더블!");
//				continue;
//			}
//			else {
//				rollIf =false;
//			}
//		}
//		System.out.println(" 총 이동한 거리 : " + history + ", 한 쌍의 주사위를 총 "+ rollcount +"번 던졌습니다.");
//	}
//	
//
	//
//	public static void main(String[] args) {
//		Scanner scanf = new Scanner(System.in);
//		int input1 = Integer.parseInt(scanf.nextLine());
//		int input2 = Integer.parseInt(scanf.nextLine());
//		int inputDif = input1 - input2;
//		int difCount = 0;
//		boolean bigInt = (inputDif) >=0; 
//		
//		
//		if(bigInt) {
//			for(int i = 1; i < inputDif; i++) {
//				difCount += input2 + i;
//			}
//		}
//		else 
//		{
//			for(int i = 1; i < (inputDif*-1); i++) {
//				difCount += input1+i;
//			}
//		}
//		System.out.println(difCount); // 조건식 내부의 반복문은 지양할 것. // 변경사항에도 취약하고, 코드 자체의 가독성이 많이 줄어들기 때문.
	
	
	// 선생님 풀이(앞부분에 if 문과 tmp 변수를 사용해서 작은 수와 큰 수의 자리를 바꾼 뒤에야, 아래의 for 문이 돌며 서술문을 실행하도록 코드를 작성하는 것이 좋음) // 결합도를 낮추는 코드를 작성
	// for(int i = input1; i <= input2; i++){
	//
	// }
		
	public static void main(String[] args) {
		
		Scanner scanf = new Scanner(System.in);
		
//		int a = Integer.parseInt(scanf.nextLine());
//		int b = Integer.parseInt(scanf.nextLine());
//		
//		boolean abIf = (a >= b);
		
//		if (abIf){
//			for (int i = a; i > 0; i--) {
//				if(a%i == 0 && b % i == 0) {
//					System.out.println(i);
//					break;
//				}		
//			}
//		}
//		else{
//			for (int i = b; i > 0; i--) {
//				if((b%i == 0) && (a % i ==0)) {
//					System.out.println(i);
//					break;
//				}
//			}
			// 선생님 방식 = 약수를 먼저 구하고, 공약수를 구하고, 공약수를 담을 변수를 하나 만든 뒤 가장 큰 수가 들어갈 수 있는 조건문을 담습니다.
//			for(int i = 1; i<= a; i++) {
//				for(int j = 1; j <= b; j++) {
//					if(a % i == 0 && b % j == 0 && i == j) {
//					}
//				}
//				if() {
//				}
//				System.out.printf("%d : %d\n", i, a %i);
//			}
		

		// 유클리드 호제법 - 나머지가 0일 때까지 제수와 피제수를 번갈아가며 나눈다. 나머지가 0이 되는 앞의 제수가 최대공약수.
		
	
		
//		int a = Integer.parseInt(scanf.nextLine());
////		int b = Integer.parseInt(scanf.nextLine());
//		int count = 0; 
//		
//		
//		for (int i = a; i > 0; i-- ) {
//			if(a%i ==0) {
//				count++;
//			}
//		}
//		if (count > 2 || a == 0) {
//			System.out.println(a+" = 소수가 아닙니다.");
//		}
//		else {
//			System.out.println(a+" = 소수입니다.");
//		}
		

	}
}
		

//		int a = Integer.parseInt(scanf.nextLine());
//		int tenTime = 0;
		
//		 {

//		}
//		System.out.println(tenTime);
//		for (int j = tenTime; j >= 0; j--) {
//			
//		}
//		System.out.println(apA);
//		if(apA == a) {
//			System.out.println("회문수입니다.");
//		}
//		else {
//			System.out.println("회문수가 아닙니다.");
//		}
//		
//		int a = 123;
//		System.out.println(a);
//		
//		System.out.println(a%10);
//		a/=10;
//		System.out.println(a%10);
//		a/=10;
//		System.out.println(a%10);
		
//		int a = Integer.parseInt(scanf.nextLine());

		
//		for (int i = 10; i <)
		
//		b = a % 10;
//		a /= 10;
//		System.out.println(a);
//		System.out.println(b);
//		b = a % 10;
//		a /= 10;
//		System.out.println(a);
//		System.out.println(b);
//		b = a % 10;
//		a /= 10;
//		System.out.println(a);
//		System.out.println(b);
//		b = a % 10;
//		a /= 10;
/*		int a = Integer.parseInt(scanf.nextLine());
		int levelDiv = 0;
		int levelDiv2 = 0;
		while (true) {
			levelDiv = a%10;
			levelDiv2 = 10*levelDiv + a%10;
			23
			a /= 10;			
			System.out.println(a);
			System.out.println(levelDiv);
			System.out.println(levelDiv2);
			if (levelDiv2 == a) {
					break;
				}*/
		
		
		
//		for (int i = 10; i <= a; i*=10){
//			count++;
//			for (int j = 1; j <= count; j++) {
//				b = a%i;
//				a/=i;
//			}
		
//		tenTime++;
//		if(a%i == a){
//			break;
//		}
// }
	

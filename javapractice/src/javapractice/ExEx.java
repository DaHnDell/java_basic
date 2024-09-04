package javapractice;

public class ExEx {
	//1 부터 100까지의 정수 중 5의 배수의 합계를 출력
	public static void main(String[] args) {

//		int sum = 0;
//		
//		for (int i = 0; i <=100 ; i++) {
//			if (i % 5 == 0) {
//				sum +=i;
//			}
//			
//		}
		
//		int evenSum = 0;
//		int oddSum = 0;
//		
//		for(int i = 1; i<=100; i++) {
//			if (i %2 ==0) {
//				evenSum+=i;
//			}
//			else {
//				oddSum+=i;
//			}
//		}
//		System.out.println("짝수의 합계");
//		System.out.println("홀수의 합계");
		
//		for (int x = 1; x <=6; x++)
//			for (int y = 1; y <=6; y++) {
//				System.out.printf("(%d,%d)\n", x, y);
//			}
//	}
//		for(int i = 0; i < 5; i++) {
//			
//		}
//			for(int j = 0; j < 5; j++)
//		}
		
//		for(int i = -2; i < 3; i++) {
//			for
//		}
//		int rollCount = 0;
//		boolean stopRoll = false;
//		
//		while(!stopRoll) {
//			int ranDice = (int)(Math.random()*6)+1;
//			System.out.println("("+ranDice+")");
//			rollCount ++;
//			if (ranDice == 6) {
//				stopRoll = true;
//			}
//		}
//		System.out.println("총 주사위 굴린 횟수는 : "+rollCount+" 번 입니다.");
//	}
	
	// 소수 구하기 : 약수 구하기
	// 피보나치 수열(재귀)
	// 외부 for 문에 
		
		point:
		for (int i =2; i<=9; i++){
			System.out.println(i+" 단");
			for (int j = 1; j<=9; j++) {
				if(j==5) {
					break point;
				}
				System.out.println(i + "*"+ j + "=" + i*j);
			}
			
		}
		
		
	}
}

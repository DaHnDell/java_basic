package javapractice;

public class javaprac {
	public static void main(String[] args) {
//		int sum = 0;
//		
//		for (int i = 0; i <=100 ; i += 5){
//			sum += i;
//		}
//		
//		System.out.println("5 의 배수의 합계는 : " + sum);
//		
//		
		
//		int evensum = 0; 
//		int oddsum = 0;
//		
//		for (int i = 1; i <= 100; i ++) {
//			if (i % 2 == 0) {
//				evensum += i;
//			}
//			else {
//				oddsum += i;
//			}
//		}	
//		System.out.println("짝수의 합 : " + evensum);
//		System.out.println("홀수의 합 : " + oddsum);
		
//		for (int x = 1; x <= 6; x++) {
//			for(int y =1; y <=6; y++) {
//				if(x + y == 6) {
////					System.out.println("x : " + x + "y : " + y + "일때 x + y = 6");
//					System.out.println("(" + x +","+ y + ")");
//				}
//			}
//		}
//		for (int i = 1; i <= 5; i++) {
//			for(int j = 1; j <= 5; j++) {
//				System.out.printf("%c", '*');
//
//			}
//			System.out.println(); // 원형
//		}
		
//		for (int i = 1; i <= 5; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.printf("%c", '*');
//			}
//			System.out.println();
//		}
		
//		for (int i = 5; i >= 0; i--) {
//		for(int j = 1; j <= i; j++) {
//			System.out.printf("%c", '*');
//		}
//		System.out.println();
//	}			// 1번째 줄 : 1개 2번째 줄 : 3개 3번째 줄 : 5개 4번째 줄 : 7개 5번째 줄 : 9개
				// 
//		System.out.println(" " + " 3");
//		
//		for (int i = 1; i<=5; i++) { //라인변수
//			for(int k = 5; k <= k-i; k--) {
//				System.out.printf(" ");
//			}
//			for(int j = 1; j <= 2*i-1; j++) {
//				System.out.printf("%c", '*');
//			}
//			System.out.println();
//		}w
		
		for (int i = 1; i <= 5; i++) { // 윗부분은 내방식
			for (int j = 0; j <= 5-i; j++) {
				System.out.printf(" ");	
			}
			for (int k = 1; k <= 2*i-1; k++) {
				System.out.printf("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= 5; i++) { // 아랫부분은 강사님 방식
			System.out.printf(" ");
			for (int j = 1; j <=9; j++) {
				if(i <= j && (i + j >= 2 && i+j <= 10) ){
					System.out.printf("*");
				}
				else{
					System.out.printf(" ");
				}
			}
			System.out.println();
		}

	}
}

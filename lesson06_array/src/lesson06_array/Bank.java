package lesson06_array;
import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		// ui 구현, 메뉴 출력 / 입금. 출금. 잔고. 종료
		// 입금 한 금액 만큼 잔고 반영
		// 출금 금액이 잔고보다 클 경우 불가
		// 종료를 눌렀을 때 종료
		int balance = 0;
		
		boolean onOff = true;
		Scanner scanf = new Scanner(System.in);
		
		while(onOff) {
			System.out.println("==================================");
			System.out.println("   1. 입금  2. 출금 3. 잔고 4. 종료   ");	
			System.out.println("==================================");
			int input = Integer.parseInt(scanf.nextLine());
			switch(input) {
			case 1:
				System.out.println("입금 할 금액을 입력하세요 > ");
				int in = Integer.parseInt(scanf.nextLine());
				balance += in;
				break;
			case 2:
				System.out.println("출금");
				int out = Integer.parseInt(scanf.nextLine());
				if (balance >= out) {
					balance -= out;
				}
				else {
					System.out.println("잔고 부족 " + (out - balance) + "원 부족");
				}
				break;
			case 3:
				System.out.println("잔고 > " + balance);
				
				break;
			case 4:
				System.out.println("종료.");
				onOff = false;
				break;
			}
		}
		
		
	}
}

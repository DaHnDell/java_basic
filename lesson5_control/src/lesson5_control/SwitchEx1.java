package lesson5_control;
import java.util.Scanner;
public class SwitchEx1 {
	public static void main(String[] args) {
		// ifEX 4 에 있던 계절 계산을 switch 문을 통해 작업해 보자.
		Scanner scanf = new Scanner(System.in);
		
		int M = scanf.nextInt();
		
		switch (M) {
		case 3: case 4: case 5:{
			System.out.println("Spring");
			break;
		}
		case 6: case 7: case 8:{
			System.out.println("Summer");
			break;
		}
		case 9: case 10: case 11:{
			System.out.println("Autumn");
			break;
		}
		case 12: case 1: case 2:{
			System.out.println("Winter");
			break;
		}
		default:
			System.out.println("1~12 사이의 정수를 입력하세요");
		}

//		switch (M/3) {
//		case 1: {
//			System.out.println("Spring");
//			break;
//		}
//		case 2: {
//			System.out.println("Summer");
//			break;
//		}
//		case 3:{
//			System.out.println("Autumn");
//			break;
//		}
//		case 4:{
//			System.out.println("Winter");
//			break;
//		}
//		default:
//			System.out.println("1~12 사이의 정수를 입력하세요");
//		}
		
	}
}

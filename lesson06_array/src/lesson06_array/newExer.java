package lesson06_array;

import java.util.Scanner;

public class newExer {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		int x = Integer.parseInt(scan.nextLine());
//		int xDivten = x;
//		int res = 0;
//		
//		while(xDivten!=0) {
//			res = res*10+xDivten%10;
//			xDivten /= 10;
//			System.out.println(xDivten + " " + res);
//		}
//		if(res == x){
//			System.out.println("회문수");
//		}
//		else{
//			System.out.println("아닙니다");
//		}

		int num = 11211;
		int result = 0;
		int tmp = num;		
		
		while(tmp != 0) {
			result = result * 10 + tmp%10;
			tmp /= 10;
			
		}
		
		System.out.println(result == num ? "회문수" : "아님");	}
}

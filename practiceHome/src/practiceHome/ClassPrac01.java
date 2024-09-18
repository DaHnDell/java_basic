package practiceHome;

import java.util.Arrays;
import java.util.Scanner;

public class ClassPrac01 {
	
	public static void main(String[] args) {
		System.out.println("입력할 정수의 갯수");
		Scanner scanner = new Scanner(System.in);
		int numLength = scanner.nextInt();
		int[] num_list  = new int[numLength];
		int inputNum;
		for(int i = 0; i < numLength; i++) {
			System.out.println("정수 입력" + i+1 + ">");
			inputNum = scanner.nextInt();
			num_list[i] = inputNum;
		}
		System.out.println(Arrays.toString(num_list));
		solution(num_list);
	}	
	static void solution(int[] arr) {
		boolean boolIfEven;
		int[] solArr = new int[2];
		int evnCnt = 0;
		int oddCnt = 0;
		for(int i = 0; i < arr.length; i++) {
			boolIfEven = arr[i] % 2 == 0;
			if(boolIfEven) {
				evnCnt++ ;
			}
			else if(!boolIfEven) {
				oddCnt++;
			}
		}
		solArr[0] = evnCnt;
		solArr[1] = oddCnt;
		System.out.println(Arrays.toString(solArr));
	}
}

//class solution {
//	public int[] solution(int[] num_list) {
//		int[] answer = new int[2];
//		
//		for(int i = 0; i < num_list.length; i++) {
//			answer[num_list[i]%2]++;
//			
//			return answer;
//		}
//	}
}
		

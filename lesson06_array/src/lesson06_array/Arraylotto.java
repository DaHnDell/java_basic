package lesson06_array;

import java.util.Arrays;
// 1~45 중에 6개의 숫자를 차례대로 고른다.
// 중복값 없어야 함!

public class Arraylotto {
	public static void main(String[] args) {
		int[] lotto = new int [6];// 당첨된 숫자가 들어갈 자리 배열 선언
		int idx = 0;// while 문의 종료 조건으로 사용하는 변수
		while(true) {
			int number = (int)(Math.random()*45)+1;
			
			boolean insert = true;
			for (int i = 0; i < idx; i++) {
				if(lotto[i] == number) {
					insert = false;
					break;
				}
			}
			if(insert == true) {
				lotto[idx] = number;
				idx++;
			}
			if (idx == 6) break;//공을 뽑는 횟수의 탈출 조건
		}
		for(int i =0; i < lotto.length; i++) {
		}
		System.out.println(Arrays.toString(lotto));
	}
}

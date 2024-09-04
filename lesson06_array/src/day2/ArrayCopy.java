package day2;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		// arraycopy : 
		// System 클래스의 소속
		int[] src = {1, 2, 3, 4};
		int[] dest = new int[src.length * 2];
//		System.arraycopy(src, 1, dest, 6, src.length); // 인자가 5개 사용되는 잔인한 함수 // source = 원본 // Pos = ~에서부터, 
//		// 순서대로: 원본 , 원본부 복사시작위치, 복사본, 복사본 붙여넣기시작위치, 얼마나.
//		System.out.println(Arrays.toString(dest));

		int[] result = Arrays.copyOf((src*src), 10);
		System.out.println(Arrays.toString(result));

	}
	
}

package lesson5_control;

public class ForEx1 {
	public static void main(String[] args) {
		// scope = 변수의 유효 범위
		int i = 0;
		for (i = 0; i < 10; i++) { // i의 값이 유효한범위는 for 문안에서만.. 이것이 스코프.
		System.out.println("i = "+ i);
		}
		System.out.println(i);
	}
}

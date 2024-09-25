package lesson5_control;

public class WhileEx4 { // Debug + F8 누르면서 한줄 한줄씩 실행되는 것을 확인이 가능
	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {
			System.out.println("[" + i + "] 단");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}
	}
}

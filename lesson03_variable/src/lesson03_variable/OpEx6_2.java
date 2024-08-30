package lesson03_variable;

public class OpEx6_2 {
	public static void main(String[] args) {
		int num = 10;
		String s = num + ""; // 결합연산자는 피연산자 중 하나라도 문자열이라면 전체 타입을 문자열로 바꿔줌.
		System.out.println(s);
		int num2 = Integer.parseInt("1234"); // 초록색 bar는 탭 키를 눌렀을 때 그리로 이동한다는 뜻(편집적 능률)
		System.out.println(num2 % 10);
		
		String bin = "11010";
		int num3 = Integer.parseInt(bin, 2);
		System.out.println(num3);
	}
}

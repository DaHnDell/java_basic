package lesson5_control;

public class SwitchEx4 extends Ifelse {
	public static void main(String[] args) {
		// 시작숫자는 0
		String idNum = "810101-1234567";
		String birthNum = idNum.substring(0, 6); // 6번 인덱스 미만까지 잘라올 수 있게 됨, String은 배열형태이기 때문임.
		System.out.println(birthNum);
		char gender = idNum.charAt(7);
		System.out.println(gender);
		
		switch (idNum.charAt(7)) {
		case '1' : case '3' :
			System.out.println("Male");
			break;
		case '2' : case '4' :
			System.out.println("Female");
			break;
		}
		int idNum1 = Integer.parseInt(idNum.substring(0, 1));
		int idNum2 = Integer.parseInt(idNum.substring(1, 2));
		int idNum3 = Integer.parseInt(idNum.substring(2, 3));
		int idNum4 = Integer.parseInt(idNum.substring(3, 4));
		int idNum5 = Integer.parseInt(idNum.substring(4, 5));
		int idNum6 = Integer.parseInt(idNum.substring(5, 6));
		
		int idNum7 = idNum.charAt(7)-'0'; // char 값에 담겨있는 아스키 숫자값 0은 48을 빼고나면 정수 2가 남음.
		int idNum8 = idNum.charAt(8)-'0'; // char 값에 담겨있는 아스키 숫자값 0은 48을 빼고나면 정수 2가 남음.
		int idNum9 = idNum.charAt(9)-'0'; // char 값에 담겨있는 아스키 숫자값 0은 48을 빼고나면 정수 2가 남음.
		int idNum10 = idNum.charAt(10)-'0'; // char 값에 담겨있는 아스키 숫자값 0은 48을 빼고나면 정수 2가 남음.
		int idNum11 = idNum.charAt(11)-'0'; // char 값에 담겨있는 아스키 숫자값 0은 48을 빼고나면 정수 2가 남음.
		int idNum12 = idNum.charAt(12)-'0'; // char 값에 담겨있는 아스키 숫자값 0은 48을 빼고나면 정수 2가 남음.
		int idNum13 = idNum.charAt(13)-'0'; // char 값에 담겨있는 아스키 숫자값 0은 48을 빼고나면 정수 2가 남음.
//		System.out.println(idNum7);
//		System.out.println(idNum1);
//		System.out.println(idNum2);
//		System.out.println(idNum3);
//		System.out.println(idNum4);
//		System.out.println(idNum5);
//		System.out.println(idNum6);
//		
		
		System.out.printf("%d%d%d%d%d%d-%d%d%d%d%d%d%d\n",
				idNum1,idNum2,idNum3,idNum4,idNum5,idNum6,
				idNum7,idNum8,idNum9,idNum10,idNum11,idNum12,idNum13);	
		
		int sum = 
				idNum1 * 2 + 
				idNum2 * 3 +
				idNum3 * 4 +
				idNum4 * 5 + 
				idNum5 * 6 +
				idNum6 * 7 +
				idNum7 * 8 + 
				idNum8 * 9 +
				idNum9 * 2 +
				idNum10 * 3 + 
				idNum11 * 4 +
				idNum12 * 5 ;
		System.out.println(sum);
		int res = (11 - sum % 11) % 10;
		System.out.println(res == idNum13); // 이 값이 true여야 올바른 주민등록번호이다.
	// 후에 배열을 사용할 경우 코드가 더 짧아지고 간결해짐
		// 이 외에도 생년월일 부의 타당성(월이 13이거나 0이거나 등등..)도 따지기도 함.
	}
	
}

package lesson03_variable;

public class OpEx7 {
	public static void main(String[] args) {
//		int score = 80;
//		String pass = (score >= 60) ? "합" : "불합";
//		System.out.println(pass);
//		
//		// 
//		
//		int num = 0;
//		// 짝수, 홀수
//		String isEven = (num % 2 == 0) ? "Even" : "Odd";
//		System.out.println(isEven);
//		
//		String s = "ABCD";
//		s += "가나다라";
//		s += "1234";
//		System.out.println(s);
//		
//		
//		char ch = 'A';
//		char ch2 = (char)(ch + 1); // 산술 형 상승 int 보다 작은 숫자 타입을 이항(산술) 연산시 int로 변환(short, byte, ch);
//		
//		System.out.println(ch2);
//		
//		
//		// 산술 자료형 : int double char boolean string(char 의 연속)
//		
//		// byte, short, char < int
//		
//		byte b = Byte.MAX_VALUE;
//		byte b1 = 1;
//		byte b2 = (byte)(b + b1); // 128, 126 등 당연한 결과를 우리는알지만, 산술연산처리를 했을 땐 무조건 정수형으로 변환해야 함.
//		System.out.println(b + 1);
//		
//		int i = 300; // 낮은 타입으로 형 변환을 진행할때는 항상 값손실을 기대하고, 걱정해야 함.
//		byte b3 = (byte)i;
//		
//		System.out.println(b3);
//		System.out.println(i);
//		
//		// '가' : 44032
//		
//		System.out.println((char)('가'+2));
//		
//		
//		char firstKr = '가';
//		char lastKr = '힣';
//		
////		int flDiff = (firstKr - lastKr -1)*(-1); // 최댓값에서 
//		
//		
//		int flDiff = (lastKr-firstKr +1);
//		
//		
////		System.out.println((char)('가'-'힣'));
//		System.out.println(flDiff);
//		System.out.println("=========================");
//		int cnt = 0;
//		for(ch = '가'; ch < '까'; ch++ ){
//			System.out.print(ch);
//			cnt++;
//		}
//		System.out.println(cnt);
//		
//		// 게시판 페이지의일부를 구현
//		// 사과 123개가 상자당 10개씩 들어가유
//		// 몇 개의 상자가 필요할까유
		
//		int apple = 131;
//		int box = 10;
//		int apbD = apple/box;
////		int boxNum = ((apple % box) > 0) ? (apbD + 1) : (apbD);
//		int boxNum = (apple + 9) / box;
//		System.out.println(boxNum); // 올림계산 : 피제수+ (제수-1) / 제수 
										
		// 소수점 자르기(반올림) 소수점
		// 3.141592
		
		double pi = 3.141592;
		System.out.println((int)(pi * 1000 + 0.5) / 1000.);
		
	}
}

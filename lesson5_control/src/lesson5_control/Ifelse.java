package lesson5_control;

public class Ifelse {
	public static void main(String[] args) {
//		int score = 70;
//		System.out.println("시험 시작");
		
		
		double rand = Math.random(); // 0~0.99999999999999999999 (0 이상 100 이하)
		System.out.println(rand);
		int score = (int)(rand*101);
		
		System.out.println("시험 시작");
		System.out.println("점수 :: " + score);
		
		if (score >= 60) {
			System.out.println("합격입니다");
		}
		else
		{
			System.out.println("불합격입니다");
		}
		System.out.println("시험 끝");
		
		}

}

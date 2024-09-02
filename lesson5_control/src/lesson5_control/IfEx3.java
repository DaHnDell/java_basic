package lesson5_control;

public class IfEx3 {
	public static void main(String[] args) {
		// 자격증 시험 , 과락(과목 낙제)
		// 세 과목 
		
		// 세 과목 평균이 60 이상이면 합격
		// 단, 개별 과목이 40 미만이면 불합격
		
		int score1 = 50, score2 = 60, score3 = 30;
		System.out.println("");
		int sum = score1 + score2 + score3;
		boolean fortyHigh = (score1 >= 40 && score2 >= 40 && score3 >= 40);
		int avg = sum / 3;
		// 적절한 조건 작성 이후에(위에 맞게)+ 합격, 불합격 여부를 작성
		
		if (avg >= 60 && (fortyHigh)) {
			System.out.println("합격입니다");
		}
		else
		{
			System.out.println("불합격입니다");
		}
	
	}
}

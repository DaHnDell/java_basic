package lesson5_control;

public class IFEX2 {
	public static void main(String[] args) {
		int score = (int)(Math.random()*101);
		String grade = "";
		
		System.out.println("학점 부여 시작");
		
		if (score >= 90) {
			grade = "A";
		}
		else if (score >= 80) {
			grade = "B";
		}
		else if (score >= 75) {
			grade = "C";
		}
		else if (score >= 70) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		// 아래부터는 + 붙이냐 안붙이냐의 작업
		if(score >= 60 && score % 10 >=5||score == 100) {
			grade += "+";
		}
		System.out.println("당신의 학점은 : " + grade + "입니다"); 
		System.out.println("점수는 : " + score + "이며, 학점 부여 끝");
		
	}
}

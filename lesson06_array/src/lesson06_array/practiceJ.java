package lesson06_array;

public class practiceJ {
	public static void main(String[] args) {
		int[] score = {90, 80, 60, 100};
		
		int totalScore = 0;
		double avgScore = 0;
		
		for (int i = 0; i < score.length; i++) {
			totalScore += score[i];
		}
		avgScore = totalScore / 3;
		 
		
		System.out.println(totalScore);
		System.out.println(avgScore);
	}
}


// 형상 관리 툴 git 뿐만 아니라 svn, cvs 등등
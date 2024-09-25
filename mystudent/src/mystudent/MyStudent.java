package mystudent;

import java.util.Arrays;

public class MyStudent {
	int stuNum;
	String stuName;
	int scoreKor;
	int scoreEng;
	int scoreMat;
	int[] stuArr;
	
//
	public MyStudent() { // 기본 생성자
		
	}
	
	public MyStudent(int stuNum, String stuName, int scoreKor, // 직접 지정 생성자
			int scoreEng, int scoreMat, int[] stuArr) {
		super();
		this.stuNum = stuNum;
		this.stuName = stuName;
		this.scoreKor = scoreKor;
		this.scoreEng = scoreEng;
		this.scoreMat = scoreMat;
		this.stuArr = stuArr;
	}

	@Override
	public String toString() {
		return "MyStudent [stuNum=" + stuNum + ", stuName=" + stuName + ", scoreKor=" + scoreKor + ", scoreEng="
				+ scoreEng + ", scoreMat=" + scoreMat + ", stuArr=" + Arrays.toString(stuArr) + "]";
	}
	
	public int total() {
		return this.scoreKor + this.scoreEng + this.scoreMat;
	}
	
	public double avg() {
		return this.total() / 3d;
	}
	
	

	

	
	
}

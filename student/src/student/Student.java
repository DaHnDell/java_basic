package student;


public class Student {
	int no;
	String name;
	int kor;
	int eng;
	int mat;
	// 랜덤값
	public Student(int no, String name, int kor, int eng, int mat) {
//		super();
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	int total() {
		return kor + eng + mat;
	}
	
	double avg() {
		return total() / 3d;
	}
	
	
	
	
}

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
	void reset() {
		this.kor = this.eng = this.mat = 0;
		this.name = "삭제됨";
	}

	void update() {
		this.kor = StudentUtils.nextInt("변경할 국어"); 
		this.eng = StudentUtils.nextInt("변경할 영어"); 
		this.mat = StudentUtils.nextInt("변경할 수학"); 
		this.name = StudentUtils.nextLine("변경할 이름");
	}
	
	void regist() {
		this.kor = StudentUtils.nextInt("국어"); 
		this.eng = StudentUtils.nextInt("영어"); 
		this.mat = StudentUtils.nextInt("수학"); 
		this.name = StudentUtils.nextLine("이름");
		System.out.print("이름" + name + "국어" + kor + "영어" + eng + "수학" + mat + "\n 위 내용을 등록합니까? Y/N");
	}
}

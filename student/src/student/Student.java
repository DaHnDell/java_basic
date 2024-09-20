package student;

public class Student implements Cloneable{

	private int no;
	private String name;
	private int kor;
	private int eng;
	private int mat;

	public Student(Student s) {
		no  = s.no;
		name = s.name;
		kor = s.kor;
		eng = s.eng;
		mat = s.mat;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}

	public Student(int no, String name, int kor, int eng, int mat) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
}

	public String toString() {
		return String.format("%4d %4s %6d %7d %7d %7d %7.2f", no, name, kor, eng, mat, total(), avg());
	}
	
	public int total() {
		return this.kor + this.eng + this.mat;
	}
	
	public double avg() {
		return total() / 3d;
	}
}
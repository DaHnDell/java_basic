package student;
// 학생 클래스의 자바 beans 명세서에 맞게끔 수정한다. 모든 필드는 private, 모든 메서드는 public
public class Student {
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	// 랜덤값
	public Student() {
		
	}
//	getter 및 setter의 경우 보통 생성자 직후에 선언
	public int getNo() {
		return no;
	}
	public int setNo(int no) {
		return no;
	}
	public String getName(String name) {
		return name;
	}
	public String setName(String name) {
		return name;
	}
	public int getKor(int kor) {
		return kor;
	}
	public int setKor(int kor) {
		return kor;
	}
	public int getEng(int eng) {
		return eng;
	}
	public int setEng(int eng) {
		return eng;
	}
	public int getMat(int mat) {
		return mat;
	}
	public int setMat(int mat) {
		return mat;
	}
	
	public Student(int no, String name, int kor, int eng, int mat) {
//		super();
		this.setNo(no);
		this.setName(name);
		this.setKor(kor);
		this.setEng(eng);
		this.setMat(mat);
	}
	
	public String toString() {
		return String.format("%4d %4s %6d %7d %7d %7d %7.2f", no, getName(), kor, eng, mat, total(), avg());
	}
	
	
	public int total() {
		return kor + eng + mat;
	}
	public double avg() {
		return total() / 3d;
	}
	public void reset() {
		this.kor = this.eng = this.mat = 0;
		this.setName("삭제됨");
	}
	
	public void update() {
		this.kor = StudentUtils.nextInt("변경할 국어"); 
		this.eng = StudentUtils.nextInt("변경할 영어"); 
		this.mat = StudentUtils.nextInt("변경할 수학"); 
		this.setName(StudentUtils.nextLine("변경할 이름"));
	}
	
	public void regist() {
		this.kor = StudentUtils.nextInt("국어"); 
		this.eng = StudentUtils.nextInt("영어"); 
		this.mat = StudentUtils.nextInt("수학"); 
		this.setName(StudentUtils.nextLine("이름"));
		System.out.print("이름" + getName() + "국어" + kor + "영어" + eng + "수학" + mat + "\n 위 내용을 등록합니까? Y/N");
	}
	public String getName() {
		return name;
	}
}

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

	public void setNo(int no) {

		this.no = no;

	}
// 	별도의 입력값 없이 return = getter
	public String getName() {

		return name;

	}
//	
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
//	setter = 매개변수로 값을 가져와서 this. 사용해서 선언
	public void setMat(int mat) {

		this.mat = mat;

	}

	

	public Student(int no, String name, int kor, int eng, int mat) {

//		super();

		this.no = no;

		this.name = name;

		this.kor = kor;

		this.eng = eng;

		this.mat = mat;

	}

	

	public String toString() {

		return String.format("%4d %4s %6d %7d %7d %7d %7.2f\n", no, name, kor, eng, mat, total(), avg());

	}

	

	

	public int total() {

		return this.kor + this.eng + this.mat;

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



}
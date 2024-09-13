package student;

import static student.StudentUtils.*;
import java.util.Arrays;
import java.util.Scanner;

//import org.w3c.dom.ranges.RangeException;
//import org.w3c.dom.ranges.RangeException;
//parseint 의 경우 애초에 throw하기 때문에..

public class StudentService {
	private Student[] students = new Student[5]; 
	private Student[] totalSortedStudents; // 클론 하고 나서 정렬하기 위한 클론본 
	private Student[] numSortedStudents; // 클론 하고 나서 정렬하기 위한 클론본 
	private Student[] nameSortedStudents; // 클론 하고 나서 정렬하기 위한 클론본 
	private int cnt=0;
	boolean flag = true;
	Scanner scanner = new Scanner(System.in);
	{
		students[cnt++] = new Student(1, "홍길동", 80, 90, 100); // 예시
		students[cnt++] = new Student(1, "김길동", 88, 99, 1); // 예시
		students[cnt++] = new Student(1, "고길동", 81, 91, 10); // 예시
		students[cnt++] = new Student(1, "박길동", 85, 95, 65); // 예시
		cloneAndSort();
		totalSortedStudents = students;
	}
	
	void cloneAndSort() {
		numSortedStudents = students.clone();
		nameSortedStudents = students.clone();
		totalSortedStudents = students.clone();
	
		sort(0, numSortedStudents);
		sort(1, numSortedStudents);
		sort(2, numSortedStudents);
	}

	public int addKor() {
		int kor = 0;
		try {
			kor = (nextInt("국어"));
			if(kor < 0 || kor > 100) {
				throw new Exception ("0과 100 사이의 숫자 입력");
			}
			else {
				return kor;
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return addKor();
		}
	}

	public int addEng() {
		int eng = 0;
		try {
			eng = (nextInt("영어"));
			if(eng < 0 || eng > 100) {
				throw new Exception ("0과 100 사이의 숫자 입력");
			}
			else {
				return eng;
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return 	addEng();
		}
	}

	public int addMat() {
		int mat = 0;
		try {
			mat = (nextInt("수학"));
			if(mat < 0 || mat > 100) {
				throw new Exception ("0과 100 사이의 숫자 입력");
			}
			return mat;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return addMat();
		}
	}

	public int addNo() {
		int no = 0;
		Student s = findBy(nextInt("학번"));
		if(findBy(no) != null) {
			throw new RuntimeException("중복되지 않는 학번을 입력하세요"); // 서비스에선 반드시 던지기만 해야 함...
		}
		try {
//			no = (nextInt("학번"));
			if(no < 0 || no < cnt ) { //no > (students.length) || no == s.getNo()
				throw new Exception("정확한 값 입력");
			}
			return no;
		}catch(NullPointerException e){
			System.out.println(e.getMessage());
			return addNo();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return addNo();
		}
	}

	public String addName() {
		String name = "";
//		try {
			name = (nextLine("이름"));
			checkName(name);
//			for(int i = 0; i < name.length(); i++) {
//				char ch = name.charAt(i);
//				if(!('가' <= ch && ch <= '힣' && name.length() <=4 && name.length() >=2)) {
//					throw new Exception("이름을 다시 입력하세요. 한글 2~4자 이내");
//				} 
			return name;
//			}
//			}catch(Exception e) {
//				System.out.println(e.getMessage());
//				return addName();
//			}
//		return name;
	}
	

	public void add() { 
		 int no = nextInt("학번");
		 if(cnt == students.length) {
			 students = Arrays.copyOf(students, students.length*2);
		 }students[cnt++] = new Student(addNo(), addName(), addKor(), addEng(), addMat());
	}

	

	public void list() {
		int	input = (nextInt("1. 입력순  2. 학번순  3. 이름순  4. 석차순"));
		Student[] tmp = null;
		switch(input) {
		case 1 : 
			tmp = students;
			break;
		case 2 : 
			tmp = numSortedStudents;
			break;
		case 3 : 
			tmp = nameSortedStudents;
			break;
		case 4 : 
			tmp = totalSortedStudents;
			break;
		}
		System.out.println("학번    이름    국어    영어    수학    총점    평균");
		System.out.println("====================================================");

		for(int i = 0 ; i < cnt ; i++) {
			System.out.println(tmp[i]);
		}
	}

	public void modify() {
		Student s = findBy(nextInt("학번"));
//		s = findByNo();

//			if(s.getNo() > (students.length) || s.getNo() < 0 || s.getNo() < cnt) {
//				throw new Exception("정확한 값 입력");
//			}
//			if()
		try {
			
//		s.setName(checkName(nextLine("이름")));
//		
//		s.setKor(checkRange(nextInt("국어")));
//		s.setKor(checkRange(nextInt("영어")));
//		s.setKor(checkRange(nextInt("수학")));
//		s.setEng(nextInt("영어"));
//		s.setMat(nextInt("수학"));
		
		}catch(NumberFormatException e){

			System.out.println(e.getMessage());

			System.out.println("입력값은 숫자가 아닙니다");

		}
	}



 



	 public void remove() {

//		 Student s = findBy();
		 Student s = findBy(nextInt("학번"));
		 try {
			 if(s.getNo() > cnt || s.getNo() < 0) {
				 throw new Exception("정확한 학번을 입력하세요");
			 }
			 for(int i = 0; i < cnt; i++) {
				 if(students[i]==s) { 
					 System.arraycopy(students, i+1, students, i, cnt-- - i - 1);
					 break;
				 }
			 }
		 }catch(NumberFormatException a) {

			 System.out.println(a.getMessage());

		 }catch(Exception e) {

			 System.out.println(e.getMessage());

			 return;

		 }

	}



	private Student findBy(int no) { 
		Student student = null;
//		int no = nextInt("학번");
		for(int i = 0; i < cnt; i++) {
			if(students[i].getNo() == no) {
				student = students[i];
			}
		}

		return student;

	 }

	 

	 private Student findByName() {
		 Student student = null;
		 String name = nextLine("이름");
		 for(int i = 0; i < cnt; i++) {
			 if(students[i].getName() == name) {
				 student = students[i];
			 }
		 }
		 return student;
	 }
	 
	 
	 // 학생 이름 유혀성 검증, 이름은 반드시 한글, 최소 2 최대 4글자의 한글 @param name 학생의 이름
	 void checkName(String name) {
		 char[] chs = name.toCharArray();
		 String s = new String(chs);
		 // name.toCharArray(); // String chs = new String(chs)
		 if(name.length()<2 || name.length() > 4) {
			 throw new RuntimeException("이름은 2글자에서 4글자 사이로 입력하세요.");
		 }
		 for(char c : chs) {
			 if(c < '가' || c > '힣') { // 문자열로 바꾸고 가와 힣 사이에 없으면~~
				 throw new RuntimeException("한글로 구성된 이름으로 작성하세요.");
			 }
		 }
		 
	 }
	 /**
	  * 범위에 대한 탐색 start 이상, end 이하의 조건을 만족하지 않을 경우 예외 발생
	  * @param num 검증 대상의 숫자
	  * @param start 시작의 값
	  * @param end 종료의 값
	  * @return 원래의 값
	  */
	 
	 //인덱스 객체를 활용해서 자동적으로 정렬하도록 
	 //조회할 때 정렬하는 것이 아니라, 입력 할 때 정렬하도록. 즉, 데이터가 입력될 때 정렬하는 것이 좋음.
//	 int checkRange(int num, int start, int end) throws RangeException{
//		 if(num < start || num > end) {
//				throw new RangeException(start, end);
//			}
//		 return num;
//	 }
//	 int checkRange(int num) throws RangeException{
//		 return checkRange(num, 0, 100);
//	 }
	 // parseint 형식임. radix = 진수, 진법의 형식. 
	 
	 //정렬, 총점 기준의 비교
	 void sort(int type, Student[] target) {
		 Student[] arr = students; 
//			System.out.println("초기 :: " + Arrays.toString(arr));
			// 회차 반복
			point:for(int i = 0; i < cnt-1 ; i++) {
				for(int j = 0; j < cnt-1-i; j++) {
					boolean condition = false;
					switch (type){
						case 0:
							 condition = arr[j].getNo() > arr[j+1].getNo();
							 break;
						case 1:
							condition = arr[j].getName().compareTo(arr[j+1].getName()) > 0;
							break;
						case 2:
							condition = arr[j].total() <= arr[j+1].total();
							break;
					}
					if(condition) {
						// 값 비교 후 자리 교환
						Student tmp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = tmp;
					}
				}
//				System.out.println("회차 :: " + Arrays.toString(arr));
			}
			System.out.println(Arrays.toString(arr));
	 }
}


package student;

import static student.StudentUtils.nextInt;
import static student.StudentUtils.nextLine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {
	List<Student> students = new ArrayList<Student>();
	List<Student> totalSortedStudents; 
	List<Student> numSortedStudents; 
	List<Student> nameSortedStudents; 
	Scanner scanner = new Scanner(System.in);
	{
		students.add(new Student(1, "홍길동", 88, 99, 45));
		students.add(new Student(2, "고길동", 98, 99, 76));
		students.add(new Student(3, "김길동", 77, 99, 55));
		students.add(new Student(4, "박길동", 66, 99, 100));
		cloneAndSort();
	}
	
	void cloneAndSort() {
		totalSortedStudents = new ArrayList<Student>(students);	
		numSortedStudents = new ArrayList<Student>(students);
		nameSortedStudents =  new ArrayList<Student>(students); 
		
		numSortedStudents.sort((o1, o2) -> o1.getNo() - o2.getNo());
		nameSortedStudents.sort((o1, o2) -> o1.getName().hashCode() - o2.getName().hashCode());
		totalSortedStudents.sort((o1, o2) -> o2.total() - o1.total());
	}	
	
	public void add() { 
		int no = nextInt("학번");
	    for (Student student : students) {
	        if (student.getNo() == no) {
	            throw new NumberFormatException("");
	        }
	    }
		String name = nextLine("이름");
		checkName(name);
		int kor = nextInt("국어");
		checkRange(kor, 0, 100);
		int eng = nextInt("영어");
		checkRange(eng, 0, 100);
		int mat = nextInt("수학");
		checkRange(mat, 0, 100);
		students.add(new Student(no, name, kor, eng, mat));
	}
	
	
	
	public void list() {
		int	input = (nextInt("1. 입력순  2. 학번순  3. 이름순  4. 석차순"));
	List<Student> tmp = null;
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
	
	for (int i = 0; i < tmp.size(); i++) {
	    System.out.println(tmp.get(i));
	}
	}
	
	public void modify() {
	    int no = nextInt("학번");
	    Student s = students.get(no);
	    if (s == null) {
	        throw new NumberFormatException();
	    }
		String name = (nextLine("이름"));
		s.setName(name);
		int Kor = (nextInt("국어"));
		s.setKor(Kor);
		int Eng = (nextInt("영어"));
		s.setEng(Eng);
		int Mat = (nextInt("수학"));
		s.setMat(Mat);		
	}
	
	void remove() {
		Student student = findByNo(nextInt("학번"));
		if(student == null) {
			throw new NumberFormatException();
		}
		
		if(students.contains(student)) {
			students.remove(student);
		}
	}
	
	private Student findByNo(int no) { 
		Student student = null;
		for(int i = 0; i < students.size(); i++) {
			if(students.get(i).getNo() == no) {
				student = students.get(i);
			}
		}
		return student;
	 }
	
	 private Student findByName() {
		 Student student = null;
		 String name = nextLine("이름");
		 for(int i = 0; i < students.size(); i++) {
			 if(students.get(i).getName() == name) {
				 student = students.get(i);
			 }
		 }
		 return student;
	 }
	 
	 	 void checkName(String name) {
		 char[] chs = name.toCharArray();
		 String s = new String(chs);
		 if(name.length()<2 || name.length() > 4) {
			 throw new RuntimeException("이름은 2글자에서 4글자 사이로 입력하세요.");
	 }
	 for(char c : chs) {
		 if(c < '가' || c > '힣') { 
	 throw new RuntimeException("한글로 구성된 이름으로 작성하세요.");
				 }
			 }		 
		 }

	 	int checkRange(int num, int start, int end) throws RangeException{
			if(num < start || num > end) {
				throw new RangeException(start, end);
			}
			return num;
		}
		int checkRange(int num) throws RangeException {
			return checkRange(num, 0, 100);
		}
	 	 
	 	 
	 	 
//	 	public void RangeException(int start, int end) {
//			this(start, end, start + "이상 " + end + "이하의 값을 입력하세요");
//		}
//		public void RangeException(int start, int end, String msg) {
//			super(msg);
//			this.start = start;
//			this.end = end;
//		}
	}
	

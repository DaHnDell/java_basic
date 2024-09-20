package student;

import static student.StudentUtils.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import student.RangeException;

public class StudentService {
	
	private List<Student> students = new ArrayList<Student>();  
	private List<Student> totalSortedStudents;   
	private List<Student> numSortedStudents;   
	private List<Student> nameSortedStudents; 

	{
		students.add(new Student(1, "홍길동", 90, 80, 100)); // 하나의 인스턴스를 기억하기
		students.add(new Student(2, "김길동", 88, 99, 1));
		students.add(new Student(3, "고길동", 81, 91, 10));
		students.add(new Student(4, "박길동", 85, 95, 65));
	}
	
	void cloneAndSort() {
		// 인터페이스는 클론 불가
		numSortedStudents = new ArrayList<Student>(students); // new 어레이리스트로 생성을 먼저 할 것
		nameSortedStudents = new ArrayList<Student>(students);
		totalSortedStudents = new ArrayList<Student>(students);
		// 람다가 가지는 컴퍼레이터는 요소가 두개
		numSortedStudents.sort((o1, o2)->o2.getNo()-o1.getNo());
//		nameSortedStudents.sort((o1, o2)->o1.getName().hashCode() - o2.getName().hashCode());
		nameSortedStudents.sort(new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		Comparator<Student> comp = new MyComp();
//		totalSortedStudents.sort((o1, o2)->o2.total()-o1.total());
		totalSortedStudents.sort(comp);
	}
	// 비교자 추가로 익명 클래스가 아닌 따로 클래스를 작성하기
	class MyComp implements Comparator<Student>{
		@Override
		public int compare(Student o1, Student o2) {
			return o2.total() - o1.total();
		}
	}
	
	
	public void add() { 
		int no = next("학번", Integer.class, t -> t >0, "학번은 0보다 작을 수 없습니다");
	    for (Student student : students) { 
	        if (student.getNo() == no) {
	            throw new NumberFormatException("");
	        }
        }
	    
	    String name = next("이름", String.class, str-> str.matches("^[가-힣]{2,4}"), "2~4글자의 한글로 구성된 이름을 입력하십시오");
		int kor = next("국어", Integer.class, t->t>=0 && t<=100, "0~100 사이의 숫자 입력");
		int eng = next("영어", Integer.class, t->t>=0 && t<=100, "0~100 사이의 숫자 입력");
		int mat = next("수학", Integer.class, t->t>=0 && t<=100, "0~100 사이의 숫자 입력");
		students.add(new Student(no, name, kor, eng, mat));
    }
	
	public void list() {
		int	input = (next("1. 입력순  2. 학번순  3. 이름순  4. 석차순", Integer.class, t->t>0&&t<5, "정확한 카테고리 입력"));
		System.out.println(input);
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
		default:
			break;
		}
		System.out.println("학번    이름    국어    영어    수학    총점    평균");
		System.out.println("====================================================");
		for(int i = 0 ; i < tmp.size(); i++) {
			System.out.println(tmp.get(i));
		}
		System.out.println("====================================================");
	}
	
	
	public void modify() {
		Student s = findBy(next("학번", Integer.class, t -> t>0, "학번은 0보다 작을 수 없습니다"));
		System.out.println(s);
	    if (s == null) {
	        throw new NumberFormatException();
	    }
		int kor = next("국어", Integer.class, t->t>=0&&t<=100, "1~100 사이의 숫자 입력");
		int eng = next("영어", Integer.class, t->t>=0&&t<=100, "1~100 사이의 숫자 입력");
		int mat = next("수학", Integer.class, t->t>=0&&t<=100, "1~100 사이의 숫자 입력");

		String name = next("이름", String.class, str-> str.matches("^[가-힣]{2,4}"), "2~4글자의 한글로 구성된 이름을 입력하십시오");
		s.setName(name);
		s.setKor(kor);
		s.setEng(eng); 
		s.setMat(mat);
	}

	public void remove() {
		Student s = findBy(next("학번", Integer.class, t -> t > 0, "학번은 0보다 작을 수 없습니다"));
		if(s == null) {
			System.out.println("입력한 학번은 존재하지 않습니다.");
			return;
		}
		students.remove(s);
	}
	
	private Student findBy(int no) { 
		Student student = null;
		for(int i = 0; i < students.size(); i++) {
			if(students.get(i).getNo() == no) {
				student = students.get(i);
			}
		}
		return student;
	 }
}
	

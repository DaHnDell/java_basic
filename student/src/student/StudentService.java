package student;

import static student.StudentUtils.*;
import java.util.Arrays;
import java.util.Scanner;

public class StudentService {
	private Student[] students = new Student[5]; // ss라는 객체는 
	private int cnt=0;
	boolean flag = true;
	Scanner scanner = new Scanner(System.in);
	{
		students[cnt++] = new Student(1, "홍길동", 80, 90, 100); // 예시
	}
	 public void add() { // 학생 등록
		 try {
			 int no = (nextInt("학번"));
			 String name = nextLine("이름");
			 int kor = (nextInt("국어"));
			 int eng = (nextInt("영어"));
			 int mat = (nextInt("수학"));	 
			 if(cnt == students.length) {
				 students = Arrays.copyOf(students, students.length*2);
			 }
			 students[cnt++] = new Student(no, name, kor, eng, mat);
		 }catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
	 }
	public void list() {
		System.out.println("학번    이름    국어    영어    수학    총점    평균");
		System.out.println("====================================================");
		for(int i = 0 ; i < cnt ; i++) {
			System.out.println(Arrays.toString(students));
		}
	 }
	public void modify() { 
		try {
			Student s = findByNo();
			if(s == null) {
				System.out.println("입력한 학번은 존재하지 않습니다");
				return;
			}
			s.setName(nextLine("이름"));
			s.setKor(nextInt("국어"));
			s.setEng(nextInt("영어"));
			s.setMat(nextInt("수학"));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	} 	 

	 public void remove() { 
		 try {
			 Student s = findByNo();
			 if(s > cnt || s < 0) {
				 
			 }
			 for(int i = 0; i < cnt; i++) {
				 if(students[i]==s) { 
					 System.arraycopy(students, i+1, students, i, cnt-- - i - 1);
					 break;
				 }
			 }
		 }catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
	}

	 private Student findByNo() { 
		 Student student = null;
		 int no = nextInt("학번");
		 for(int i = 0; i < cnt; i++) {
			 if(students[i].getNo() == no) {
				 student = students[i];
			 }
		 }
		 return student;
	 }

}
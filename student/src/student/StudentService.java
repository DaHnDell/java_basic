package student;

import static student.StudentUtils.*;

import java.util.Arrays;
import java.util.Scanner;
// 기능부 구현, logics


public class StudentService {
	Student[] students = new Student[5]; // ss라는 객체는 
	int cnt=0;
	boolean flag = true;
	Scanner scanner = new Scanner(System.in);
	{
		students[cnt++] = new Student(1, "홍길동", 80, 90, 100); // 예시
	}
	
	 void add() { // 학생 등록
		 int no = (nextInt("학번"));
		 String name = nextLine("이름");
		 int kor = (nextInt("국어"));
		 int eng = (nextInt("영어"));
		 int mat = (nextInt("수학"));
		 if(cnt == students.length) {
			 students = Arrays.copyOf(students, students.length*2);
		 }
		 students[cnt++] = new Student(no, name, kor, eng, mat);
		 
		 
		 
	 }
	void list() {
//			System.out.println("list()");
		System.out.println("학번    이름    국어    영어    수학    총점    평균");
		 System.out.println("===================================================");
		for(int i = 0 ; i < cnt ; i++) {
			System.out.println(Arrays.toString(students));;
		}
	 }
	 void modify() { 
		 // 학생 점수, 이름 수정 // 학번을 입력받고 학번을 통한 탐색(배열). 학번을 받고 학생을 가져와야 한다. 이름, 국어, 영어, 수학 점수 변경 작업
		 // 출력이 결국 학생이라는 것을 이해해야 함
//		 System.out.println("modify");
//		 int no = StudentUtils.nextInt("수정할 학생의 학번을 입력하세요.") - 1;
//		 while(true) {
//			 printInfo(no);
//			 students[no].update();
////			 System.out.println("수정을 원하는 부분을 선택하세요. ");
////			 System.out.print("> ");
////			 int no2 = scanner.nextInt();
////			 if(no2 ) {
////				 System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
////				 StudentUtils.ret();
////			 }
////			 else {
////				 switch (no2){
////				 	case 1 :
////				 		System.out.println("이름을 무엇으로 변경합니까?"); System.out.print(students[no].name);
////				 		String name = StudentUtils.nextLine("변경될 이름");
////				 		students[no].name = name;
////				 		System.out.println("변경 완료");
////				 		break;
////
////				 	case 2 : 
////				 		System.out.println("국어 점수를 얼마로 변경합니까?"); System.out.print(students[no].kor);
////				 		int kor = StudentUtils.nextInt("변경할 국어");
////				 		students[no].kor = kor;
////				 		System.out.println("변경 완료");
////				 		break;
////
////				 	case 3 : 
////				 		System.out.println("영어 점수를 얼마로 변경합니까?"); System.out.print(students[no].eng);
////				 		int eng = StudentUtils.nextInt("변경할 영어");
////				 		students[no].eng = eng;
////				 		System.out.println("변경 완료");
////				 		break;
////
////				 	case 4 : 
////				 		System.out.println("수학 점수를 얼마로 변경합니까?"); System.out.print(students[no].mat);
//////				 		int mat = StudentUtils.nextInt("변경할 수학");
////				 		students[no].mat = mat;
////				 		System.out.println("변경 완료");
////				 		break;
////				 }
//				 break;
//		 	}

		 Student s = findByNo();
		 if(s == null) {
			 System.out.println("입력한 학번은 존재하지 않습니다");
			 return;
		 }
		 s.setName(nextLine("이름"));
		 s.setKor(nextInt("국어"));
		 s.setEng(nextInt("영어"));
		 s.setMat(nextInt("수학"));
	 } 	 
	 void remove() { // 학생 삭제
//		 System.out.println("remove");
//			 System.out.println("제거할 학생의 학번을 입력하세요.");
//		 		 while(true) {
//		 			 int no = StudentUtils.nextInt(" ") - 1;
//		 			 printInfo(no);
//		 			 System.out.println("정말 다음 학생의 정보를 삭제합니까? Y/N");
//		 			 String flagIf = scanner.nextLine();
//					 if(flagIf.equals("Y")){
////							students[no].name = "(삭제됨)";
////							students[no].kor = 0;
////							students[no].eng = 0;
////							students[no].mat = 0;
//						 	students[no].reset();
//							System.out.println((no + 1)+"번 학생의 정보가 삭제되었습니다.");
//							break; 
//					 }
//					 else if(flagIf.equals("N")) {
//						 System.out.println("초기 화면으로 돌아갑니다.");
//						 break;
//					 }
//		 		 } 
		 
		 Student s = findByNo();
		 for(int i = 0; i < cnt; i++) {
			 if(students[i]==s) {
				 // 삭제처리
				 System.arraycopy(students, i+1, students, i, cnt-- - i - 1);
				 break;//cnt를 이용해서 출력부를 제어하는 형식으로 cnt --를 사용하는 이유가 바로 이것
			 }
		 }
		 
	}
	 
	 Student findByNo() { // 학번으로 조회 리턴타입은 학생
		 Student student = null;
		 int no = nextInt("학번");
		 for(int i = 0; i < cnt; i++) {
			 if(students[i].getNo() == no) {
				 student = students[i];
			 }
		 }
		 return student;
	 }
	 
//	 void printInfo(int no) { // 복사 붙여넣기
//		 System.out.printf("%4d %4s %6d %7d %7d %7d %7.2f\n",
//					students[no].no,
//					students[no].name,
//					students[no].kor,
//					students[no].eng,
//					students[no].mat,
//					students[no].total(),
//					students[no].avg()
//					);
//	 }

}
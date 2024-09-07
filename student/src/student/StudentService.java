package student;

import java.util.Arrays;
import java.util.Scanner;
// 기능부 구현, logics


public class StudentService {
	Student[] students = new Student[5];
	int cnt=0;
	boolean flag = true;
	Scanner scanner = new Scanner(System.in);
	{
		students[cnt++] = new Student(1, "홍길동", 80, 90, 100); // 예시
	}
	
	 void add() { // 학생 등록
//		 System.out.println(cnt++);
////		 System.out.println("add()");
////		 System.out.println("학번, 이름, 국어, 영어, 수학");
//		 while(true) {
//			 
////			 int no = cnt+1;
////			 students[cnt++].regist();	
////			 String name = StudentUtils.nextLine("이름");
////			 int kor = StudentUtils.nextInt("국어");
////			 int eng = StudentUtils.nextInt("영어");
////			 int mat = StudentUtils.nextInt("수학");
////			 System.out.print("학번 " + cnt + "이름" + name + "국어" + kor + "영어" + eng + "수학" + mat + "\n 위 내용을 등록합니까? Y/N");
//			 System.out.print("학번 " + cnt);
//			 String flagIf= scanner.nextLine(); // 길이 참조자
//			 if(flagIf.equals("Y")){
//				 if (cnt == students.length) {
//					 System.out.println("length warning");
//					 students = Arrays.copyOf(students, students.length*2);
//				 }
//				 students[cnt++].regist();		//(cnt, name, kor, eng, mat);
//				 System.out.println("초기 화면으로 돌아갑니다.");
//				 break;
//			 }
//			 else if(flagIf.equals("N")) {
//				 System.out.println("다시 입력합니다.");
//				 StudentUtils.ret();
//			 }
//			 else {
//				 System.out.println("초기 화면으로 돌아갑니다.");
//				 break;
//			 }
//		 }
//		 cnt++;
//			 if(cnt == students.length){
//				 System.out.println("length warning");
//				 students = Arrays.copyOf(students, students.length*2);
//			 }
//			 students[cnt].regist();
		 while(true) {
//			 int no = cnt+1;
			 String name = StudentUtils.nextLine("이름");
			 int kor = StudentUtils.nextInt("국어");
			 int eng = StudentUtils.nextInt("영어");
			 int mat = StudentUtils.nextInt("수학");
			 System.out.print("학번 " + cnt + "이름" + name + "국어" + kor + "영어" + eng + "수학" + mat + "\n 위 내용을 등록합니까? Y/N");
			 String flagIf= scanner.nextLine();
			 if(flagIf.equals("Y")){
				 if (cnt+1 == students.length) { //길이 추가
					 System.out.println("length warning");
					 students = Arrays.copyOf(students, students.length*2);
				 }
				 students[cnt++] = new Student(cnt, name, kor, eng, mat);
				 System.out.println("초기 화면으로 돌아갑니다.");
				 break;
			 }
			 else if(flagIf.equals("N")) {
				 System.out.println("다시 입력합니다.");
				 StudentUtils.ret();
			 }
			 else {
				 System.out.println("초기 화면으로 돌아갑니다.");
				 break;
			 }
		 }
	 }
		void list() {
//			System.out.println("list()");
			System.out.println("학번  이름  국어  영어  수학  총점  평균");
			 System.out.println("========================================");
			for(int i = 0 ; i < cnt ; i++) {
				printInfo(i);
			}
	 }
	 void modify() { 
		 // 학생 점수, 이름 수정
//		 System.out.println("modify");
		 int no = StudentUtils.nextInt("수정할 학생의 학번을 입력하세요.") - 1;
		 while(true) {
			 printInfo(no);
			 students[no].update();
//			 System.out.println("수정을 원하는 부분을 선택하세요. ");
//			 System.out.print("> ");
//			 int no2 = scanner.nextInt();
//			 if(no2 ) {
//				 System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
//				 StudentUtils.ret();
//			 }
//			 else {
//				 switch (no2){
//				 	case 1 :
//				 		System.out.println("이름을 무엇으로 변경합니까?"); System.out.print(students[no].name);
//				 		String name = StudentUtils.nextLine("변경될 이름");
//				 		students[no].name = name;
//				 		System.out.println("변경 완료");
//				 		break;
//
//				 	case 2 : 
//				 		System.out.println("국어 점수를 얼마로 변경합니까?"); System.out.print(students[no].kor);
//				 		int kor = StudentUtils.nextInt("변경할 국어");
//				 		students[no].kor = kor;
//				 		System.out.println("변경 완료");
//				 		break;
//
//				 	case 3 : 
//				 		System.out.println("영어 점수를 얼마로 변경합니까?"); System.out.print(students[no].eng);
//				 		int eng = StudentUtils.nextInt("변경할 영어");
//				 		students[no].eng = eng;
//				 		System.out.println("변경 완료");
//				 		break;
//
//				 	case 4 : 
//				 		System.out.println("수학 점수를 얼마로 변경합니까?"); System.out.print(students[no].mat);
////				 		int mat = StudentUtils.nextInt("변경할 수학");
//				 		students[no].mat = mat;
//				 		System.out.println("변경 완료");
//				 		break;
//				 }
				 break;
		 	}
	 } 	 
	 void remove() { // 학생 삭제
//		 System.out.println("remove");
			 System.out.println("제거할 학생의 학번을 입력하세요.");
		 		 while(true) {
		 			 int no = StudentUtils.nextInt(" ") - 1;
		 			 printInfo(no);
		 			 System.out.println("정말 다음 학생의 정보를 삭제합니까? Y/N");
		 			 String flagIf = scanner.nextLine();
					 if(flagIf.equals("Y")){
//							students[no].name = "(삭제됨)";
//							students[no].kor = 0;
//							students[no].eng = 0;
//							students[no].mat = 0;
						 	students[no].reset();
							System.out.println((no + 1)+"번 학생의 정보가 삭제되었습니다.");
							break; 
					 }
					 else if(flagIf.equals("N")) {
						 System.out.println("초기 화면으로 돌아갑니다.");
						 break;
					 }
		 		 } 
			}
	 void printInfo(int no) { // 복사 붙여넣기
		 System.out.printf("%4d %4s %6d %7d %7d %7d %7.2f\n",
					students[no].no,
					students[no].name,
					students[no].kor,
					students[no].eng,
					students[no].mat,
					students[no].total(),
					students[no].avg()
					);
	 }

}
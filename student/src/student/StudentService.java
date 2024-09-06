package student;



// 기능부 구현, logics
public class StudentService {
	Student[] students = new Student[5];
	int cnt;
	{
		students[cnt] = new Student(1, "새똥이", 80, 90, 100);
		students[cnt] = new Student(1, "개똥이", 70, 60, 100);
	}
	
	 void add() { // 학생 등록
//		 System.out.println("add()");
//		 System.out.println("학번, 이름, 국어, 영");
		 int no = StudentUtils.nextInt("학번");
		 
	 }
	 void list() { // 등록된 학생 목록 출력
//		 System.out.println1("list");
		 System.out.println("학번  이름  국어  영어  수학  총점  평균");
		 System.out.println("========================================");
		 for(int i = 0; i < cnt; i++) {
			 System.out.printf("%5d %4s %7d %7d %7d %7d %7.2f \n", // 이름  국어  영어  수학  총점  평균
					 students[i].no,
					 students[i].name,
					 students[i].kor,
					 students[i].eng,
					 students[i].mat,
					 students[i].total(),
					 students[i].avg()			 
					 ); 
		 }
	 }
	 void modify() { // 학생 점수, 이름 수정
		 System.out.println("modify");
		 
	 } 	 
	 void remove() { // 학생 삭제
		 System.out.println("remove");
		 
	 } 
	 
}

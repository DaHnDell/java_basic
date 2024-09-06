package student;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		// UI 담당 (은행 예제와 비슷한 WHILE 문 사용)
		// 정보는 당연하고, 각 정보에 대한 개별적인 수정 및 추가..?
		// 학생 데이터 삭제도 당연히 .
		// CreateReadUpdateDelete 작업 
		// 배열의 길이 늘리기 작업 참고 + Car를 가지고 만들었던 Car 배열 
		// 삭제 = 학번을 받아서 삭제 / 수정 = 학번을 받아서 수정
		
		
		Scanner scanner = new Scanner(System.in);
		StudentService ss = new StudentService();
		
		while(true) {
//			System.out.println();
//			int input = Integer.parseInt(scanner.nextLine());
			int input = StudentUtils.nextInt("1. 조회 2. 등록 3. 수정 4. 삭제 5. 종료");
			switch(input) {
			case 1: 
//				System.out.println("조회");
				ss.list();
				break;
			case 2: 
//				System.out.println("등록");
				ss.add();
				break;
			case 3: 
//				System.out.println("수정");
				ss.modify();
				break;
			case 4: 
//				System.out.println("삭제");
				ss.remove();
				break;
			case 5: 
//				System.out.println("종료");
				return;
			default:
				break;
			}
		}	
	}
}

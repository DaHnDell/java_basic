package student;
import java.util.Scanner;

<<<<<<< HEAD
=======
import student.RangeException;
// 웬만하면 예외처리는 예외처리 파트나, 메인에서. 로직부 구현은 로직만 사용한다.
// 서비스(로직부)에서는 무조건 던지기만 해야 함..catch 부분은 메인에서 받아야 함


>>>>>>> cb70af044ace8661ed33895dbb0506af921fd1a2
public class StudentMain {
	public static void main(String[] args) {
		StudentService ss = new StudentService();
		while(true) {
			try {
				int input = (StudentUtils.nextInt("1. 조회 2. 등록 3. 수정 4. 삭제 5. 종료")); //ss.checkRange
				switch(input) {
				case 1: 
<<<<<<< HEAD
=======
					ss.cloneAndSort();
>>>>>>> cb70af044ace8661ed33895dbb0506af921fd1a2
					ss.list();
					ss.cloneAndSort();
					break;

				case 2: 
					ss.cloneAndSort();
					ss.add();

					break;

				case 3: 
					ss.cloneAndSort();
					ss.modify();

					break;
					
				case 4: 
					ss.cloneAndSort();
					ss.remove();
	
					break;

				case 5: 
					System.out.println("종료합니다.");
					return;
					
				default:
					break;
				}
			}catch(NumberFormatException e) {
				System.out.println(e.getMessage()); // 자바랭에서 호출하는 throw 때문에 우리가 별도의 메세지를 수정할 수 없음 . 따 라서 그냥 메세지 한줄 출력하고 마는 것.
				System.out.println("정확한 숫자를 입력하세요");
			}catch(RuntimeException e) {
				System.out.println(e.getMessage());
			}
		}	
	}

}


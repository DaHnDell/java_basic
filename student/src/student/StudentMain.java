package student;

import java.io.IOException;

// 웬만하면 예외처리는 예외처리 파트나, 메인에서. 로직부 구현은 로직만 사용한다.
// 서비스(로직부)에서는 무조건 던지기만 해야 함..catch 부분은 메인에서 받아야 함
// 영속성의 여보

public class StudentMain {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		StudentService ss = new StudentService();
		while (true) {
			int input = (StudentUtils.next("1. 조회 2. 등록 3. 수정 4. 삭제 5. 종료", Integer.class, t -> t > 0 && t < 6,
					"정확한 카테고리값 입력"));
			try {
				switch (input) {
					case 1:
						ss.list();
						ss.cloneAndSort();
						break;
	
					case 2:
						ss.add();
						ss.cloneAndSort();
						break;
	
					case 3:
						ss.modify();
						ss.cloneAndSort();
						break;
	
					case 4:
						ss.remove();
						ss.cloneAndSort();
						break;
	
					case 5:
						System.out.println("종료합니다.");
						return;
	
					default:
						break;
				}
			} catch (IOException I) {
				System.out.println(I.getMessage());
			} catch (ClassNotFoundException C) {
				System.out.println(C.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

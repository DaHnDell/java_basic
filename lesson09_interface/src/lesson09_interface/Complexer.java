package lesson09_interface; // alt + s + v

public class Complexer implements Printer, Scanner, Fax{
// 인터페이스의 모든 추상메서드는 반드시 구현되어야 함
	@Override
	public void send(String tel) {
		System.out.println(FAX_NUMBER + "에서 " + tel + " 로 FAX 전송");
	}

	@Override // 아래의 메서드가 오버라이드 메서드인지 아닌지 검증할 수 있는 기능을 가진다. 일종의 체크 전용 
	public void receive(String tel) {
		System.out.println(tel + "에서 " + tel + "로 FAX 수신");
	}

	@Override
	public void scan() {
		System.out.println("스캔 실행");
	}

	@Override
	public void print() {
		System.out.println("출력 실행");
	}
}

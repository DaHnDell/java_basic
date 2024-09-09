package marble;

public class Player {
	String name;
	int money = 200000; //한바퀴당 30만원 자금 추가
	int idx;
	
	public Player(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name + "이" + idx + "번째 위치에 존재합니다. 현재 자산은 " + money + "입니다.";
	}
	
}

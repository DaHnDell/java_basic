package lesson09_interface_starcraft;


@SupressWarnings ({"unused", "deprecation"})
public class starcraftMain {
	public static void main(String[] args) {
		SCV scv = new SCV();
		Marine marine = new Marine();
		scv.repair(marine);
		
		SeigeTank seigetank = new SeigeTank();
		seigetank.toggleSiege();
		
		scv.repair(seigetank);
		
		RepairAble r = new Wraith(); // 인스턴스 오브 메서드를 통해 이미 수리 가능 여부를 판단하고 넘어왔기 때문에 
		RepairAble r2 = new SCV();
		
		Unit[] units = new Unit[12];
		
		RepairAble.sm();
		seigetank.dm();
//		marine.dm();
//		String s = -> "abcd"
		Finter finter = s -> "abcd"; // 함수형 인터페이스 사용
	}
}

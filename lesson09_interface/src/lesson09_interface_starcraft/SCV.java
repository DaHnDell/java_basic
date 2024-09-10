package lesson09_interface_starcraft;

public class SCV extends GroundUnit implements RepairAble{
//	void repair(Unit u) { // 다형성 형태로 전달
	void repair(Unit u) {
		if(!(u instanceof RepairAble)) {
			System.out.println("수리 불가 대상");
			return;
		}
	}	
}

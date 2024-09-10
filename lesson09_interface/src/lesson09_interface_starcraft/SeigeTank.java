package lesson09_interface_starcraft;

public class SeigeTank extends GroundUnit implements RepairAble{
	boolean siege;
	
	void toggleSiege() {
		siege = !siege;
	}
}

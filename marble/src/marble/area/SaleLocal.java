package marble.area;
//
public abstract class SaleLocal extends Local{
//	String color;
	int colorIdx;

	public SaleLocal(int colorIdx, int idx, String name) {
		super(name, idx);
		this.colorIdx = colorIdx;
	}
	
	
}

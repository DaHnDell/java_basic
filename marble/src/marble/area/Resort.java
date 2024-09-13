package marble.area;

public class Resort extends SaleLocal{
	static final int BUILD_COST = 10; // 관광지는 상수값으로 정해져 있음..!
	public static final int FEE = 8; // 인트 배열의 고정값 
//	public static final int FEE2 = 16; // 인트 배열의 고정값 
//	public static final int FEE3 = 32; // 인트 배열의 고정값
	public static final int SALE_PRICE = BUILD_COST / 2; // 5;
	
	public Resort(int colorIdx, String name, int idx) {
		super(colorIdx, idx, name);
		// TODO Auto-generated constructor stub
	}
	
	
	
}

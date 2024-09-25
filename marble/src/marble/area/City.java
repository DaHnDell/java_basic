package marble.area;
//
public class City extends SaleLocal{
	
	public City(int colorIdx, String name, int idx) {
		super(colorIdx, idx, name);
	}

	public int building;
	
	public int[] buildCost = {22, 8, 24, 40, 40}; //  건설비용
	public int[] fee = {8, 16, 34, 70, 60};

//	public City(int colorIdx, String name, int idx, int[] buildCost, int[] fee) {
//		super(colorIdx, idx, name);
//		this.buildCost = buildCost; // 건설비용
//		this.fee = fee; // 통행료
//	}
	
	public int getFee() {
		
		int cnt = 0;
		int feeResult = fee[cnt++]; // city.getFee();
		int i = building;
		while(i != 0) {
//			System.out.println(i%2);
			if(i%2 == 1) {
				feeResult += fee[cnt]; 
			}
			cnt++;
			i/=2;
		}
		return feeResult;
	}
}


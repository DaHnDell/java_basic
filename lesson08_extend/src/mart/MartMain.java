package mart;

public class MartMain {
	public static void main(String[] args) {
		// 상품에 관한 것은 상속으로 만들고 기반 클래스가 필요
		Buyer buyer = new Buyer(500);
		
		while(true) {
			int input = MartUtils.nextInt("1. 상품 선택   2. 결제 하기   3. 종료 하기"
					+ "");
			
			switch (input) {
			case 1: 
			{
				int i2 = MartUtils.nextInt("1. Tv   2. Computer   3. Airconditioner   4. 취 소");
				switch(i2) {
					case 1 :
						buyer.buy(new Tv());
						break;
					case 2 :
						buyer.buy(new Computer());
						break;
					case 3 :
						buyer.buy(new Airconditioner());
						break;
					default :
						break;
				}
				break;
			}
			case 2: 
			{
				buyer.purchase();
				break;
			}
			case 3: 
			{
				System.out.println(" 종 료 ");
				break;
			}
			default:
				break;
			}
					
				
		}
	}
}

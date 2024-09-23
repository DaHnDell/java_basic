package hw0920;

public class CardMain {
	public static void main(String[] args) {
		Deck deck = new Deck();

		while(true) {
			int input = CardUtils.next("1.목록 보기 ::  2. 섞기  ::  3. 한장 뽑기  ::  4. 종료", Integer.class, t-> t>0 && t<5, "올바른 숫자를 입력하세요" );
			switch(input) {
			case 1:
				deck.setCard();
				deck.printCard();
				break;
			case 2 :
				deck.setCard();
				deck.shuffle();
				break;
			case 3 :
				deck.setCard();
				deck.pickOne();
				break;
			case 4:
				System.out.println("종료합니다");
				return;
			default :
				break;
			}
			
		}
	}
}

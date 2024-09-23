package hw0920;

public class Card {
	// 카드에 대한 특성에 대한 필드를 규정
	// 사실 모양이랑 번호만 있으면 됨.
	private String cardNum; // 카드에 적혀있는 번호 역할(잭퀸킹, 에이스 포함)
	private String cardKind; //클로버 하트 다이아 스페이드

	public Card(String cardNum, String cardKind) {
		this.cardNum = cardNum;
		this.cardKind = cardKind;
	}

	@Override
	public String toString() {
		return String.format("[번호 ::  %s , 종류 ::  %s ]\n", cardNum, cardKind);	
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getCardKind() {
		return cardKind;
	}

	public void setCardKind(String cardKind) {
		this.cardKind = cardKind;
	}
}

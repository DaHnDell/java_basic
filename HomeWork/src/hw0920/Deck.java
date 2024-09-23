package hw0920;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	// 카드들
	private List<Card> cardlist = new ArrayList<Card>(); //
	private Card topCard;
	
	{
		System.out.println("초기화 블럭 시작");
		for(int i = 0; i < 4; i++) { // 카드 종류
			for(int j = 1; j <=13; j++) { // 이게 카드 번호
				cardlist.add(new Card(Integer.toString(j), Integer.toString(i)));
			}
		}
		cardlist.add(new Card(Integer.toString(0), "흑"));
		cardlist.add(new Card(Integer.toString(0), "색"));
	}
	
	void printCard( ) {
		List<Card> pCard = new ArrayList<>(cardlist);
		System.out.println(pCard);
	}
	
	
	// 섞기
	void shuffle() {
		List<Card> sCard = new ArrayList<>(cardlist);
		Collections.shuffle(sCard);
		System.out.println(sCard);
		topCard = sCard.get(0);
	}
	// 맨위에서 한장 뽑기
	void pickOne() {
		System.out.println(topCard);
	}
	
	void setCard() { // 문양 넣기
		for(Card c : cardlist) { // 향상 for는 우측에 있는 것보다 좌측이 한단계 낮은 것 으로 선언해주고 타입은 당연히 같아야함
			// 타입명 변수명에다가 우측의 길이만큼 반복하는데, 향상for문은 인덱스에 따른 추가적 조치가 없을 경우 사용하기 용이하다.
			// 증감자의 정보가 필요하지 않을 때 사용하면Damn.
			// 카드에서 사용한 이유는 결국 전체 데이터에 덧씌우기 하면 되는거라 이렇게 했음.
			if(c.getCardKind().equals("0")) {
				c.setCardKind("♣");
			} else if(c.getCardKind().equals("1")) {
				c.setCardKind("♥");
			} else if(c.getCardKind().equals("2")) {
				c.setCardKind("♦");
			} else if(c.getCardKind().equals("3")){
				c.setCardKind("♠");
				}
			
			if(c.getCardNum().equals("11")) {
				c.setCardNum("J");
			}else if(c.getCardNum().equals("12")) {
				c.setCardNum("Q");
			}else if(c.getCardNum().equals("13")) {
				c.setCardNum("K");
			}else if(c.getCardNum().equals("1")) {
				c.setCardNum("Ace");
			} else if(c.getCardNum().equals("0")) {
				c.setCardNum("조커");
			}
		}
	}


}

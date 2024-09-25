package marble;
//
import java.util.Arrays;

import marble.area.City;
import marble.area.Local;
import marble.area.NonSaleLocal;
import marble.area.Resort;

public class GameService {
	Local[] locals = new Local[32];
	int[] lands = new int[32];
	Player[] players = new Player[3];
	
	{
		int idx = 0;
		players[idx++] = new Player("길동이");
		players[idx++] = new Player("둘리");
		players[idx++] = new Player("도우너");
		initlocal();
	}
	
	public void printMap() {
		String[] playerPos = new String[32];	
		
		String[] icons = {"1", "2", "3"};
		Arrays.fill(playerPos, "");
		
		for(int i = 0 ; i < players.length; i++) {
			playerPos[players[i].idx] += icons[i];
		}
		for(int i = 0; i < locals.length; i++) {
			System.out.printf("%-10s", locals[i]);
			if(i % 8 == 7) {
				System.out.println();
			}
		}
	}
	
	public void play() {
		for(int i = 0; ; i++) {
			printMap();
			int seq = i%players.length;
			Player p = players[seq];
			for(int j = 0 ; j < 3; j++) {
				MarbleUtils.nextLine(players[seq].name + "의 차례입니다. 엔터 입력시 주사위 굴림"); 
				
				int dice = (int)(Math.random() * 6 ) + 1 ;
				int dice2 = (int)(Math.random() * 6) + 1;
				
				System.out.println("==== 주사위의 눈은 " + dice + "," +  dice2 + "입니다");
				// 3연 더블일 시 무인도로 포지션 변경
				if (j == 2) {
					System.out.println(" 3번 연속 더블이라 무인도 직행! ");
					p.idx  = 8;
					break;
				}
				int tmppos = p.idx += dice + dice2;
				
				if(tmppos > 31) {
					System.out.println("시작점 통과! 보너스 지급 (30만)");
					p.money += 300000;
				}
				p.idx = tmppos % 32;
				// 더블이 아닐 때 연속 던지기 멈춤(콤보 끝)
				if(dice != dice2) {
					break;
				}
//				int doubleCnt = 1;
				System.out.println("더블! 한번 더!" + j+1 + "Combo!");
			System.out.println(p);
			}
			
		}
		
	}
	
	public void initlocal() {

		String names = "시작 > 방콕 > 보너스게임(동전던지기) > 베이징 > 포츈카드 > 독도 > 두바이 > 카이로 > 무인도 > 발리 > 도쿄 > 시드니 > 포츈카드 > 퀘백 > 하와이 > 상파울루 > 올림픽 > 프라하 > 푸켓 > 베를린 > 포츈카드 > 모스크바 > 제네바 > 로마 > 세계여행 > 타히티 > 런던 > 파리 > 포츈카드 > 뉴욕 > 국세청 > 서울";
		String[] ns = names.split(" > ");
		int cnt = 0;
		
		locals[cnt] = new NonSaleLocal(0, ns[cnt], cnt++);
		locals[cnt] = new City(0, ns[cnt], cnt++);
		locals[cnt] = new NonSaleLocal(1, ns[cnt], cnt++);
		locals[cnt] = new City(0, ns[cnt], cnt++);
		locals[cnt] = new NonSaleLocal(2, ns[cnt], cnt++);
		locals[cnt] = new Resort(0, ns[cnt], cnt++);
		locals[cnt] = new City(0, ns[cnt], cnt++);
		locals[cnt] = new City(0, ns[cnt], cnt++);
		
		locals[cnt] = new NonSaleLocal(3, ns[cnt], cnt++);
		locals[cnt] = new Resort(1, ns[cnt], cnt++); // 발리
		locals[cnt] = new City(0, ns[cnt], cnt++);
		locals[cnt] = new City(0, ns[cnt], cnt++);
		locals[cnt] = new NonSaleLocal(2, ns[cnt], cnt++);
		locals[cnt] = new City(0, ns[cnt], cnt++);
		locals[cnt] = new Resort(0, ns[cnt], cnt++);
		locals[cnt] = new City(0, ns[cnt], cnt++);
		
		locals[cnt] = new NonSaleLocal(4, ns[cnt], cnt++);
		locals[cnt] = new City(0, ns[cnt], cnt++);
		locals[cnt] = new Resort(0, ns[cnt], cnt++);
		locals[cnt] = new City(0, ns[cnt], cnt++);
		locals[cnt] = new NonSaleLocal(2, ns[cnt], cnt++);
		locals[cnt] = new City(0, ns[cnt], cnt++);
		locals[cnt] = new City(0, ns[cnt], cnt++);
		locals[cnt] = new City(0, ns[cnt], cnt++);
		
		locals[cnt] = new NonSaleLocal(5, ns[cnt], cnt++);
		locals[cnt] = new Resort(1, ns[cnt], cnt++); // 타히티
		locals[cnt] = new City(0, ns[cnt], cnt++);
		locals[cnt] = new City(0, ns[cnt], cnt++);
		locals[cnt] = new NonSaleLocal(2, ns[cnt], cnt++);
		locals[cnt] = new City(0, ns[cnt], cnt++);
		locals[cnt] = new NonSaleLocal(6, ns[cnt], cnt++);
		locals[cnt] = new City(0, ns[cnt], cnt++);
		
		
//				new City(0, "서울", 0, new int[] {22, 8, 24, 40, 40}, new int[] {8, 16, 34, 70, 60});
	}
	
}

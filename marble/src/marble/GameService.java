package marble;



public class GameService {
	int[] lands = new int[32];
	Player[] players = new Player[3];
	{
		int idx = 0;
		players[idx++] = new Player("길동이");
		players[idx++] = new Player("둘리");
		players[idx++] = new Player("도우너");
	}
	public void play() {
		for(int i = 0; ; i++) {
			int seq = i%players.length;
			Player p = players[seq];
			MarbleUtils.nextLine(players[seq].name + "의 차례입니다. 엔터 입력시 주사위 굴림"); 
			int dice = (int)(Math.random() * 6 ) + 1 ;
			int dice2 = (int)(Math.random() * 6) + 1;
			System.out.println("==== 주사위의 눈은 " + dice + "," +  dice2 + "입니다");
			int tmppos = p.idx += dice + dice2;
			if(tmppos > 31) {
				System.out.println("시작점 통과! 보너스 지급 (30만)");
				p.money += 300000;
			}
			p.idx = tmppos % 32;
			
			System.out.println(p);
			
			
		}
		
	}
}

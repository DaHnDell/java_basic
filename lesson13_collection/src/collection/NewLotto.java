package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class NewLotto {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		while(set.size()<6) {
			set.add((int)(Math.random()*45)+1);
		}
		System.out.println(set);
		// 개별 탐색
		// 1. 향상 for
		// 
		for(Integer i : set) {
			System.out.println(i-1);
		}
		// 2. iterator로 변경
		Iterator<Integer> iter = set.iterator();
//		iter.next();
//		iter.hasNext();
		while(iter.hasNext()) {
			System.out.println(iter.next() - 1);
		}
		// 위 두가지를 주로 사용하는 편임.
		// 이터레이터는 사실 노드의 연속체임 -> 연결리스트와 비슷함.
		// next 를 사용할 경우 - > 일단 가지고 있는걸 반환하고 다음 위치로 커서 포인터를 옮겨 줌. 즉, 다음 노드의 위치를 알고 있는것과 동일함.
		// 
	}
}

class loot {
	public loot() {
	}
}

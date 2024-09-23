package lesson14_generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericEx4 {
	public static void main(String[] args) {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		// 리스트 타입 선언, 키 형식으로 스트링과 오브젝트를 가지는 자료형을 가지는 리스트. 초기화.
		// 맵이 편리하긴 한데 따로 클래스를 선언해서 하는 것이 훨씬 더 안정적이긴 함.(타입세이프)
		Map<String, Object> hm = new HashMap<String, Object>(); 
		// hm 
		hm.put("name", "홍길동");
		hm.put("id", "hong");
		hm.put("age", 30);
		// age 옆에 교재와 같이 문자열 식으로 "30" 을 넣었더니, 아래 프린트포멧에서 문제가 발생함; object 형식으로 타입을 받아오기 때문에 컴파일 단계에서의 문제가 발생하지는 않음.
		list.add(hm);
		
		hm = new HashMap<String, Object>();
		hm.put("name", "김유신");
		hm.put("id", "kim");
		hm.put("age", 40);
		list.add(hm);
		
		hm = new HashMap<String, Object>();
		hm.put("name", "이순신");
		hm.put("id", "lee");
		hm.put("age", 30);
		list.add(hm);
		// 이런 형식의 map을 활용하는 다차원적인 자료구조 형태의 사용은 매우 자주 나옴
		for(int i = 0; i < list.size(); i++) {
			System.out.printf("인덱스 : %d, 이름 : %s, 아이디 : %s, 나이 : %d\n", i, list.get(i).get("name"), list.get(i).get("id"), list.get(i).get("age"));
		}
	}
}

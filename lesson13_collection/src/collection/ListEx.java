package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>(); // 인스턴스를 생성할 때 이런식으로 하지 마! 
		// 이 놈들은 자기 혼자 쓰려고 할 게 아니라, 너희의 값을 담아두려고 하는 거니까
		// 제네릭 형식의 타입 선언을 통해서 형식을 지정해!
		// 
		// 개발자 : 음 그래그래 나는 object 형식의 데이터를 사용 할 거야! 내가 보장할게!
//		음 그래그래 object 타입을 받는다는 거구나! 알겠어~ 아래에서 호출할때도 Integer 형식인걸 나도 외워 놓을게!
		list.add(1);
		// 제네릭 안쓰고 오브젝트 선언하지 마!
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
//		list.add("가나다라");
//		list.add(new List<E>());
		
		System.out.println(list);
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			
			System.out.println(i + "::" + list.get(i));
//			sum+= (Integer)(list.get(i));
//			sum += list.get(i);
		}
		System.out.println(sum);
		
	}
}

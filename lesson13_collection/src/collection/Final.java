package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Final {
	public static void main(String[] args) {
		//Arrays, Collections
		//Arrays sort는 comparable을 구현한 상태여야만 함. 혹은 comparator 를 구현하여 할 수도 있음.
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4)); // 가변 파라미터를 가지는 메서드, 배열을 리스트로 변환이 가능 // add를 통해서 추가할 경우 문제가 생길 수 있지만, new 생성자를 통해 새롭게 만들 경우 길이에 가변적으로 추가 가능
		
		System.out.println(list);
		list.add(10);
		
		//Integer 배열은 Integer 리스트가 될 수 있지만, int 배열은 될 수 없음.
		
		Integer[] arr = {1, 2, 3, 4}; // 래퍼 클래스와 기본 자료형 사이에 형변환이 자유롭다고 하지만, 이런 면에선 또 엄격함.
		list = Arrays.asList(arr);
		list.toArray(arr);
		System.out.println(Arrays.toString(arr)); // 이렇듯 배열과 리스트 간의 전환이 자유롭게 이루어져야 함.
		
		Collections.shuffle(list); //셔플
		System.out.println(list);
		
		Collections.sort(list); //얘는 비교자가 필요하지 않음.
//		Collections.reverseOrder(list);
		Collections.reverse(list);
		System.out.println(list);
//		Collections.
	}
}

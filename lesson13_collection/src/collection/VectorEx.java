package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector<Double> vector = new Vector<>();
//		list<Double> vector = new Vector<>();
		
		// add, size, get
		vector.add(Math.PI);
		System.out.println(vector.size());
		System.out.println(vector.get(0));
		
		vector.addElement(Math.E);
		
		System.out.println(vector.elementAt(0));
		vector.remove(0);
		vector.removeElement(vector); // 벡터만이 가지고 있는 고유한 벡터 메서드
		
		System.out.println(vector);
		
//		Vector : legacy class;
		
		List<Double> list = new ArrayList<Double>(vector);
		// 컬렉션 타입의 인터페이스를 구성한 것, 해당 엘리먼트 파일에 대한 하위 클래스
		System.out.println(list);
		// 사실상 위와 같은 클론은 생성자를 통한 클론;
		// 리스트는 더할떄 add 쓰고 뺄때 remove를 사용한다 정도만 기억하자!
	}
}

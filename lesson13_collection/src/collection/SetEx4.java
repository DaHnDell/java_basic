package collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetEx4 {
	public static void main(String[] args) {
//		Set<Integer> set = new TreeSet<>(new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2-o1;
//			}
//			// 구현 메소드가 하나밖에 없는 미 구현 인터페이스를 한번에 표현할 수 있는 것이 바로 람다식
//		});
		Set<Integer> set = new TreeSet<>((i1, i2) ->{return i2 - i1;}); 
//		Set<Integer> set = new TreeSet<>((i1, i2)->i2-i1); 
		
		set.add(100);
		set.add(99);
		set.add(7);
		set.add(13);
		set.add(15);
		
		System.out.println(set);
		
		Set<Object> set2 = new TreeSet<>();
		set2.add("홍길동");
		set2.add("고길동");
		set2.add("새똥이");
		set2.add("개똥이");
//		set2.add(1);
		System.out.println(set2);
		
		Set<Member> members = new TreeSet<>(new Comparator<Member>(){

			@Override
			public int compare(Member o1, Member o2) {
				return o1.age - o2.age;
			}
			//  위와 같은 방식으로 자바의 소트도 구현하기 때문에 익혀두는것이 중요함!!
		});
		members.add(new Member("홍길동", 40));
		members.add(new Member("홍길동", 30));
		members.add(new Member("홍길동", 20));
		
		System.out.println(members);
		
		// treeset에 저장될 자료를 만족할 조건
		// 1. Comparable 인터페이스를 구현한 객체 // 적어도 구현을 해야하는 객체여야 한다는 거임 // 
		// 2. 혹은 Comparator를 별도로 지정 // 이놈은 좀 별개임! 트리셋을 만들었을때 
		// 
//		@Override
		members = new TreeSet<>((o1, o2) -> o1.name.compareTo(o2.name));
		members.add(new Member("홍길동", 40));
		members.add(new Member("고길동", 40));
		members.add(new Member("새똥이", 40));
		members.add(new Member("개똥이", 40));
		
		System.out.println(members);
		
	}
}

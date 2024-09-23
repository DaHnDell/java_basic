package collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetEx2 {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<>();
		set.add("가");
		set.add("가");
		Member member = new Member("홍길동", 40);
//		set.add(new Member("홍길동", 40));
		set.add(member);
//		set.add(member);
		set.add(new Member("홍길동", 40));
		System.out.println(set);
		System.out.println("홍길동".hashCode());
		System.out.println(new String("홍길동").hashCode());
		
	}
	
	
}

class Member implements Comparable<Member>{
	String name;
	int age;
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
@Override
	public int compareTo(Member o) {
		return -name.compareTo(o.name);
	}
	
	@Override
	public int hashCode() { // 해쉬코드 = 어떤 객체의 주소값을 반환하는 객체의 int 값을 반환해줌.
		return Objects.hash(name, age); // 나이나 이름에 따른 해시 값의 오차를 보장해주기 때문에 훨씬 안전한 방식임.
//		return name.hashCode() + age;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Member)) { 
			return false;
		}
		Member member = (Member)obj;
		return name.equals(member.name)&& age == member.age;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	
	
}

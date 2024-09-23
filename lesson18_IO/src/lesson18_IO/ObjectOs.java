package lesson18_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectOs {
	public static void main(String[] args) throws IOException, IOException, ClassNotFoundException {
		// 객체 덩어리를 통째로 들고 오고 저장해 줌.
		
		
//		List<String> list = new ArrayList<String>(Arrays.asList("가", "나", "다"));
		List<Member> mlist = new ArrayList<Member>(Arrays.asList(new Member("홍길동", 40), new Member("김길동", 20)));
		System.out.println(mlist);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\tj\\Desktop\\oos.txt")); // 부모님이 아웃풋스트림

		oos.writeObject(mlist); // 시리얼라이즈 예외가 발생한다.
		
		// 자바의 입장에서 언제나 입력과 출력을 기록하고 
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));

//		System.out.println(ois.readObject());;
		
		List<Member> result = (List<Member>)ois.readObject(); // 리스트 멤버 타입으로 형변환
		result.forEach(System.out::println);
		
	}
}


class Member implements Serializable { // 시리얼라이저블 키워드를 통해 직렬화 가능이라는 뜻을 의미함. 직렬화 대상은 Serializable
	String name;
	int age; // transient => 작성 시 변경이 불가해지는 값으로 픽스됨.
	// 필드가 변경되거나 추가될 경우 문제가 발생
	// 클래스 필드는 직렬화 불가능. 즉 값을 저장하는데 클래스 변수는 저장하지 않음
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}	
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	
}



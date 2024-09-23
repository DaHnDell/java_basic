package lesson14_generics;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GenericEx6 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException {
		Class<GenericEx6> cls = GenericEx6.class; // 잘 모르겠을땐 ? 써버리기
		// 클래스 인스턴스를 사용해서 클래스의 클래스. 
//		Method[] methods = cls.getMethods();
		Method[] methods = cls.getDeclaredMethods(); // 내가 선언한 배열만 받기!
		
		for(Method m : methods) {
			System.out.println(m.getName());
			if(m.getName().equals("test")){
				m.invoke(new GenericEx6());
			}

		}
		
		GenericEx6 ex6 = cls.newInstance();
		ex6.test();
		GenericEx6.getT(12); // 보통 제네릭은 클래스 우측에 붙이긴 하지만
	
		
		// 클래스 인보케이션, 간접 호출
		
	}
	
	void test() {
		System.out.println("test!!");
	}
	
//	T t;
	
	static <T> Object getT(T t) { // 스태틱이름이 붙어서 클래스 메서드가 되었을 경우.. 이때 static 옆에 쓰는게 의미상, 문법상 문제가 없음. 
		return t;
		// 인스턴스를 통한 호출
	}
}

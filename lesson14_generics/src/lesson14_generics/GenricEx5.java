package lesson14_generics;

import java.util.ArrayList;
import java.util.Comparator;

public class GenricEx5 {
	public static void main(String[] args) {
		
		Gen3 g3 = new Gen3();
//		Generic5<? super Gen2>g2 = new Generic5<Gen1>(g3); // Gen2 이거나 그것에 대한 조상들을 타입으로 받을게요~~ 오브젝트까지도 올라감. 하한.을 정해주는 것.
		// super 자체를 안쓴다는게 아니라, 이렇게까지 해야 할 필요 가 있나..이정도?\
		Generic5<Gen2>g2 = new Generic5<>(g3); // 꼭 g3만 가지는게 아니라 다른 그 어떤 것들로도 가능.
		// 우측에 뭔가 없고 인스턴스만 할 때는 웬만하면 선언해주는게 좋음. 하지만 거진 쓸 일이 없긴 함.
		// 컴퍼레이터를 사용했을 때는 오버라이드를 위해 T 타입에 따른 상호 비교의 대상이 되어야 하기 때문에 무조건 써야 함.
		
		Gen1 t2 = (Gen3)g2.getT();
		Object t1 = g2.getT();
		
		System.out.println(t2.getName());
		Generic5<? extends Gen2> g4 = new Generic5<>(g3); // 자기껀 됨 Gen2 , 자기 자식도 됨 Gen3 / 근데 Gen1은 안됨 // 상한. 이 Gen2인것. 위의 ?super와 다름.
		Gen2 t3 = g4.getT();
		Gen3 t4 = (Gen3)g4.getT(); // 다형성, 조상 타입을 받고 자식 거를 받는다니, 
		
		Generic5<?> g6 = new Generic5<>(g3); // ? 물음표는 Object, 와일드카드, 그 어떤 것이든 올 수 있다 라는 뜻.
		Object t5 = g6.getT();
		Gen3 t6 = (Gen3)g6.getT();
		
		Generic5<?> g7 = new Generic5<>(1);
		System.out.println(g7.getT());
		
//		new ArrayList<E>(null)
		
//		new Comparator<T>() {
//		};
		
		// Class 
		
	}
}
class Gen1 {
	String getName() {
		return getClass().getSimpleName();
	}
}
class Gen2 extends Gen1{}
class Gen3 extends Gen2{}

class Generic5<T>{
	T t;
	public Generic5(T t) {
		this.t = t;
	}
	public T getT() {
		return t;
	}
//	public T set(T t) {
//		this.t = t;
//	}
}

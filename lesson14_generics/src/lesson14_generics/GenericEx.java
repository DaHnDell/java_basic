package lesson14_generics;

public class GenericEx {
	public static void main(String[] args) {
		Box<Integer, String, Object> box = new Box<>(); // 이런 식으로 여러 개의 제네릭 타입을 선언 가능. 이는 컴파일러가 꺽쇠 안의 자료형들을 보장하는 것임.
		box.setItem(10);
		int result = (Integer)box.getItem(); // box가 오브젝트 타입이기때문에 Integer 래퍼를 통한 형변환이 필요함. 최소한..!
		System.out.println(result);
	}
}

class Box<T, R, V>{
	private T item;
	// T만 썼을때 제네릭을 사용하려면 생성자에 선언되는 타입이 무엇인지 정의를 해 줘야 함. 즉 클래스 이름 옆에 <T> 를 
	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	void swap(Object o1, Object o2) {
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}
	
}

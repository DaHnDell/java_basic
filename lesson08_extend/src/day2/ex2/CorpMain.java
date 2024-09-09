package day2.ex2;

public class CorpMain {
	public static void main(String[] args) {
		Employee[] employees = new Employee[5]; // 직원이 들어갈 배열 4개
		int idx = 0;
		employees[idx++] = new Programmer("개똥이");
		employees[idx++] = new Designer("새똥이");
		employees[idx++] = new Designer("말똥이");
		employees[idx++] = new Programmer("소똥이");
		employees[idx++] = new BuyManager("코똥이");
		
		// 추상클래스의 목적은 인스턴스 생성이 아니라, 공통 메소드들끼리의 공통 조상 클래스를 정의해 준다. 문법적으로 인스턴스가 될 수가 없는 이유는(구체화 될 수 없는 이유는) 추상 메소드를 가지고 있기 때문이다.
		// 보통은 추상 메서드를 가지고 있고, 이는 강제는 아니고 선택적인 사항임.
		
		Employee emp = new Employee("미정사원") {
			
			@Override
			void work() {
				// TODO Auto-generated method stub
				System.out.println("업무진행");
			}
		};
		
		for(Employee e : employees) {
			System.out.println("============"+ e.name + "====++====");
			e.startWork();
			
			e.work(); // 인스턴스 메소드가 자손에 의해 재정의가 되며 동적 바인딩을 통해 조상 클래스로는 사용되지 않는다. 즉, 추상화를 통해 틀을 만들고, 이로서 각각의 자손들이 나눠받으며 work 메소드 값을 오버라이딩하는 것.
			e.endWork();
		}
		//  동적 바인딩을 통해 전달하는 과정이 훨씬 더 부드럽고 편하다. 물론 조건문을 사용할 경우 사용할 수 있긴 한데..길어질 경우에 당연히 어렵다
		// 냉장고, 세탁기, 티뷔 샀는데 
	}
}

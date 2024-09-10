package lesson09_interface;

@UserAnno(value = "hey")
public class UserClass {
	@UserAnno("hi") // 만약, 어노테이션의 변수 이름이 value 가 아닐 경우에는 이러한 형식의 특별한 값 지정이 되지 않는다.
	void m1() {
		
	}
	@UserAnno(value = "world", number = 10)
	@SuppressWarnings(value = "unused")
	void m2() {
		
	}
	
	@UserAnno
	int i;
	@UserAnno(value = {"hey","hi","world"}, number = 5)
	int i1;
}

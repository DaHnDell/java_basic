package day2;

public class Init {
	private static Init init =  new Init(); // 클래스 변수는 클래스에 로드될 때 한번만 초기화 된다.
	public Init() {
		System.out.println("초기화");
	}
	public static void main(String[] args) {
		
	}

static int fact(int i) {
	if(i == 1) {
		return 1;
	}
	int res = fact(i - 1) * i;
	return res;
}
}

// 메서드가 어려운 이유는 재귀적 성질을 지니기 때문이다. 위와 같은 현상이 발생하는 이유는 main함수가 재귀적으로 자기 자신을 호출하기 때문이다.
// 반복문의 성질도 있어서, 대치할 수도 있지만 사실 스택상의 계산보다 for 문을 사용하는 것이 훨씬 효과적이다.
package lesson07_oop;

public class MethodMain {
	public static void main(String[] args) {
//		Param p = new Param();
//		int res = p.add(10, 20); // Param 클래스의 p 객체에 있는 add 멤버씨에게 10, 20을 전달해주세요
//		System.out.println(res);
//		System.out.println(p.add(30, 40));
//		System.out.println(p.add(30, p.add(50, 60)));
//		System.out.println(new Param().add(40, 50));
//		int b = Param.add2(1020, 20);
//		System.out.println(b);
//		int c= Param.max(new int[] {10, 20, 5, 30, 1, 4, 50});
//		System.out.println(c);
//		System.out.println(Param.max(new int[] {}));
//		System.out.println(Param.max(null));

		String str = "가나다라";
		String s1 = str
				.substring(0, 2)
				.concat("AB")
				.substring(1, 3); // 체이닝 기법
		
		System.out.println(s1);
		
		int[] arr = null;
		System.out.println(Param.min());
		System.out.println(Param.min(new int[] {3, 4, 5}));
		
		System.out.printf("%d", 123, 12, 1 , "가 나 다 라"); // 가변 인자
	}
}



class Param{
	int add(int a, int b) { // 아규먼츠 10, 20 들고왔어요~ 30 가지고가세요~
		return a+ b;
	}
	
	static int add2(int a, int b) {
		return a+ b;
	}
	static int max(int[] arr) {
		if(arr == null || arr.length == 0) {
			return  -1;
		} // 유효성 검증
		int ret = arr[0];
		for (int i : arr) {
			if(ret < i) {
				ret = i;
			}
		}
		// ret 변수에 최댓값 처리
		return ret;
	}
	static int min(int...num){ // ... 은 정말 뭐가 올지 모를때, 가변인자로 받을 때는 무조건 배열로 받음
		if(num == null || num.length == 0) {
			return -1;
		}
		int ret = num[0];
		for (int i : num) {
			if(ret < i) {
				ret = i;
			}
		return ret;
		}
	}
}}

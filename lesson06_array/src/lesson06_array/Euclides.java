package lesson06_array;

public class Euclides {
	public static void main(String[] args) {
//		int a = 12;
//		int b = 8;
//		boolean stopDiv = true;
//		while(stopDiv){
//			int tmp = a % b;
//			System.out.printf("%d %d %d\n", a, b,tmp);
//			a = b; b = tmp; 
//			if(tmp == 0) {
//				stopDiv = false;
//				System.out.println(a);
//			}
//		}
//		a = 12;
//		b = 18;
//		
//		point:for (int i = a; i <= a * b ; i +=a) {
//			System.out.println(i);
//			for (int j = b; j <= a * b ; j +=b) {
//				if(i == j) {
//				System.out.println(j);
//				break point;
//				}
//			}
//		}
//		System.out.println();
		int num = 11;
		boolean flag = true;
		for(int i = 1;i <= num; i++) {
			if(num % i == 0) {
				flag = false;
				break;
			}
		}
		System.out.println(num + "은" + (flag ? "소수" : "소수 아님"));
	}
	
}


// gcd = greater common div
// 12 * 18 / 6
// 

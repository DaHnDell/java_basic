package day2;

public class ArrEx12 {
	public static void main(String[] args) {
		String[][] addrs = {
				{
					"홍", "고", "이", "박", "최", "김" // 2길이
				},
				{
					"서울", "제주" // 2 길이
				},
				{
					"0001", "0002", "0003" // 3 길이
				}
		};
//		
//		int[][] arr = new int[3][]; // 앞에 있는 것부터(x) 바깥 쪽의 배열이 바깥 쪽의 길이 // 
//		{
//			//null 값에 접근하려고 하면 오류 발생
//		}
//		arr[0] = new int[] {1,2,3,4};
//		arr[1] = new int[2];
//		arr[2] = null;
//		
//		System.out.println(arr[0].length);
//		System.out.println(arr[1].length);
//		System.out.println(arr[2].length);
		/*
			0 1
			2 3
			4 5
		*/
		for(int i = 0; i < addrs.length; i++) {
			System.out.println(addrs[i].length);
			for(int j = 0; j < addrs[i].length; j++) {
				System.out.print(addrs[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
}

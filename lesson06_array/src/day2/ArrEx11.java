package day2;

public class ArrEx11 extends Info {
	public static void main(String[] args) {
	
		int[][][] arrInt = new int[3][3][3];
		
		int value = 0;
		
		for(int i = 0; i<=2; i++) {
			for(int j = 0; j <=2; j++) {
				for(int k = 0; k <=2; k++) {
					arrInt[i][j][k] = value ++;
					System.out.print(arrInt[i][j][k]);
				}
				System.out.println();
			}
		}
		for(int[][] arrK: arrInt) {
			for(int[] arrJ : arrK ) {
				for(int arrI : arrJ) {
					System.out.print(arrI + " ");
				}
				System.out.println();
			}
			
		}
		
		int[][][] arr = {
				{
					{1, 2},
					{3, 4}
				},
				{
					{1, 2},
					{3, 4}
				},
				{
					{1, 2},
					{3, 4}
				}
		
		
		};
		
	}
}

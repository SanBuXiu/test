// 杨辉三角

public class ArrayTest {

	public static void main(String[] args) {
		
		int[][] YH = new int[10][10];
		
		YH[1][1] = 1;
		for (int i = 0; i < YH.length; i++) {
			YH[i][0] = 1;
		}
		
		for (int i = 1; i < YH.length; i++) {
			for(int j = 1;j <= i;j++) {
				YH[i][j] = YH[i-1][j-1] + YH[i-1][j];
			}
		}
		
		for (int i = 0; i < YH.length; i++) {
			for(int j = 0;j <= i;j++) {
				System.out.print(YH[i][j] + " ");
			}
			System.out.println();
		}
	}
}

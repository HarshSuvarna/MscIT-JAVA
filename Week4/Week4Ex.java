import java.util.Random;
import java.util.Arrays;

public class Week4Ex {
	public static void main(String[] args) {
		Week4Ex1 ex = new Week4Ex1(100);
		double[] t = ex.createDoubleArr();
		
		int[] intArr = ex.createIntArr();
		
		Week4Ex2 ex2 = new Week4Ex2(6);
		
		int[][] b = ex2.createArray();
		for(int i = 0; i<6; i++) {
			System.out.println(Arrays.toString(b[i]));
		}	
	}
}

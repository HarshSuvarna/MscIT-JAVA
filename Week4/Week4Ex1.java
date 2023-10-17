import java.util.Random;

public class Week4Ex1 {
	private int arrLength;
	
	public Week4Ex1(int arrLength) {
		this.arrLength = arrLength;
	}
	
	public double[] createDoubleArr() {
		double[] myArr = new double[this.arrLength];
		Random r = new Random();
		double d = r.nextDouble();
		for(int i = 0; i<this.arrLength; i++) {
			myArr[i] = d;
		}
		return myArr;
	}
	
	public int[] createIntArr() {
		int[] myArr = new int[this.arrLength];
		Random r = new Random();
		int n = r.nextInt();
		for(int i = 0; i<this.arrLength; i++) {
			myArr[i] = n;
		}
		return myArr;
	}
	
	public double calcAvg(double[] arr) {
		double temp = 0;
		for(int i = 0; i<this.arrLength; i++) {
			temp += arr[i];
		}
		return temp;
	}
	
	public int findFirstOccurence(int[] arr, int num) {
		int position = -1;
		for(int i = 0; i<this.arrLength; i++) {
			if(arr[i]==num) {
				position = i;
				break;
			}
		}
		return position;
	}
	public int findLastOccurence(int[] arr, int num) {
		int position = -1;
		for(int i = 0; i<this.arrLength; i++) {
			if(arr[i]==num) {
				position = i;
			}
		}
		return position;
	}
	
}

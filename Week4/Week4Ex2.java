
public class Week4Ex2 {
	private int n;
	public Week4Ex2(int n) {
		this.n = n;
	}
	
	public int[][] createArray() {
		int[][] my2DArray = new int[this.n][this.n];
		for(int i=0; i<this.n; i++) {
			int[] myArray = new int[this.n];
			int c = 0;
			for(int j = i; j<this.n; j++) {
				myArray[j] = ++c;
			}
			my2DArray[i] = myArray;
		}
		return my2DArray;
	}
}

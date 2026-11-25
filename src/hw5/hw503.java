package hw5;

public class hw503 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intArray = {{1, 6, 3}, {9, 5, 2}};
		double[][] doubleArray = {{1.2, 3.5, 2.2},{7.4, 2.1, 8.2}};
		hw503 fn = new hw503();
		
		System.out.println(fn.maxElement(intArray));
		System.out.println(fn.maxElement(doubleArray));
	}
	
	public int maxElement(int[][] x){
		int max = 0;
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		
		return max;
	}
	
	public double maxElement(double[][] x){
		double max = 0;
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		
		return max;
	}

}

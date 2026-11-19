package hw4;

public class hw401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {20, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		
		hw401 fn = new hw401();
		int avg = fn.arrayAvg(arr);
		
		System.out.println("此陣列平均值為: " + avg);
		System.out.print("此陣列中大於平均值的有: ");
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > avg) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}
	
	public int arrayAvg(int arr[]) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum / arr.length;
	}
}

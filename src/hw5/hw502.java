package hw5;

import java.util.*;

public class hw502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hw502 fn = new hw502();
		fn.randAvg();		
	}
	
	public void randAvg() {
		Random rd = new Random();
		int[] arr = new int[10];
		int sum = 0;
		int avg = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 101);
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		avg = sum / arr.length;
		System.out.println(avg);
	}

}

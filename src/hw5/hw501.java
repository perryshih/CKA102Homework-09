package hw5;

import java.util.*;

public class hw501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hw501 fn = new hw501();
		Scanner s = new Scanner(System.in);
		int width = 0;
		int height = 0;
		
		System.out.println("請輸入寬與高: ");
		
		while(width < 1 ){
			if (s.hasNextInt()) {
				width = s.nextInt();
				if (width < 1) {
					System.out.println("請輸入大於0的整數");
				}
			}
		}
		
		while(height < 1 ){
			if (s.hasNextInt()) {
				height = s.nextInt();
				if (height < 1) {
					System.out.println("請輸入大於0的整數");
				}
			}
		}
		
		fn.printStar(width, height);
		
	}
	
	public void printStar(int width, int height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

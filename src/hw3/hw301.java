package hw3;
import java.util.*;

public class hw301 {

	public static void main(String[] args) {
		
		int[] tri = new int[3];
		boolean bn = true;
		//判斷正三角形
		boolean eq_tri = false;
		//判斷直角三角形
		boolean right_tri = false;
		Scanner s = new Scanner(System.in);
		hw301 hw3 = new hw301();
		
		System.out.println("請輸入三個整數");
		
		//triangle array內存入3個大於0的整數
		do {
			for(int i = 0; i <= 2; i++) {
				if(s.hasNextInt()){
					tri[i]= s.nextInt();
					while(tri[i] < 1){						
						System.out.println("請輸入大於0的整數");
						tri[i]= s.nextInt();
					}
				}
			}
			
			hw3.bubbleSort(tri);
			
		}while(tri[2] < 1);
		
		switch(hw3.distinguishTriangle(tri)) {
			//正三角形
			case 0 :
				System.out.println("正三角形");
				break;
			
			//等腰直角三角形 雖然整數無法形成等腰直角三角形
			case 1 :
				System.out.println("等腰直角三角形");
				break;
				
			//直角三角形
			case 2 :
				System.out.println("直角三角形");
				break;
				
			//等腰三角形
			case 3 :
				System.out.println("等腰三角形");
				break;
				
			//不是三角形
			case 4 :
				System.out.println("不是三角形");
				break;
			//其他三角形
			case 5 :
				System.out.println("其他三角形");
				break;
		}
		
//		if (tri[0] == tri[1] && tri[1] == tri[2]) {
//			System.out.println("正三角形");
//			eq_tri = true;
//		}
//		
//		else if (Math.powExact(tri[0], 2) == (Math.powExact(tri[1], 2) + Math.powExact(tri[2], 2))){
//			right_tri = true;
//			if(tri[0] == tri[1] || tri[0] == tri[2] || tri[1] == tri[2]) {
//				System.out.println("等腰直角三角形");
//			}
//			else {
//				System.out.println("直角三角形");
//			}
//		}
//		
//		else if((tri[0] == tri[1] || tri[0] == tri[2] || tri[1] == tri[2]) && eq_tri == false && right_tri == false) {
//			System.out.println("等腰三角形");
//		}
//		
//		else {
//			System.out.println("其它三角形");
//		}
		
		
		

	}
	// BubbleSort 把陣列中最大的放第一個
	public void bubbleSort(int arr[]) {
		int n = arr.length;
		int temp = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < (n-i); j++) {
				if(arr[j-1] < arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public int distinguishTriangle(int arr[]) {
		//判斷正三角形
		boolean eq_tri = false;
		//判斷直角三角形
		boolean right_tri = false;
		
		// 正三角形
		if (arr[0] == arr[1] && arr[1] == arr[2]) {
			eq_tri = true;
			return 0;
		}
		
		// 直角三角形
		else if (Math.powExact(arr[0], 2) == (Math.powExact(arr[1], 2) + Math.powExact(arr[2], 2))){
			right_tri = true;
			
			// 等腰直角三角形 雖然整數無法形成等腰直角三角形
			if(arr[0] == arr[1] || arr[0] == arr[2] || arr[1] == arr[2]) {
				return 1;
			}
			// 直角三角形
			else {
				return 2;
			}
		}
		
		// 等腰三角形
		else if((arr[0] == arr[1] || arr[0] == arr[2] || arr[1] == arr[2]) && eq_tri == false && right_tri == false) {
			return 3;
		}
		// 不是三角形
		else if((arr[1] + arr[2]) < arr[0]) {
			return 4;
		}
		// 其它三角形
		else {
			return 5;
		}
		
	}
	
	
}

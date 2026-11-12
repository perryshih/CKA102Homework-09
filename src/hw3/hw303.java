package hw3;

import java.util.*;

public class hw303 {
	
	public static void main(String[] args) {
//		int[] lotto = new int [1];
		ArrayList<Integer> lotto= new ArrayList<Integer>();
		int num = 0;
		boolean bn = true;
		
		Scanner s = new Scanner(System.in);
		hw303 hw3 = new hw303();
		
		
		System.out.println("阿文...請輸入你討厭哪個數字?");
		do {
			if(s.hasNextInt()) {
				num = s.nextInt();
				if(num < 1 || num > 9) {
					System.out.println("請輸入數字1~9");
				}
				else bn = false;
			}
		}while(bn);
		
		switch(num) {
			case 1:
				hw3.buildArray(lotto, num);
				hw3.printNum(lotto);
				break;
				
			case 2:
				hw3.buildArray(lotto, num);
				hw3.printNum(lotto);
				break;
				
			case 3:
				hw3.buildArray(lotto, num);
				hw3.printNum(lotto);
				break;
				
			case 4:
				hw3.buildArray(lotto, num);
				hw3.printNum(lotto);
				break;
				
			case 5:
				hw3.buildArray(lotto, num);
				hw3.printNum(lotto);
				break;
				
			case 6:
				hw3.buildArray(lotto, num);
				hw3.printNum(lotto);
				break;
				
			case 7:
				hw3.buildArray(lotto, num);
				hw3.printNum(lotto);
				break;
				
			case 8:
				hw3.buildArray(lotto, num);
				hw3.printNum(lotto);
				break;
				
			case 9:
				hw3.buildArray(lotto, num);
				hw3.printNum(lotto);
				break;	
		}
		
		System.out.println("");
		hw3.getRandomNum(lotto);
	}
	
	public void buildArray(ArrayList<Integer> list, int num) {
//		int index = 0;
		for(int i = 1; i < 49; i++) {
			if(i % 10 != num && i / 10 != num) {
				list.add(i);
//				arr= Arrays.copyOf(arr, arr.length + 1);
//				index++;			
			}
		}
	}
	
	public void printNum(ArrayList<Integer> list) {
		for(int i = 0; i < list.size(); i++) {			
			System.out.print(list.get(i)+"\t");
			if(i % 10 == 9 ) {
				System.out.println();
			}
		}
		System.out.println("總共有" + list.size() + "數字可選");
	}
	
	public void getRandomNum(ArrayList<Integer> list) {
		Random rd = new Random();
		ArrayList<Integer> r = new ArrayList<>();
		
		while (r.size() <= 6) {
			int num = rd.nextInt(list.size());
			if(r.contains(num)) {
				continue;
			}
			else {
				r.add(num);
			}
		}
		
		System.out.print("為您隨機挑選號碼:");
		
		for(int i = 0; i < r.size(); i++) {
			System.out.print("\t" + list.get(r.get(i)));
		}
		
	}
}

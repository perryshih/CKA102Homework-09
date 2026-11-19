package hw4;

import java.lang.*;

public class hw402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World";
		char[] sarr = new char[1];
		int sl = s.length();
		
		for(int i = 0; i < s.length(); i++) {
			char[] sarr2 = new char[sarr.length + 1];
			sarr[i] = s.charAt(sl-1);
			sl--;
			for(int j = 0; j < sarr.length; j++) {
				sarr2[j] = sarr[j];
			}
			sarr = sarr2;
		}
		System.out.print(sarr);
		
//		for(int i = 0; i < s.length(); i++) {
//			char[] sarr2 = new char[sarr.length + 1];
//			sarr2[i] = s.charAt(sl-1);
//			sarr = sarr2;
//			sl--;	
//			System.out.print(sarr);
//		}
		
//		String s2 = new StringBuilder(s).reverse().toString();
//		System.out.print(s2);
	}

}

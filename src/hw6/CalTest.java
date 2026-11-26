package hw6;

import java.util.*;

public class CalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			int a ;
			int b ;
			
			try {
				System.out.println("請輸入x的值:");
				a = s.nextInt();
				
				System.out.println("請輸入y的值:");
				b = s.nextInt();
				
				Calculator xy = new Calculator(a, b);
			}
			catch (InputMismatchException e ) {
				System.out.println("輸入格式不正確");
				s.nextLine();
			}
			catch (CalException e){
				
			}
			
	}

}

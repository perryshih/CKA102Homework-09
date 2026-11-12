package hw3;
import java.util.*;

public class hw302 {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 101);
		Scanner s = new Scanner(System.in);
		
		System.out.println("開始猜數字吧!");
		
		do {
			int guess;
			if(s.hasNextInt()) {
				guess = s.nextInt();
				if (guess == num) {
					System.out.printf("答對了，答案就是%d",num);
					break;
				}
				else if(guess < num) {
					System.out.println("再大一點");
				}
				else {
					System.out.println("再小一點");
				}
			}	
		}while(true);
		
	}

}

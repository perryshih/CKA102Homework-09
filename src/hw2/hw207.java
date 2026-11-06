package hw2;

public class hw207 {

	public static void main(String[] args) {
		char letter = 65;
		
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <=i; j++) {
				System.out.print(letter);
			}
			letter += 1;
			System.out.println();
		}

	}

}

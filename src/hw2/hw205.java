package hw2;

public class hw205 {

	public static void main(String[] args) {
		for(int i = 1; i <= 49; i++) {
			if(i % 10 != 4 && i / 10 != 4) {
				System.out.printf("%d ",i);
			}
			if(i % 10 ==0) {
				System.out.println();
			}
		}

	}

}

package hw2;

public class hw203 {

	public static void main(String[] args) {
		int sum = 1;
		int count = 1;
		while (count <= 10) {
			sum *= count;
			count++;
		}
		System.out.println(sum);
	}

}

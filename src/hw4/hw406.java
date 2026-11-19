package hw4;

public class hw406 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = {{10, 35, 40, 100, 90, 85, 75, 70},
						 {37, 75, 77, 89, 64, 75, 70, 95},
						 {100, 70, 79, 90, 75, 80, 79, 90},
						 {77, 95, 70, 89, 60, 75, 85, 89},
						 {98, 70, 89, 90, 75, 90, 89, 90},
						 {90, 80, 100, 75, 50, 20, 99, 75}};
		int[] students = new int[8];
		hw406 fn = new hw406();
		
		for(int i = 0; i < 6; i++) {
			students[fn.findTheHighest(score[i])] ++;
			System.out.printf("第%d次考試 %d號同學最高\n", i+1 , fn.findTheHighest(score[i])+1 );
		}
		
		for (int i = 0; i < students.length; i++) {
			System.out.printf("%d號同學 %d次\n", i+1, students[i]);
		}
		
		
	}
	public int findTheHighest(int arr[]) {
		int highest = 0;
		for(int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[highest]) {
				highest = i;
			}
		}
		return highest;
	}
}

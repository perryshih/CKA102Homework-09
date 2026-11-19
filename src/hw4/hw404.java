package hw4;
import java.util.*;

public class hw404 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		colleague[] colleague = {
				new colleague(25, 2500),
				new colleague(32, 800),
				new colleague(8, 500),
				new colleague(19, 1000),
				new colleague(27, 1200),
		};
		
		System.out.print("請輸入要借多少錢: ");
		if(s.hasNextInt()) {
			int borrow = s.nextInt();
			int idcount = 0;
//			ArrayList<Integer> idlist = new ArrayList<>();
			String idnum = "";
			
			for(int i = 0; i < colleague.length; i++) {
				if (colleague[i].getMoney() >= borrow) {
//					idlist.add(colleague[i].getId());
					idnum = idnum + Integer.toString(colleague[i].getId())+ " ";
					idcount++;
				}
			}
			if (idcount != 0) {
				System.out.printf("員工編號: %s 共%d人",idnum, idcount);
			}
			else {
				System.out.println("沒有同事有那麼多錢");
			}
		}
		
		
	}

}

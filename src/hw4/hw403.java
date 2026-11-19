package hw4;
import java.util.*;

public class hw403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] planet = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int s = planet[0].length();
		int count = 0;
		hw403 fn = new hw403();
		
		for (int i = 0; i < planet.length; i++) {
			for (int j = 0; j < planet[i].length(); j++) {
				Character c = planet[i].charAt(j);
				if(c.equals('a') || c.equals('e') || c.equals('i') || c.equals('o') || c.equals('u')) {
					count++;
				}
//				switch(c) {
//					case 'a':
//						count++;
//						break;
//					case 'e':
//						count++;
//						break;
//					case 'i':
//						count++;
//						break;
//					case 'o':
//						count++;
//						break;
//					case 'u':
//						count++;
//						break;
//				}
			}
		}
		System.out.println(count);
	}
	

}

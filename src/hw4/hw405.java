package hw4;
import java.util.*;
import java.time.*;

public class hw405 {

	public static void main(String[] args) {
		// 閏年規則 : 四年一閏，百年不閏，四百再閏
		Scanner s = new Scanner(System.in);
		int[] date = new int[3];
		hw405 fn = new hw405();
		
		System.out.print("請輸入年月日: ");
		//日期輸入判定
		for(int i = 0; i < date.length; i++) {
			if (s.hasNextInt()) {
				//年
				if(i == 0) {
					date[i] = s.nextInt();
					while(date[i] < 0) {
						System.out.println("請輸入大於0的年份");
						date[i] = s.nextInt();
					}
				}
				//月
				if(i == 1) {
					date[i] = s.nextInt();
					while(date[i] < 0 || date[i] > 12) {
						System.out.println("請輸入介於1~12的月份");
						date[i] = s.nextInt();
					}
				}
				//日
				if(i == 2) {
					Set<Integer> day31 = Set.of(1,3,5,7,8,10,12);
					Set<Integer> day30 = Set.of(4,6,9,11);
					date[i] = s.nextInt();
					
					//如果是1,3,5,7,8,10,12月
					if(day31.contains(date[1])) {
						while(date[i] < 0 || date[i] > 31) {
							System.out.println("請輸入介於1~31的日期");
							date[i] = s.nextInt();
						}
					}
					//如果有4,6,9,11月
					if(day30.contains(date[1])) {
						while(date[i] < 0 || date[i] > 30) {
							System.out.println("請輸入介於1~30的日期");
							date[i] = s.nextInt();
						}
					}
					//如果是閏年2月
					if(Year.isLeap(date[0]) && date[1] == 2) {
						while(date[i] < 0 || date[i] > 29) {
							System.out.println("請輸入介於1~29的日期");
							date[i] = s.nextInt();
						}
					}
					//如果是非閏年2月
					else if(date[1] == 2) {
						while(date[i] < 0 || date[i] > 28) {
							System.out.println("請輸入介於1~28的日期");
							date[i] = s.nextInt();
						}
					}	
				}
			}
		}
//		for(int i = 0; i < date.length; i++) {
//			System.out.print(date[i] + " ");
//		}
		
//		LocalDate inputYear = LocalDate.of(date[0], date[1], date[2]);
//		System.out.printf("第%d天",inputYear.getDayOfYear());
		
		System.out.printf("第%d天",fn.countDay(date[0], date[1], date[2]));
	}
	
	public int countDay(int year, int month, int day) {
		int day_of_year = 0;
		int[] notLeap = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] isLeap = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (Year.isLeap(year)) {
			for (int i = 0; i < month - 1; i++) {
				day_of_year += isLeap[i];
			}
			day_of_year += day;
		}
		else {
			for (int i = 0; i < month - 1; i++) {
				day_of_year += notLeap[i];
			}
			day_of_year += day;
		}
		return day_of_year;
	}
}

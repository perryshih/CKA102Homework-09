package hw1;

public class hw103 {

	public static void main(String[] args) {
		int total_second = 256559;
		int day = 86400; 	//一天有86400秒
		int hour = 3600;	//一小時有3600秒
		int minute = 60;	//一分鐘有60秒
		
		System.out.print("256559秒有:"+(total_second / day)+"天 ");
		System.out.print((total_second % day / hour)+"小時 ");
		System.out.print((total_second % day % hour / minute)+"分 ");
		System.out.print((total_second % day % hour % minute)+"秒 ");

	}

}

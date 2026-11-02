package hw1;

public class hw106 {

	public static void main(String[] args) {
		System.out.println(5+5);	//這邊的5+5為數字的運算所以=10。
		System.out.println(5+'5');	//這邊的5+'5'為數字5加上字元5的運算，且字元五在編碼上為53，因此結果是58。
		System.out.println(5+"5");	//這邊的5+"5"為數字5加上字串5，因此無法計算，顯示的結果單純為一個數字5與一個字串5所以是55。
	}

}

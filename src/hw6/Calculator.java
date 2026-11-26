package hw6;

public class Calculator {
	private int x;
	private int y;
	
	Calculator(){
		
	}
	Calculator(int x, int y) throws CalException{
		if(x == 0 && y == 0) {
			System.out.println("0的0次方沒有意義!");
			throw new CalException();
		}
		else if (y >= 0) {
			setIntx(x);
			setInty(y);
			System.out.printf("%d的%d次方等於%d", x, y, powerXY(x, y));
		}
		else {
			System.out.println("次方為負值，結果回傳不為整數!");
			throw new CalException();
		}
	}
	
	public void setIntx(int x) {
			this.x = x;
	}
	public void setInty(int y) {
			this.y = y;
	}
	
	public int getIntx() {
		return x;
	}
	public int getInty() {
		return y;
	}
	
	public int powerXY(int x, int y) {
		int pow = 1;
		for(int i = 0; i < y; i++) {
			pow *= x;
		}
		return pow;
	}
}

package hwext;

public class InkBrush extends Pen{
	public InkBrush(String brand, int price) {
//		setBrand(brand);
		super(brand, (int)(price * 0.9));
	}
	
//	public int setPrice(int price) {
//		this.price = price *0.8
//	}
	
	public void write() {
		System.out.println("沾墨汁再寫");
	}
}

package hw5;

public class MyRectangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRectangle r1 = new MyRectangle();
		MyRectangle r2 = new MyRectangle(10, 20);
		
		r1.setWidth(10);
		r1.setHeight(20);
		
		System.out.println("r1的面積: " + r1.getArea());
		System.out.println("r2的面積: " + r2.getArea());
	}

}

package hw5;

public class MyRectangle {
	private double width;
	private double height;
	
	public MyRectangle(double width, double height) {
		setWidth(width);
		setHeight(height);
	}
	
	public MyRectangle() {
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getArea() {
		return width * height;
	}
}

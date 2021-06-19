package abstact;

public class Rectangle extends Shape{
	private int length;
	private int width;

	
	@Override
	public double getArea() {
		
		return length*width;
		
	}

	public Rectangle(int length, int width,String color) {
		super.setColor(color);
		this.length = length;
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", getArea()=" + getArea() + "]";
	}
	

}

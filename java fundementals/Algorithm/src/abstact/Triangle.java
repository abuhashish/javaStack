package abstact;

public class Triangle extends Shape{
	private int base;
	private int height;
	
	public Triangle(int base, int height,String color) {
		super.setColor(color);
		this.base = base;
		this.height = height;
	}
	@Override
	public double getArea() {
		return 0.5*base*height;
		
	}
	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + ", getArea()=" + getArea() + "]";
	}

	
	

}

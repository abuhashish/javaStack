package GeomatricObject;

public class Rectangle extends GeomatricObject{
private double width;
private double height;
public Rectangle() {
}
public Rectangle(double width, double height) {
	this.width = width;
	this.height = height;
}
public Rectangle(double width, double height,String color,boolean filled) {
	this.width = width;
	this.height = height;
	super.setColor(color);
	super.setFilled(filled);
}
public double getWidth() {
	return width;
}
public void setWidth(double width) {
	this.width = width;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
public double getArea() {
	return (width*height);
}
public double getPerimter() {
	return 2*(width+height);
}

}

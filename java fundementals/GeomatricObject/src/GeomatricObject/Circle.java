package GeomatricObject;

public class Circle extends GeomatricObject {
private double radius;


public Circle() {
}


public Circle(double radius) {
	this.radius = radius;
	setColor("Red");
}
public Circle(double radius,String color,boolean filled) {
	this.radius=radius;
	super.setColor(color);
	super.setFilled(filled);

}


public double getRadius() {
	return radius;
}


public void setRadius(double radius) {
	this.radius = radius;
}
public double getArea() {
	return (radius*radius*3.14);
}
public double getPerimeter() {
	return (2*3.14*radius);
}
public double getDiameter() {
	return (2*radius);
}



public void printCircle() {
System.out.println("Circle [radius=" + radius + ", getRadius()=" + getRadius() + ", getArea()=" + getArea()
+ ", getPerimeter()=" + getPerimeter() + ", getDiameter()=" + getDiameter() + ", getColor()=" + getColor()
+ ", isFilled()=" + isFilled() + ", getDateCreated()=" + getDateCreated() + "]"); 
}




}

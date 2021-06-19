package GeomatricObject;

import java.sql.Date;

public class GeomatricObject {
private String color;
private boolean filled;
private Date dateCreated;
public GeomatricObject() {
	color="white";
	filled=false;
	dateCreated=new Date(System.currentTimeMillis());
}
public GeomatricObject(String color, boolean filled) {
	this.color = color;
	this.filled = filled;
	dateCreated=new Date(System.currentTimeMillis());
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public boolean isFilled() {
	return filled;
}
public void setFilled(boolean filled) {
	this.filled = filled;
}
public java.util.Date getDateCreated() {
	return dateCreated;
}
@Override
public String toString() {
	return "GeomatricObject [color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated + "]";
}




}

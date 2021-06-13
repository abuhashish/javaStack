package algo;

public class Animal {
protected String type;

public Animal() {
	type="animal";
	System.out.println("i am an animal");
}


public Animal(String type) {
	this.type = type;
	System.out.println("i am an"+type);
}


public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}
public void display() {
	System.out.println("here is animal class");
}
}

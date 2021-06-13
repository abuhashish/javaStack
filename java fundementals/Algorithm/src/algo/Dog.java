package algo;

public class Dog extends Animal {
public Dog() {
	type="mammal";
	System.out.println("i am a dog");
}
public Dog(String type) {
	this.type=type;
}
//@Override
//public void display() {
//
//	System.out.println("here is dog class");
//}
//public void printMessage() {
//	display();
//	super.display();
//}
}

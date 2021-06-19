package abstact;

public class ShapeTester {

	public static void main(String[] args) {
		Triangle amro = new Triangle(10, 15, "red");
		System.out.println(amro.getArea());
		Rectangle lana = new Rectangle(15, 7, "blue");
		System.out.println(lana.getArea());

	}

}

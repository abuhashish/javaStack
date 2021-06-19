package GeomatricObject;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		ArrayList<GeomatricObject> x=new ArrayList<GeomatricObject>();
		Circle one=new Circle(10.0,"red",true);
		Circle two=new Circle(15.0,"green",true);
		Rectangle three=new Rectangle(5.0,5.0,"yellow",true);
		Rectangle four=new Rectangle(6.0,6.0,"black",true);
		x.add(one);
		x.add(two);
		x.add(three);
		x.add(four);
		Rectangle recPoly=new Rectangle(5.0,5.0,"yellow",true);
		System.out.println(recPoly.getArea());
		System.out.println(recPoly.isFilled());
	}

}

import java.util.ArrayList;

public class ProjectTest {

	private static ArrayList<Project> s;

	public static void main(String[] args) {
		
		Portfolio gg=new Portfolio();
		gg.add("lana", "donkey");
		gg.add("amro", "desc");
		gg.add();
		s = gg.hehe();
		for (Project x : s) {
			System.out.println(x.elevatorPitch());
		}
	}

}
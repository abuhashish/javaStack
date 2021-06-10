import java.util.ArrayList;

public class Portfolio extends Project {
public  ArrayList<Project> x;

public Portfolio() {
	
	x=new ArrayList<Project>();
}

public ArrayList<Project> getX() {
	return x;
}

public void setX(ArrayList<Project> x) {
	this.x = x;
}
public void add() {
	Project g=new Project();
	x.add(g);
}

public void add(String name,String desc) {
	Project g=new Project(name,desc);
	x.add(g);
}

public ArrayList<Project> hehe() {
	return x;
}

}


public class Project {

	private String name;
	private String Description;
	private double initialCost;
	public Project() {
		name="amro";
		Description="amro is the boss";
	}
	public Project(String name) {
		this.name = name;
	}
	public Project(String name, String description) {
		super();
		this.name = name;
		Description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	public double getInitialCost() {
		return initialCost;
	}
	public void setInitialCost(double initialCost) {
		this.initialCost = initialCost;
	}
	public String elevatorPitch() {
		return  name+","+Description+","+initialCost;
	}


	

}

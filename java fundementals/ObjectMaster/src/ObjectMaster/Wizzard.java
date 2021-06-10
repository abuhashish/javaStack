package ObjectMaster;

public class Wizzard extends Human{

	public Wizzard() {
		health=50;
		intelligence = 8;
	}
	public void heal(Human x) {
		x.health+=intelligence;
	}
	public void fireball(Human x) {
		x.health-=intelligence * 3;
	}
}

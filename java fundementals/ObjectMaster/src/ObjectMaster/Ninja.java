package ObjectMaster;

public class Ninja extends Human{

	public Ninja() {
		stealth=10;
	}
	public void steal(Human x) {
		x.health-=stealth;
		health+=stealth;
	}
	public void fireball(Human x) {
		x.health-=intelligence * 3;
	}
	public void runAway() {
		health-=10;
	}
}

package ObjectMaster;

public class Samurai extends Human{
	static int num=0;
	public Samurai() {
		health=200;
		num++;
	}
	public void deathBlow(Human x) {
		x.health=0;
		health-=(health*0.5);
	}
	public void meditate() {
		health+=(health*0.5);
	}
	public int howMany() {
		return num;
	}
	
}

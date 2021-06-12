package ZooKeeper;

public class Bat extends Mammal{

	public Bat() {
		super(300);
	}
	public void Fly() {
		System.out.println("the sound a bat taking off");
		energyLevel-=50;
	}
	public void eatHumans() {
		System.out.println("the so-well,nevermind");
		energyLevel+=25;
	}
	public void attackTown() {
		System.out.println("the sound of a town on fire");
		energyLevel-=100;
	}
}

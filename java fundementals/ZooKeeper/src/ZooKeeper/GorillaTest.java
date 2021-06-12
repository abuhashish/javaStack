package ZooKeeper;

public class GorillaTest {

	public static void main(String[] args) {
		Gorilla x=new Gorilla(50);
		x.displayEnergy();
		x.climb();
		x.displayEnergy();
		x.eatBananas();
		x.displayEnergy();
		x.throwSomthing();
		x.displayEnergy();
		System.out.println("______________________________________");
		Bat y=new Bat();
		y.displayEnergy();
		y.attackTown();
		y.displayEnergy();
		y.eatHumans();
		y.displayEnergy();
		y.Fly();
		y.displayEnergy();
		
	}

}

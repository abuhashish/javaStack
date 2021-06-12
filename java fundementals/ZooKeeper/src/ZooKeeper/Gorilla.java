package ZooKeeper;

public class Gorilla extends Mammal {

	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	public void throwSomthing() {
		System.out.println("the gorilla has thrown a stone");
		energyLevel-=5;
	}
	public void eatBananas() {
		System.out.println("increasing energy by eating banana");
		energyLevel+=10;
	}
	public void climb() {
		System.out.println("the gorilla has climbed the tree");
		energyLevel-=10;
	}
}

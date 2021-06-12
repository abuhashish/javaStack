package ZooKeeper;

public class Mammal {
protected int energyLevel;
public int displayEnergy() {
	System.out.println(energyLevel);
	return energyLevel;
}
public Mammal(int energyLevel) {
	this.energyLevel = energyLevel;
}
public int getEnergyLevel() {
	return energyLevel;
}
public void setEnergyLevel(int energyLevel) {
	this.energyLevel = energyLevel;
}
}

package ObjectMaster;

public class Human {
private int str;
private int stealth;
private int intelligence;
private int health;
public Human() {
	str = 3;
	stealth = 3;
	intelligence = 3;
	setHealth(100);
}
public int getStr() {
	return str;
}
public void setStr(int str) {
	this.str = str;
}
public int getStealth() {
	return stealth;
}
public void setStealth(int stealth) {
	this.stealth = stealth;
}
public int getIntelligence() {
	return intelligence;
}
public void setIntelligence(int intelligence) {
	this.intelligence = intelligence;
}
public int getHealth() {
	return health;
}
public void setHealth(int health) {
	this.health = health;
}
public void attack(Human x) {
	health-=x.str;
}
@Override
public String toString() {
	return "Human [str=" + str + ", stealth=" + stealth + ", intelligence=" + intelligence + ", health=" + health + "]";
}

}

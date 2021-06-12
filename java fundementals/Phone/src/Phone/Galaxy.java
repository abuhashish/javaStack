package Phone;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String Ring() {
    	return getRingTone();
    }
    @Override
    public String unlock() {
    	return "unlocking via facial";
    }
    @Override
    public void displayInfo() {
    	System.out.println(getCarrier());                   
    }
}
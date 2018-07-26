package phone;

public class Galaxy extends Phone implements Ringable {

	

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		
	}

	public void displayInfo() {
		System.out.println("Galaxy "+getVersionNumber()+" from "+ getCarrier());
		
	}
	
	public String ring() {
		
		return ("iphone "+getVersionNumber()+" says "+getRingTone());
	}

	public String unlock() {

		return ("Unlocking via finger print");
}


}

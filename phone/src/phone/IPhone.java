package phone;

public class IPhone extends Phone implements Ringable {

	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		
	}


	public void displayInfo() {
		
		System.out.println("iPhone "+getVersionNumber()+" from "+ getCarrier());
	
	}

	public String ring() {
		
		return ("iphone "+getVersionNumber()+" says "+getRingTone());
	}
	
	public String unlock() {
		
		return ("Unlocking via facial identification");
	}


	

}

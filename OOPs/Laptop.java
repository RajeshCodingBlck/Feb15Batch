package OOPs;

public class Laptop {
    
	// State
	boolean isON;
	int ram;
	int ssd;
	
	
	// Behaviour
	public void switchButton() {

		if (isON == true) {
			isON = false;
		} else {
			isON = true;
		}
	}
	
	public void upgradeRam(int data) {
		ram+=data;
	}
	
}

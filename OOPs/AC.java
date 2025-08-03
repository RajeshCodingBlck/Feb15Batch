package OOPs;

public class AC {

	// State
	public boolean isON;
	int temp;
	String mode;
	
	
	public AC(boolean isON, int temp, String mode){
		System.out.println(this);
		this.isON=isON;
		this.temp=temp;
		this.mode=mode;
	}
	
	public AC(){
		
	}
	

	// Behaviour

	public void switchButton() {

//		System.out.println(this);
		if (this.isON == true) {
			this.isON = false;
		} else {
			this.isON = true;
		}
		
	}

	public void incrTemp() {

		 if(isON==false) {
			 return;
		 }
		if (temp < 30) {
			temp++;
		}

	}

	public void decrTemp() {

		 if(isON==false) {
			 return;
		 }
		if (temp >16) {
			temp--;
		}

	}

}

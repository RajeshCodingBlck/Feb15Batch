package OOPs;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
//		AC Haier= new AC();  // it is way to create an object.
//		
//		
//		// Access any state of Object
//		System.out.println(Haier.isON);
//		System.out.println(Haier.temp);
//		System.out.println(Haier.mode);
//		
//		Haier.switchButton();
//		System.out.println(Haier.isON);
//		
//		Haier.mode= "Cooling Mode";
//		System.out.println(Haier.mode);
		
		
//		System.out.println(this);
		
		AC Haier = new AC(true, 24, "cooling Mode");
		AC voltas= new AC(false, 0, "Off Mode");
		
		System.out.println(Haier.isON);
		System.out.println(Haier.mode);
		System.out.println(Haier.temp);
		
		System.out.println(Haier);
		System.out.println(voltas);
		
		voltas.switchButton();
//		System.out.println(Haier.isON);
//		System.out.println(voltas.isON);
		
		
		
		
		
		
	}

}

package RecursionPart2;

public class PowerFunction {

	
//	Take (a,b)-> a^b
	public static int pow(int a, int b) {
	
		if(b==0) {
			return 1;
		}
		
		int chhotaAns= pow(a, b-1);
		int meraAns= chhotaAns*a;
		return meraAns;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.out.println(pow(2,5));
	}

}

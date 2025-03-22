package MathProblems;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int n=9;	
        int count=0;
		for(int i=1;i<=n;i++) {	
			if(n%i==0) {
//				System.out.println(i);
				count++;
			}
			
			if(count>2) {
				break;
			}
		}
		
		if(count==2) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
		
		
	}

}

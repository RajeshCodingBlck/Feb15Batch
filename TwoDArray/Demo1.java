package TwoDArray;

public class Demo1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       int [] arr = new int [5];
       
       int [][] arr= new int [3][4];
       
       System.out.println(arr[1][2]);
       
       arr[1][2]=13;
       System.out.println(arr[1][2]);
       
       // Case Study
       
      // 1) How many 2D array will create?
//    		   int [] [] arr= new int[3][4];
//       int [][] brr=arr;
//       
//       System.out.println(arr+ " "+ brr);
       
//         Answer is 1 there is 2 reference varible.
       
       
//       2) How many 1D array of any type will create.
         
//           int [][] arr= new int[n][m];
//           Answer is n+1
    
       
       //3) int [] [] arr= new int[3][]; // work totally fine
       
       
//       4)   int [] [] arr= new int[][3]; // not work.
       
       
       
     
	}

}

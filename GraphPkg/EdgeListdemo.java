package GraphPkg;

import java.util.*;
public class EdgeListdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt(); // No of Vertex
		int e= s.nextInt(); // No of Edges
		
		int [][] arr= new int[e][2];
		
		for(int i=0;i<e;i++) {
			
			int u= s.nextInt();
			int v= s.nextInt();
			arr[i][0]=u;
			arr[i][1]=v;
		}
		
		for(int [] edge: arr) {
			System.out.println(edge[0]+" "+edge[1]);
		}
		
		
		
		
	}

}

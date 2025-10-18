package GraphPkg;

import java.util.*;

public class AdjacentListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int n = s.nextInt(); // No of Vertex
		int e = s.nextInt(); // No of Edges

		ArrayList<Integer> [] arr= new ArrayList[n];
		
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=new ArrayList();
//			System.out.println(arr[i]);
		}
		

		for (int i = 0; i < e; i++) {

			int u = s.nextInt();
			int v = s.nextInt();
			arr[u].add(v);
			arr[v].add(u);
		}
		
		for(int i=0; i<arr.length;i++) {
			
			System.out.print(i + " ke Neighbour he ");
			for(int node : arr[i]) {
				
				System.out.print(node +" ");
			}
			
			System.out.println();
		}
	}

}

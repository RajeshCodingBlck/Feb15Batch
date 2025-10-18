package GraphPkg;

import java.util.Scanner;

public class AdjacentMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int n = s.nextInt(); // No of Vertex
		int e = s.nextInt(); // No of Edges

		int[][] arr = new int[n][n];

		for (int i = 0; i < e; i++) {

			int u = s.nextInt();
			int v = s.nextInt();
			arr[u][v]=1;
			arr[v][u]=1;
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}

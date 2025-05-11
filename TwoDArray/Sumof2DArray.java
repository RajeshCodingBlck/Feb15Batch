package TwoDArray;

public class Sumof2DArray {

	public static int getSum(int[][] arr) {

		int sum = 0;

		// rows
		for (int i = 0; i < arr.length; i++) {
			// cols
			for (int j = 0; j < arr[0].length; j++) {
				sum += arr[i][j];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3 },
				        { 4, 5, 6 }, 
				        { 7, 8, 9 },

		};
		
		System.out.println(getSum(arr));
		
	}

}

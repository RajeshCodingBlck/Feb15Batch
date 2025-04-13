package ArrayQuestions;

import java.util.Scanner;

public class TakeInputAndOutput {

	public static void takeInput(int[] arr) {

		Scanner s= new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
	}

	public static void display(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int n = s.nextInt(); // Size of the Array
		int[] arr = new int[n];

//		System.out.println(arr.length); // Size of Array 
		takeInput(arr);
		display(arr);
		

	}

}

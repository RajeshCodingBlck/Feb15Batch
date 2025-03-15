package Lec4;

public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int row=1;
		int leftStar=3;
		int nsp=1;
		int rightStar=3;
		
		while(row<=7) {
			// work
			// Work for LeftStar
			int i=1;
			while(i<=leftStar) {
				System.out.print("*"+" ");
				i=i+1;
			}
			
			// work for Space
			int j=1;
			while(j<=nsp) {
				System.out.print(" "+" ");
				j=j+1;
			}
			// work for Right Star
			int k=1;
			while(k<=rightStar) {
				System.out.print("*"+" ");
				k=k+1;
			}
			
			// Prepartion for Next Row
			if(row<4) {
				leftStar= leftStar-1;
				rightStar=rightStar-1;
				nsp=nsp+2;
			}else {
				leftStar= leftStar+1;
				rightStar=rightStar+1;
				nsp=nsp-2;
			}
			row=row+1;
			System.out.println();
		}
	}

}

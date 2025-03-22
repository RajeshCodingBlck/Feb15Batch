//package MathProblems;
//
//
//
//import java.util.*;
//public class Main {
//    public static void main(String args[]) {
//        // Your Code Here
//        Scanner s= new Scanner(System.in);
//        int n= s.nextInt();
//
//        int row=1;
//        int leftStar=n/2;
//        int rightStar=n/2;
//        int nsp=1;
//        while(row<=n){
//
//            // work
//            if(row==1 || row==n){
//
//               int i=1;
//               while(i<=n){
//                   System.out.print("*"+"\t");
//                   i=i+1;
//               }
//
//            }else{
//
//               int i=1;
//               while(i<=leftStar){
//                   System.out.print("*"+"\t");
//                   i=i+1;
//               }
//               // Space
//               int j=1;
//               while(j<=nsp){
//                   System.out.print(" "+"\t");
//                   j=j+1;
//               }
//
//               // rightStar
//               int k=1;
//               while(k<=rightStar){
//                   System.out.print("*"+"\t");
//                   k=k+1;
//               }
//
//               // preparation for Next row
//               if(row<(n/2)+1){
//                   leftStar--;
//                   rightStar--;
//                   nsp+=2;
//               }else{
//                  leftStar++;
//                   rightStar++;
//                   nsp-=2; 
//               }
//            }
//
//            row=row+1;
//            System.out.println();
//        }
//
//
//    }
//}
//
//public class Assignment1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

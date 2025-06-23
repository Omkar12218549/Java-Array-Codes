package Array;
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

//public class TwoDArray {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the element in the array: ");
//        int n= sc.nextInt();
//        int[][] arr = new int[3][3];
//
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                arr[row][col] = sc.nextInt();
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col]);
//            }
//            System.out.println();
//        }
        //  OR
//        for(int row=0;row< arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }
//    }
//}
class TwoDArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
        int[][] arr=new int[3][];
        for(int row=0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=sc.nextInt();

            }

        }
        for(int row=0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
        sc.close();

    }
}
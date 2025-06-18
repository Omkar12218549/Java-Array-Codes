package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Num of eelmt: ");
        int n= sc.nextInt();

        int[] arr=new int[n];
        //reading the element of array
        System.out.println("Enter the lelemnt of array");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();

        }
//        int size=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[n-1-i]+" ");


        }

    }

}

package Array;

import java.util.Arrays;
import java.util.Scanner;

public class maxInrange {
    static int max(int[] arr,int start,int end){
        int maxval=arr[start];
        for (int i=start;i<=end;i++){
            if(arr[i]>maxval){
                maxval=arr[i];
            }
        }
        return maxval;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elemnt in the array ");
        int n= sc.nextInt();

        //Initialize the array
        int[] arr=new int[n];

        // Reading the elemnt of array
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println(max(arr,1,5));
    }
}

package Array;

import PRACTICEE.Arra;

import java.util.Arrays;
import java.util.Scanner;

public class leftRotateByOne {
    public static int[] rotate(int arr[],int n){
        int first=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=first;
        return  arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        rotate(arr,n);
//        for(int num:arr){
//            System.out.print(num+" ");
//        }
        System.out.println(Arrays.toString(arr));
    }
}

package PRACTICEE;

import java.util.Scanner;

public class SoortChekking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element in the array");
        int n=sc.nextInt();

        //initializing the array
        int[] arr=new int[n];

        //reading the element of the array

        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        boolean isSorted=true;
        for(int i=0;i< n;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The given number is sorted in ascending order");
        }else {
            System.out.println("The given number is not sorted");
        }
    }
}

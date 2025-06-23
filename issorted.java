package Array;

import java.util.Scanner;

public class issorted {
    public static boolean isorted(int arr[]){
        for (int i=0;i< arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the number of elemnt in array: ");
        int n= sc.nextInt();
        // initialize the array
        int[] arr=new int[n];
        //reading the element of the array
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(isorted(arr)){
            System.out.println("The given arr is sorted");
        }else{
            System.out.println("NOT SORTED");
        }


    }

}

package Practice;

import java.util.Scanner;

public class SortCheking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the number of element is an array: ");
        int n= sc.nextInt();
         // initializing an array
        int[] arr=new int[n];
        // raedin the elemnt of array
        System.out.println("Enter the element of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean isSorted=true;
        for(int i=1;i< arr.length;i++){
            if(arr[i]<arr[i-1]){
                isSorted=false;
                break;

            }

        }
        if(isSorted){
            System.out.println("The given array is sorted");
        }else{
            System.out.println("The given array is not sorted");
        }
    }
}

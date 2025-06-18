package Practice;

import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element in the array");
        int n= sc.nextInt();

        if(n<2){
            System.out.println("Array must be atlest of the length two");
            return;
        }
        // initialization of array
        int[] arr=new int[n];

        // read the element of the array
        System.out.println("Enter the element of the array: ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;

        for(int i=0;i< arr.length;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            } else if (arr[i]>secondlargest && arr[i]!=largest) {
                secondlargest=arr[i];

            }
        }
        if(secondlargest==Integer.MIN_VALUE){
            System.out.println("there is no second largest element");
        }else{
            System.out.println("The Largest NUmber is "+largest);
            System.out.println("The second Largest NUmber is "+secondlargest);
        }

    }
}

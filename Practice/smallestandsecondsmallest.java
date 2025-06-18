package Practice;

import java.util.Scanner;

public class smallestandsecondsmallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element in an array");
        int n= sc.nextInt();

        if(n<2){
            System.out.println("There should be atleast two element in an array: ");
            return;
        }

        // Initialize the array
        System.out.println("Enter the element of the array: ");
        int[] arr=new int[n];

        // read the element of an array
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int smallest=Integer.MAX_VALUE;
        int secondsmallest=Integer.MAX_VALUE;
        for (int i=0;i< arr.length;i++){
            if (arr[i]<smallest){
                secondsmallest=smallest;
                smallest=arr[i];
            }else if(arr[i]<secondsmallest && arr[i]!=smallest){
                secondsmallest=arr[i];
            }
        }
        if(secondsmallest==Integer.MAX_VALUE){
            System.out.println("There is no secondsmallest element on an array");

        }else {
            System.out.println("The smallest element in an array is: "+smallest);
            System.out.println("The secondSmallest element in an array is: "+secondsmallest);
        }
        sc.close();
    }
}

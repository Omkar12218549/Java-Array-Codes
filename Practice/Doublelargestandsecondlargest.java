package Practice;

import java.util.Scanner;

public class Doublelargestandsecondlargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element in an array: ");
        int n= sc.nextInt();

        if(n<2){
            System.out.println("no second largest elemnt");
            return;
        }
        //initialize the array
        double[] arr=new double[n];

        // Reading the elemnt of array
        System.out.println("Enter the element of array: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextDouble();

        }
        double largest=Double.NEGATIVE_INFINITY;
        double secondlargest=Double.NEGATIVE_INFINITY;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            } else if (arr[i]>secondlargest && arr[i]!=largest) {
                secondlargest=arr[i];

            }
        }
        if(secondlargest==Double.NEGATIVE_INFINITY){
            System.out.println("there is no second largest element");
        }else{
            System.out.println("The Largest NUmber is "+largest);
            System.out.println("The second Largest NUmber is "+secondlargest);
        }
        sc.close();


    }
}

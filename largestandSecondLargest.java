package Array;

import java.util.Arrays;

public class largestandSecondLargest {
    public static void largandSecondLarge(int arr[]){
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for (int i=0;i< arr.length;i++){
            if (arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=largest){
                largest=arr[i];
            }
        }
        if(secondLargest==Integer.MIN_VALUE){
            System.out.println("There is no second elelmtn");
        }else{
            System.out.println("Second largest"+secondLargest);
//            System.out.println("Largest is"+largest);
        }

    }

    public static void main(String[] args) {
        int[] arr={10,5,8,20,15};
        Arrays.sort(arr);
       largandSecondLarge(arr);

}
}

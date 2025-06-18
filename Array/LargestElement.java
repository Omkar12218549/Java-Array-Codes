package Array;

import java.util.Arrays;

public class LargestElement {
    public static int fundLargest(int[] arr){
        int largest=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={12,3,22,1,22,2222};
        int result=fundLargest(arr);
        System.out.println(result);

    }
}
//Arrays.sort(arr);
//sout(arr[n-1]);

package PRACTICEE;

import java.util.Arrays;

public class BinarySearch {
    public static int Searching(int[] arr,int start,int end,int target){
        if(start>end){
            return -1;
        }
        int mid=(start+end)/2;
        if(arr[mid]==target){
            return target;
        }
        if(arr[mid]>target){
            return Searching(arr,start,mid-1,target);
        }else {
            return Searching(arr,mid+1,end,target);
        }
    }

    public static void main(String[] args) {
        int array[]={1,222,33,222,2,2,22};
        int target=22;
        Arrays.sort(array);
        int result= Searching(array,0,array.length,target);

//        System.out.println(result);

        if(result != -1){
            System.out.println("The given element is founded in this array");
        }else{
            System.out.println("The given index does not found");
        }
    }
}

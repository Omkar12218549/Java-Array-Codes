package DAY1;

import java.util.Arrays;

public class Ques4BinarySearch {
    public static int binarySearch(int[] arr,int start,int end,int target){
        if(start>end){
            return -1;
        }
     int mid=(start+end)/2;
        if(arr[mid]==target){
            return target;
        }
        if(arr[mid]>target){
            return binarySearch(arr,start,mid-1,target);
        }else {
            return binarySearch(arr,mid+1,end,target);
        }


    }

    public static void main(String[] args) {
        int[] arr={1,2,34,455,566,5454,44,3};
        int target=44;
        Arrays.sort(arr);
        int result=binarySearch(arr,0,arr.length-1,target);
        if(result!=-1){
            System.out.println("The given number is founded in given array ");
        }else{
            System.out.println("The number is not founded in the given array");
        }

    }
}

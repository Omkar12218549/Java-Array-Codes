package Array;

import java.util.Arrays;

//public class Swapping {
//    public static void main(String[] args) {
//        int[] arr={1,22,12,112,21};
//        swap(arr,0,2);
//        System.out.println(Arrays.toString(arr));
//    }
//    static void swap(int[] arr,int index1,int index2){
//        //swapping
//        int temp=arr[index1];
//        arr[index1]=arr[index2];
//        arr[index2]=temp;
//    }
//}
public class Swapping{
    public static void swaper(int arr[],int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7};
        swaper(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
package PRACTICEE;


public class SortCHeking {
    public static boolean isSorted(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr={6,5,4,3,2,1};
        if (isSorted(arr)){
            System.out.println("The given array is sorted");
        }else {
            System.out.println("Not sorted in ascending order");
        }
    }
}

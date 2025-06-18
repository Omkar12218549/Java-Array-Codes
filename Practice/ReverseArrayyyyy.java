package Practice;

public class ReverseArrayyyyy {
    public static void reverser(int[] arr,int start,int end){
        start=0;
        end= arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        reverser(arr,0, arr.length-1);

        for(int nums:arr){
            System.out.print(nums+" ");
        }
    }
}

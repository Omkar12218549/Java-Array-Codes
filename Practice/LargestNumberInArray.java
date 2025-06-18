package Practice;

public class LargestNumberInArray {
    public static void main(String[] args) {
        int[] arr={11,22,32,12,22,1};
        int smallest=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }

        }
        System.out.println("The largest Number is: "+smallest);
    }
}

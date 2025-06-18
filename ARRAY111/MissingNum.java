package ARRAY111;

public class MissingNum {
    public static  int MissingNum(int arr[],int n){
        int ExpectedSum=n*(n+1)/2;
        int actualSum=0;
        for(int i=0;i< arr.length;i++){
            actualSum+=arr[i];
        }
        return ExpectedSum-actualSum;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,6};
        int n=6;
        System.out.println(MissingNum(arr,n));

    }
}

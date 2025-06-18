package Array;

public class FindtheMissingnumArray {
    public static int missingNum(int[] arr,int n){
        int ExpectedSum=n*(n+1)/2;
        int actualSum=0;
        for(int i=0;i< arr.length;i++){
            actualSum+=arr[i];

        }
        return ExpectedSum-actualSum;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,5,6};
        int n=6;
        int result=missingNum(arr,n);
        System.out.println(result);
    }
}

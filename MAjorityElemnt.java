package Array;

public class MAjorityElemnt {
    public static int majo(int []arr){
        int n= arr.length;
        for (int i=0;i<n;i++){
            int count=0;
            for (int j=0;j<n;j++){
                if(arr[j]==arr[i]){
                    count++;
                }
            }
            if(count>n/2){
                return arr[i];

            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,1,1,1,2,2};
        int result=majo(arr);
        System.out.println(result);
    }
}

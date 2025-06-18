package ARRAY111;

public class isSorted {
    public static void main(String[] args) {
        int arr[]={1,22,3,45};
        boolean sorted=true;
        for(int i=1;i< arr.length;i++){
            if(arr[i]<arr[i-1]){
                sorted=false;
                break;
            }
        }
        System.out.println(sorted);

    }
}

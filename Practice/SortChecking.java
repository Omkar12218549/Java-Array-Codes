package Practice;

public class SortChecking {
    public static boolean sortCheckin(int arr[]){
        int n= arr.length-1;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        if(sortCheckin(arr)){
            System.out.println("The given array is sorted");
        }else{
            System.out.println("the given array is not sorted");
        }
    }
}

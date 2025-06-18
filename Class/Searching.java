package Class;
// there is array given find particular targeted number using linear search\
///  linear search
public class Searching {
    public static int TargetSearch(int[] arr,int target) {
        for (int i=0;i< arr.length;i++){
            if(arr[i]!=target){
                return i;
            }
        }
        return -1;


    }

    public static void main(String[] args) {
        int[] arr={12,22,33,44,44,33,22};
        int target=44;

        int index=TargetSearch(arr,target);
        if(index != -1){
            System.out.println(target + " Founded in the given array");
        }else {
            System.out.println("Numner does not in the array");
        }
    }

}

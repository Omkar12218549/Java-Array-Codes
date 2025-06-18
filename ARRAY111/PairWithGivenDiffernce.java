package ARRAY111;
import java.util.*;

public class PairWithGivenDiffernce {
    public static void main(String[] args) {
        int []arr={5,10,3,2,50,80};
        int target=78;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int complemnt1=target+arr[i];
            int complement2=arr[i]-target;
            if(set.contains(complemnt1)){
                System.out.println(arr[i]+" "+complemnt1);
                return;
            }
            if(set.contains(complement2)){
                System.out.println(arr[i]+" "+complement2);
                return;
            }
            set.add(arr[i]);
        }
        System.out.println("No pair found");
    }
}

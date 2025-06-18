package ARRAY111;
import java.util.*;

public class PairWithGivenSum {
    public static void main(String[] args) {


        int arr[]={5,4,3,6,7,5};
        int target=10;
        Set<Integer> set=new HashSet<>();

        for(int num: arr){
            int complement=target-num;
            if(set.contains(complement)){
                System.out.println(num+" "+complement);
            }
            set.add(num);
        }

    }
}

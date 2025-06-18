package PRACTICEE;

import java.util.HashMap;
import java.util.*;

public class TWOSUM {
    public  static int[] twoSum(int arr[],int target){
        Map<Integer,Integer>map=new HashMap<>();

        for(int i=0;i< arr.length;i++){
            int complement=target-arr[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(arr[i],i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int arr[]={3,1,5,7,9};
        int target=10;
        int[] result=twoSum(arr,target);
        if(result.length==2){
            System.out.println("Indices Founded:"+result[0]+","+result[1]);
            System.out.println("Values Founded"+arr[result[0]]+","+arr[result[1]]);
        }else{
            System.out.println("No pair found with given target");
        }
    }
}

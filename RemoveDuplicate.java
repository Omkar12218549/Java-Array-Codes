package Array;
import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[]={1,2,33,33,44,44,4,44};

        //adding element to the set
        Set<Integer> set=new LinkedHashSet<>();
        for(int num:arr){
            set.add(num);
        }

        //convert the set again into the array

        int uniqueArr[]=new int[set.size()];
        int i=0;
        for(int num:set){
            uniqueArr[i++]=num;
        }


        // print the updated array
        System.out.print("The updated array is: ");
        for(int num:uniqueArr){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("The size of the updated array is: "+uniqueArr.length);


    }
}

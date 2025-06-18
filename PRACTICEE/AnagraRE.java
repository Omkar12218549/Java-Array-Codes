package PRACTICEE;
import java.util.*;
import java.util.Arrays;

public class AnagraRE {
    public static boolean isAnagram(String str1,String str2){
        //check whether to string are equal or not
        if(str1.length()!=str2.length()) {
            System.out.println("The size of both the string should be same");
        }
            //remove all spaces and convert into lowercase
            str1=str1.replaceAll("\\s","").toLowerCase();
            str2=str2.replaceAll("\\s","").toLowerCase();

            //convert to characterArray

            char[] arr3=str1.toCharArray();
            char[] arr4=str2.toCharArray();

            //sorting both the array
            Arrays.sort(arr3);
            Arrays.sort(arr4);

        return Arrays.equals(arr3,arr4);
    }

    public static void main(String[] args) {
        String str1="rat";
        String str2="car";
        if(isAnagram(str1,str2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
//remove all spaces
//convert to char array
//sort the chaearray
//return Arrays.equals(arr1,arr2}
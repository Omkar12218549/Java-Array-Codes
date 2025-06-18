package DAY1;

import java.util.Arrays;

public class ques1 {
    public static boolean isAnagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            System.out.println("The length of string should be equal");
        }
        //remove all spaces and convert it into lowercase
        str1=str1.replaceAll("\\s","").toLowerCase();
        str2=str2.replaceAll("\\s","").toLowerCase();

        //Change string to the charArray
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();

        //sort the array
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }
    public static void main(String[] args){
        String str1="Omkar YAdav";
        String str2="Yadav omkar";
        if(isAnagram(str1,str2)){
            System.out.println("The given Strings are Anagram to each other");
        }else{
            System.out.println("The given string is not anagram");
        }
    }
}

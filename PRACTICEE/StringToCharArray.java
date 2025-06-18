package PRACTICEE;

import java.util.Arrays;

public class StringToCharArray {
    public static void main(String[] args) {
        String str="omkar";
        String str1="karoom";
        char[] arr=str.toCharArray();
        char[] arr1=str1.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);

        if(Arrays.equals(arr1,arr)){
            System.out.println("The given strings are anagram");
        }else{
            System.out.println("The given string is not anagram");
        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr1));
    }
}

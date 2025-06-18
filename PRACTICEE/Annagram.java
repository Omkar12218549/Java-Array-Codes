package PRACTICEE;

import java.util.*;
class Annagram{
    public static boolean isAnagram(String str,String str1){
        str=str.replaceAll("\\s","").toLowerCase();
        str1=str1.replaceAll("\\s","").toLowerCase();

        if(str.length()!=str1.length()){
            System.out.println("The given string does not equal");

        }
        //converting string to character array
        char[] arr=str.toCharArray();
        char[] arr1=str1.toCharArray();

        //sort the elements of the array
        Arrays.sort(arr);
        Arrays.sort(arr1);

        return Arrays.equals(arr,arr1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first string: ");
        String str=sc.nextLine();
        System.out.println("Enter your second string: ");
        String str1= sc.nextLine();

        if (isAnagram(str,str1)){
            System.out.println("The given string is a anagram");
        }else{
            System.out.println("The given string is not anagram");
        }
        sc.close();

    }
}
package PRACTICEE;

import java.util.Scanner;

public class VowelReplace {
    public static boolean isVowel(char c){
        char[] vowels={'a','e','i','o','u','U','O','I','E','A'};
        for(char vowel:vowels){
            if(vowel==c){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str= sc.nextLine();

        char[] arr1=str.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            if (isVowel(arr1[i])){//
                arr1[i]='*';
            }
        }
        String requrestr=new String(arr1);
        System.out.println(requrestr);
    }
}

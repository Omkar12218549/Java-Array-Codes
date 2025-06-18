package PRACTICEE;

import java.util.Scanner;

public class consonenetReplace {
    public static boolean isVowel(char c){
        char[] vowels={'a','e','i','o','u','A','E','I','O','U'};
        for(char ch:vowels){
            if(ch==c){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ur string");
        String str= sc.nextLine();
        char[] arr=str.toCharArray();
        for (int i=0;i< arr.length;i++){
            if(!isVowel(arr[i])){
                arr[i]='*';
            }
        }
        String string=new String(arr);
        System.out.println(string);
    }
}

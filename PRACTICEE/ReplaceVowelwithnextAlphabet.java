package PRACTICEE;

import java.util.Scanner;

public class ReplaceVowelwithnextAlphabet {
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
        String str= sc.nextLine();
        char[] ch=str.toCharArray();
        for(int i=0;i< ch.length;i++){
            if(isVowel(ch[i])){
                ch[i]=(char) (ch[i]+1);
            }
        }
        String result=new String(ch);
        System.out.println(result);
    }

}

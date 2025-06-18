package DAY1;

import java.util.Scanner;

public class ReplacingVowelWithStar {
    public static boolean isVowel(char c){
        char[] vowels={'a','e','i','o','u','A','E','I','O','U'};
        for(char ch:vowels){
            if(ch==c){
                return true;
            }
        }
        return false;
    }
    public static String Replace(String str){
        String result="";
//        str=str.replaceAll("\\n","");
        for(char ch:str.toCharArray()){
            if(isVowel(ch)){
                result += (int) ch;
            }else{
                result+=ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String");
        String str= sc.nextLine();
        String result=Replace(str);
        System.out.println(result);
    }
}
//String result="";
//char[] arr=str.toCharArray();
//for(int i=0;i<arr.length;i++){
//if(isvowel(arr[i])){result+=(int) arr[i]}
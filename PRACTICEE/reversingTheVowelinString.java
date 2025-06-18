package PRACTICEE;
import java.util.*;
public class reversingTheVowelinString {
    public static boolean isVowel(char c){
        char[] vowels={'a','e','i','o','u','A','E','I','O','U'};
        for(char ch:vowels){
            if( ch == c){
                return true;
            }
        }
        return false;

    }
    public static String isRevese(String str){
        char[] arr=str.toCharArray();
        int i=0;
        int j= arr.length-1;
        while (i<j){
            if (!isVowel(arr[i])){
                i++;
                continue;
            }
            if (!isVowel(arr[j])){
                j--;
                continue;
            }
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return new String(arr);


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string");
        String str=sc.nextLine();

        String resultStr=isRevese(str);
        System.out.println(resultStr);
    }
}

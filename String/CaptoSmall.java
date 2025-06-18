package String;

import java.util.Scanner;

public class CaptoSmall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str= sc.nextLine();
       StringBuilder toggle=new StringBuilder(str);
       for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
           if(Character.isLowerCase(ch)||Character.isUpperCase(ch)){
               toggle.setCharAt(i,Character.toLowerCase(ch));
           }
       }
        System.out.println(toggle);
        sc.close();
    }
}

package String;

import java.util.Scanner;

public class Prac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str= sc.nextLine();
        StringBuilder togglestr=new StringBuilder(str);
//        System.out.println("The toggked string is: "+togglestr);
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch)){
                togglestr.setCharAt(i,Character.toLowerCase(ch));
            }else if (Character.isLowerCase(ch)){
                togglestr.setCharAt(i,Character.toUpperCase(ch));
            }
        }
               System.out.println("The toggked string is: "+togglestr);

        sc.close();

    }

}

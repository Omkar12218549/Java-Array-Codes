package String;

import java.util.*;

public class Togglii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String ");
        String str=sc.nextLine();
        StringBuilder toggledstr=new StringBuilder(str);
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A' && ch<'Z'){
                toggledstr.setCharAt(i,Character.toLowerCase(ch));
            }else if(ch>='a' && ch<'z'){
                toggledstr.setCharAt(i,Character.toUpperCase(ch));
            }else{
                toggledstr.append(ch);
            }
        }
        System.out.println(toggledstr);
        sc.close();

    }
}

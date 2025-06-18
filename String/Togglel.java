package String;

import java.util.*;
public class Togglel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder str=new StringBuilder(sc.nextLine());


        for (int i=0;i<str.length();i++){
            boolean flag=true;
            char ch=str.charAt(i);//A
            if(ch==' ') continue;
            int ascii=(int) ch;//65
            if(ch>=97) flag=false;
            if(flag==true){
                ascii+=32;
                char dh=(char)ascii;
                str.setCharAt(1,dh);
            }else{
                ascii-=32;
                char dh=(char) ascii;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);
    }
}

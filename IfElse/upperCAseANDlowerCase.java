package IfElse;

import java.util.Scanner;

public class upperCAseANDlowerCase {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(Character.isUpperCase(ch)){
            System.out.println("Uppercase");
        }else if(Character.isLowerCase(ch)){
            System.out.println("lowercase");
        }else{
            System.out.println("Not alphabet");
        }
        sc.close();

    }
}
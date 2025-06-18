package IfElse;

import java.util.Scanner;

public class NumberPalindromeCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int rev=0;
        while(temp>0){
            int dogit=temp%10;
            rev=rev*10+dogit;
            temp/=10;
        }
        if(num==rev){
            System.out.println("The given number is Palindrome");
        }else{
            System.out.println("The given number is not palindrome");
        }
    }
}

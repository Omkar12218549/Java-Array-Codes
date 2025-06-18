package Class;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        String reverse=new StringBuilder(str).reverse().toString();
        if(str.equals(reverse)){
            System.out.println("given String is palindrome");
        }else{
            System.out.println("Not paindrome");
        }
    }
}

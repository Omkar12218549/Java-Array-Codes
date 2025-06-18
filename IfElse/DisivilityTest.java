package IfElse;

import java.util.Scanner;

public class DisivilityTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        if(n%5==0){
            System.out.println("Divisible by 5");
        } else if (n%11==0) {
            System.out.println("Divisible by 11");
        }
    }
}

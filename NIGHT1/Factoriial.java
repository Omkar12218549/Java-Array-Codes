package NIGHT1;

import java.util.Scanner;

public class Factoriial {
    public static int factorial(int n) {
        if(n==0 || n==1) return 1;//base case
        return n*factorial(n-1);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("The factorial of two nummber is "+ factorial(n));
    }
}

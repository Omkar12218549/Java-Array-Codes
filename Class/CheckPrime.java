package Class;

import java.util.Scanner;

public class CheckPrime {
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number= sc.nextInt();
        if(isPrime(number)){
            System.out.println(number+" Is a prime number");

        }else {
            System.out.println(number+" Is not prime number");
        }
    }
}

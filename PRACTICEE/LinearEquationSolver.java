package PRACTICEE;

import java.util.Scanner;

public class LinearEquationSolver {
    public static double LinearSolver(double a,double b){
        return -b/a;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Solving the equation of type ax+b=0");
        System.out.println("Enter the value of a");
        double a=sc.nextDouble();
        System.out.println("ENter the value of b");
        double b=sc.nextDouble();

        if(a==0){
            System.out.println("There is no soution");
        }else {
            double solution=LinearSolver(a,b);
            System.out.println("The solution of the given equation is : "+solution);
        }
        sc.close();
    }
}

package IfElse;

import java.util.Scanner;

public class rootsOfQuadraticEquation {
    public static void findRoot(double a,double b,double c){
        double discri=b*b-4*a*c;
        if(discri>0){
            double root1=(-b+Math.sqrt(discri))/(2*a);
            double root2=(-b-Math.sqrt(discri))/(2*a);
            System.out.println("The real and distinct roots are: "+root1+" "+root2);
        }else if(discri==0){
            double root3=(-b)/(2*a);
            System.out.println("The real and equal roots are: "+root3);
        }else {
            System.out.println("No real root,there is complex root ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the coefficiens a,b,c");
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        double c= sc.nextDouble();
        findRoot(a,b,c);
    }
}

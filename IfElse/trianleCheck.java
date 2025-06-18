package IfElse;

public class trianleCheck {
    public  static void trangle(int a,int b,int c){
        if(a+b>c&&b+c>a&&c+a>b){
            if(a==b && b==c){
                System.out.println("equilateral Triangle");
            }else if(a==b||b==c||c==a){
                System.out.println("Isoscles triangle");
            }else{
                System.out.println("Scalene triangle");
            }
        }
    }

    public static void main(String[] args) {
        int a=1;
        int b=3;
        int c=2;
        System.out.println();trangle(a,b,c);

    }
}

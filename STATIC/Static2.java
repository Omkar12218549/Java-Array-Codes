package STATIC;

public class Static2 {
    static int a;
    static int b;

    int n;
    int m;

    static {
        System.out.println("Static block");
        a=10;
        b=20;
    }
    {
        System.out.println("non-static block");
        n=100;
        m=200;
    }
    static void dis1(){
        System.out.println("The value of static var a is:  "+a);
        System.out.println("The value of static var a is:  "+b);

    }
    void dis2(){
        System.out.println("The value of non-static var n is:  "+n);
        System.out.println("The value of non-static var a is:  "+m);
    }

    public static void main(String[] args) {

        Static2 obj=new Static2();
        Static2.dis1();
        obj.dis2();

    }


}

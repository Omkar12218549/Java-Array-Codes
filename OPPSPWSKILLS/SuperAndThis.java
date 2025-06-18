package OPPSPWSKILLS;

class Demo1{
    int a,b;
    public Demo1(){
        System.out.println("This is parent class constructor");
    }
    public Demo1(int x,int y){
        System.out.println("This is parent class paremeterized constructor");
        a=x;
        b=y;
    }
}
class Demo2 extends Demo1{
    int m,n;
    public Demo2(){
        super(23,45);
        System.out.println("This is child class parameter");
    }
    public Demo2(int x,int y){
        this();
        System.out.println("This is child class parameterized constructor");
        m=x;
        n=y;
    }
}

public class SuperAndThis {
    public static void main(String[] args) {
//        Demo2 obj=new Demo2();
        Demo2 obj1=new Demo2(23,44);
    }
}

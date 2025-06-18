package PRACTICEE;

public class Calculator {
    public int add(int n1,int n2){
        int result=n1+n2;
        return result;
    }
    public int sub(int n1,int n2){
        int result=n1-n2;
        return result;
    }
    public int product(int n1,int n2){
        int result=n1*n2;
        return result;
    }
    public int divide(int n1,int n2){
        if(n2==0){
        throw new ArithmeticException("Division with Zero is not allowed");

        }
        return n1/n2;
    }
}
class LaunchCal{
    public static void main(String[] args) {
        Calculator obj=new Calculator();
        System.out.println(obj.add(23,44));
        System.out.println(obj.sub(100,44));
        System.out.println(obj.product(2,44));
        System.out.println(obj.divide(844,0));




    }
}

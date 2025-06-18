package IfElse;

public class FactorialCal {
    public static int facCal(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int num=30;
        int res=facCal(num);
        System.out.println(res);
    }
}

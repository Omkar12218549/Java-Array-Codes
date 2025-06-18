package IfElse;
import java.util.*;
public class isArmStrong {
    public static boolean isArmstrong(int num){
        int sum=0;
        int temp=num;
        int digitCount=String.valueOf(num).length();
        while(temp>0){
            int digit=temp%10;
            sum+=Math.pow(digit,digitCount);
            temp/=10;
        }
        return sum==num;

    }
    public static void main(String[] args) {
        int num=153;
        if(isArmstrong(num)){
            System.out.println("Armstrong");
        }else{
            System.out.println("not palindrome");
        }

    }
}

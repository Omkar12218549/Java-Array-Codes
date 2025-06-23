package Array;

import java.util.Scanner;

public class DayBetweenTwoNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();

  String days[]={
         "","Monday","Tues","Wed","Thu","Fri","Sat"
  };
        for(int i=a;i<=b+1;i++){
            System.out.println(days[i]);
        }
    }
}

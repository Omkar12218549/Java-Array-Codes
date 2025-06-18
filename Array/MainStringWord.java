package Array;

import java.util.*;
public class MainStringWord
{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        String words[]={
                "","one","two","three","four","five","six","seven","eight","nine"
        };

        for(int i=a;i<=b;i++){
            System.out.println(words[i]);
        }


    }
}
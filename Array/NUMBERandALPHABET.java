package Array;

import java.util.Scanner;

public class NUMBERandALPHABET {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        String[] words={
                "","one","two","three","four","five","six","seven","eight","nine"
        };

        for(int i=a;i<=b;i++){
            if(i>=1 && i<=9){
                System.out.println(words[i]);
            }else{
                if(i%2==0){
                    System.out.println("even");
                }else {
                    System.out.println("odd");
                }
            }
        }
    }
}

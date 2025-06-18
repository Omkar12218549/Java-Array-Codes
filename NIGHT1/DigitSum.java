package NIGHT1;

public class DigitSum {
    public static int DigiSum(int n){
        if(n==0) return 0;
        return (n%10) + DigiSum(n/10);
    }

    public static void main(String[] args) {
        int n=9876;
        System.out.println(DigiSum(n));
    }
}

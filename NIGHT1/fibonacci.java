package NIGHT1;

public class fibonacci {
    public static int Fibo(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return Fibo(n-1)+Fibo(n-2);
    }

    public static void main(String[] args) {
        int n=8;
        for(int i=0;i<n;i++){
            System.out.print(Fibo(i)+" ");
        }
    }
}

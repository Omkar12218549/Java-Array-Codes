package NIGHT1;

public class SumofNnaturalNu {
    public static int sum(int num) {
        if (num == 0) return 0;
        return num + sum(num - 1);
    }
    public static void main(String[] args) {
        int n=0;

        System.out.println(sum(n));
    }
}

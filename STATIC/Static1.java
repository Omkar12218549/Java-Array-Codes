package STATIC;

public class Static1 {
    static int a;
    static {
        System.out.println("Static method");
        a=10;
        System.out.println(a);
    }

    public static void main(String[] args) {
        System.out.println("This is main method");
    }


}

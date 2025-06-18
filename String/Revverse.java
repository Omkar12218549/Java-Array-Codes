package String;

public class Revverse {
    public static void main(String[] args) {
        String str="OmkarYadav";
        String reversestr=new StringBuilder(str).reverse().toString();
        System.out.println(reversestr);
        if(str.equals(reversestr)){
            System.out.println("This String is palindrome");
        }else{
            System.out.println("This is not a pao");
        }

    }




}

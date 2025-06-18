package DAY1;

public class Main
{
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
//            return true;
        }
        return true;
    }
    public static void main(String[] args) {
        String strr="adss ada";
        if(isPalindrome(strr)){
            System.out.println("The given string is palindrome");

        }else{
            System.out.println("The given string is not palindrome");
        }
    }
}
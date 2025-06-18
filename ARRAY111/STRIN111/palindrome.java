package ARRAY111.STRIN111;

public class palindrome {
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end=str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str="madasm";
        if(isPalindrome(str)){
            System.out.println("True");
        }else {
            System.out.println("false");
        }
    }

}

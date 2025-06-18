package String;

public class PalindromeArray {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        int start = 0;
        int end = array.length-1;
        boolean isPalindrome=true;
        while(start<end){
            if(array[start]!=array[end]){
                isPalindrome=false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindrome){
            System.out.println("isPlaindrome");


        }else{
            System.out.println("Not palindrome");
        }
    }
}

package DAY1;

public class SubStringCounting {
    public static boolean isPalindrome(String str){
        int start=0;
        int end=str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)) return false;
            start++;
            end--;

        }
        return true;
    }

    public static void main(String[] args) {
        String str="MADAM";
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                String sub=str.substring(i,j);
                if(isPalindrome(sub)){
                    System.out.print(sub+" ");
                    count++;
                }
            }
        }
        System.out.println("The number of palindromic substring founded is "+count);
    }
}

package Practice;

public class SubstringCountin {
    public static boolean isPalindrome(String s){
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)) return false;

            start++;
            end--;

        }
        return true;

    }

    public static void main(String[] args) {
        String str="madam";
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                String sub=str.substring(i,j);
                if(isPalindrome(sub)){
                    System.out.println(sub+" ");
                    count++;
                }
            }
        }
        System.out.println("\n the numbe rof substring in the given string is "+count);
    }

}

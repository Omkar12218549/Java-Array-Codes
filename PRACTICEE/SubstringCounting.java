package PRACTICEE;

public class SubstringCounting {
    public static boolean isPalindrome(String str){
        int x=0;
        int y= str.length()-1;
        while(x<y){
            if(str.charAt(x)!=str.charAt(y)) return false;
            x++;
            y--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str="madam";
        int count=0;
        for(int i=0;i< str.length();i++){
            for (int j=i+1;j<str.length();j++){

                String sub=str.substring(i,j);
                if(isPalindrome(sub)){
                    System.out.print(sub+" ");
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println("The given has "+count+"substring palindromic string");


    }
}

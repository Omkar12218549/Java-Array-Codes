package String;

public class ReverseString {

        public static String ReverseString(String str){
        StringBuilder sb=new StringBuilder(str);
        int i=0,j=sb.length()-1;
         while(i<j){
             //Swapping
             char temp= sb.charAt(i);
             sb.setCharAt(i, sb.charAt(j));
             sb.setCharAt(j,temp);

             //move the pointer
             i++;
             j--;


         }
         return sb.toString();







    }
    public static void main(String[] args) {
        String str="OMKAR";
//        String reversestr=ReverseString(str);
        System.out.println("Reverse String is: "+ ReverseString(str));


    }
}

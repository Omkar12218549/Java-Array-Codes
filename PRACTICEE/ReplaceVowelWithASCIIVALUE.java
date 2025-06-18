package PRACTICEE;

public class ReplaceVowelWithASCIIVALUE {
    public static boolean isVowel(char c){
        char[] vowels={'a','e','i','o','u','A','E','I','O','U'};
        for(char ch:vowels){
            if(ch==c){
                return true;
            }
        }
        return false;
    }
    public static String replaceASCII(String str){
        String result="";
        for (char ch:str.toCharArray()){
            if(isVowel(ch)){
                result +=(int) ch;

            }else {
                result +=ch;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        String str="OMKAR YADAV";
        String result=replaceASCII(str);
        System.out.println(result+" ");
    }
}

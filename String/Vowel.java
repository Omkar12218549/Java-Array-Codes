package String;

public class Vowel {
    public static void main(String[] args) {
        String str="Omkar yadav";
        int count=0;
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                count++;
            }
        }
        System.out.println("The number of vowel present: "+count);


}
}

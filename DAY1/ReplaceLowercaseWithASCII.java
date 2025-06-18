package DAY1;

public class ReplaceLowercaseWithASCII {
    public static void main(String[] args) {
        String str="OMKAR Yadav";
        StringBuilder replacer=new StringBuilder();
        for(char ch:str.toCharArray()){
            if(Character.isUpperCase(ch)){
                replacer.append((int) ch);
            }else{
                replacer.append(ch);
            }
        }
        System.out.println(replacer.toString());
    }
}

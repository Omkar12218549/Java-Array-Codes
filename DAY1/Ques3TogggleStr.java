package DAY1;

public class Ques3TogggleStr {
    public static String Toggle(String str){
        StringBuilder togglestr=new StringBuilder(str);
        for(int i=0;i<str.length()-1;i++){
            char ch=str.charAt(i);
            if(Character.isLowerCase(ch)){
                togglestr.setCharAt(i,Character.toUpperCase(ch));
            }
            else if(Character.isUpperCase(ch)){
                togglestr.setCharAt(i,Character.toLowerCase(ch));
            }
        }
        return togglestr.toString();
    }

    public static void main(String[] args) {
        String str="Omkar Yadav";
//        String result=Toggle(str);
        System.out.println(Toggle(str));
    }
}

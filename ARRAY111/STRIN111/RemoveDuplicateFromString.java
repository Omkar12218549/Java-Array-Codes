package ARRAY111.STRIN111;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromString {
    public static String removeDuplcate(String str){
        Set<Character> set=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for(char ch:str.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplcate("assassination"));
    }

}

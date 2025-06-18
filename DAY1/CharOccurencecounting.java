package DAY1;

public class CharOccurencecounting {
    public static int counter(String str){
        int count=0;
//        char[] arr=str.toCharArray();
        for(int i=0;i< str.length();i++){
            char ch=str.charAt(i);
            if(ch=='g'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str="gbcdh dbdfg ggg ff";
        System.out.println(counter(str));
    }
}

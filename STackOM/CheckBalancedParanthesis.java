package STackOM;

public class CheckBalancedParanthesis {
    public static boolean isBalanced(String expr){
        char[] stack=new char[expr.length()];
        int top=-1;

        for(char ch: expr.toCharArray()){
            if(ch=='('){
                stack[++top]=ch;
            } else if (ch==')') {
                if(top==-1) return false;
                top--;

            }
        }
        return top==-1;
    }

    public static void main(String[] args) {
        String expr="+b)*c)";
        System.out.println(isBalanced(expr) ? "Balanced":"Not Balanced");
    }
}

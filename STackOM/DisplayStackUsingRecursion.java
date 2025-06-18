package STackOM;

import java.util.Stack;

public class DisplayStackUsingRecursion {
    public static void disReverseRec(Stack<Integer> st){
        if(st.size()==0)return;

        int top=st.pop();
        System.out.print(top+" ");
        disReverseRec(st);
        st.push(top);
    }

    public static void main(String[] args) {


        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(3);
        st.push(5);
        st.push(34);

        disReverseRec(st);
//        System.out.println(st);

    }
}

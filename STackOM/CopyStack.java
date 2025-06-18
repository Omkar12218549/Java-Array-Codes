package STackOM;

import java.util.Scanner;
import java.util.Stack;

public class CopyStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer>st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println("ST Stack"+st);

        Stack<Integer>gt=new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());
        }
        System.out.println("GT Stack"+gt);

        Stack<Integer>rt=new Stack<>();
        while (gt.size()>0){
            rt.push(gt.pop());
        }
        System.out.println("RT Stack"+rt);

//        while(rt.size()>0){
//            st.push(rt.pop());
//        }
//        System.out.println(st);//reverse a stack








    }
}

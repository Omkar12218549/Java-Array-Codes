package STackOM;

import java.util.Stack;

public class DispalySStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

//        System.out.println("ST Stack"+st);//first method to print
//        Stack<Integer>rt=new Stack<>();
//        while (st.size()>0){
//            rt.push(st.pop());
//        }
//
//        while(rt.size()>0){
//            int x=rt.pop();     THIS IS SECOND METHOD
//            System.out.print(x+" ");
//            st.push(x);
//        }

        //3RD METHOD USING ARRAY
        int n=st.size();
        int arr[]=new int[n];

        // adding element to the array
        for(int i=n-1;i<=0;i++){
            arr[i]=st.pop();
        }

        //returing element again back to the array

        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
            st.push(arr[i]);
        }


    }
}

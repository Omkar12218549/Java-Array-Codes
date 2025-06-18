package STackOM;

public class ArrayImplementation {
    public static class Stack{

        int arr[]=new int[7];
        int idx=0;

        void push(int x){
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }

            arr[idx]=x;
            idx++;

        }

        int peek(){
            if(idx==0){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx-1];
        }

        int pop(){
            if(idx==0){
                System.out.println("Stack underFlow");
                return -1;
            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;

            return  top;
        }

        void dispaly(){
            for (int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx==0)return true;
            else return false;
        }

        boolean isFull(){
            if(idx==arr.length)return true;
            else return false;
        }
        int capacity(){
            return arr.length;
        }


    }

    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(12);
        st.push(34);
        st.push(64);st.push(84);st.push(94);
        st.dispaly();

        st.pop();
        st.dispaly();
        System.out.println(st.size());

        System.out.println(st.peek());

        st.push(23);
        st.push(56);
        st.push(32);
        System.out.println(st.isFull());

        st.push(32);

        System.out.println(st.capacity());

    }

}

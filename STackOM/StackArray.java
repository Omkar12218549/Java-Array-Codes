package STackOM;

public class StackArray {
    int top=-1;
    int size=5;
    int[] stack=new int[size];

    //pushing the element to the stack
    public void push(int value){
        if(size==size-1){
            System.out.println("Stack UnderFLow");
        }else{
            top++;
            stack[top]=value;
        }
    }

    //poping the element to the stack

    public void pop(){
        if(size==-1){
            System.out.println("Stack is empty:");
        }else{
            System.out.println("Popped: "+stack[top]);
            top--;
        }
    }

    // peeking the stack-- viewing the top element of the stack

    public void peek(){
        if(size==-1){
            System.out.println("Stack Underflow");
        }else{
            System.out.println("Top element is: "+stack[top]);
        }
    }

    //displaying the stack

    public void display(){
        if(size==-1){
            System.out.println("Stack is empty");
        }else{
            System.out.println("Stack:");
            for(int i=0;i<=top;i++){
                System.out.print(stack[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StackArray s=new StackArray();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();//10,20,30
        s.peek();//30
        s.pop();//30
    }
}

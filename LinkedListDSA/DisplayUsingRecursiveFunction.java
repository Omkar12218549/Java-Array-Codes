package LinkedListDSA;

public class DisplayUsingRecursiveFunction {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }


    }
    public static void displayrec(Node head){

        Node temp=head;
        if(temp==null)return;
        System.out.print(temp.data+" ");
        displayrec(temp.next);
    }

    public static void main(String[] args) {
        Node a=new Node(12);
        Node b=new Node(14);
        Node c=new Node(32);
        c.next=new Node(99);
        a.next=b;
        b.next=c;
        displayrec(a);


    }
}

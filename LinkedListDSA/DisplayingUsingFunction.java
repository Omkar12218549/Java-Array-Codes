package LinkedListDSA;

public class DisplayingUsingFunction {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }


        }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }

    }

    public static void main(String[] args) {
        Node a=new Node(12);
        Node b=new Node(14);
        Node c=new Node(32);
        a.next=b;
        b.next=c;
        display(a);


    }
}

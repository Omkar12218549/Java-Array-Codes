package LinkedListDSA;

public class Reverse {
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
        if(temp==null) return;
        displayrec(temp.next);
//        System.out.println(temp.data+" ");

    }

    public static void main(String[] args) {
        Node a=new Node(12);
        Node b=new Node(14);
        Node c=new Node(32);
        a.next=b;
        b.next=c;
        displayrec(a);




    }
}

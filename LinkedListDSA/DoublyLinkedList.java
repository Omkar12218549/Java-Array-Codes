package LinkedListDSA;

public class DoublyLinkedList {
    public static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(9);
        a.next=b;
        b.prev=a;

        Node c=new Node(7);
        b.next=c;
        c.prev=b;

        Node d=new Node(90);
        c.next=d;
        d.prev=c;

        Node currentHead=a;
        System.out.print("Forward: ");
        while (currentHead!=null){
            System.out.print(currentHead.data+" -> ");
            currentHead=currentHead.next;
        }
        System.out.println("null");

        currentHead=d;
        System.out.print("Backward: ");
        while (currentHead!=null){
            System.out.print(currentHead.data+" -> ");
            currentHead=currentHead.prev;
        }
        System.out.println("Null");


    }

}

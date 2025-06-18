package LinkedListDSA;

public class LinkedListCycle {
    public static class Node{
        int data;
        Node next;

        public  Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static boolean hascycle(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node head=new Node(90);
        head.next=new Node(34);
        head.next.next=new Node(21);
        head.next.next.next=new Node(35);
        head.next.next.next.next=head.next;
        System.out.println(hascycle(head));
    }

}

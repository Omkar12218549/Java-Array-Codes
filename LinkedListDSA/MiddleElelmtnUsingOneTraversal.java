package LinkedListDSA;

public class MiddleElelmtnUsingOneTraversal {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;

        }
    }
    public static Node MiddleNode(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node head=new Node(88);
        head.next=new Node(99);
        head.next.next=new Node(34);
        head.next.next.next=new Node(233);
        head.next.next.next.next=new Node(3333);
        head.next.next.next.next.next=new Node(90);

        Node q=MiddleNode(head);
        System.out.println(q.data);
    }
}

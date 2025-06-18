package LinkedListDSA;

public class RemoveNthNodeFromEnd {
    public  static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node RemoventhNodefromlast2(Node head, int n){
        Node slow=head;
        Node fast=head;
        for(int i=0;i<n;i++){
            fast=fast.next;

        }if(fast==null){
            head=head.next;
            return head;
        }
        while (fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;

    }
    public  static void display(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Node a=new Node(23);
        Node b=new Node(223);
        Node c=new Node(89);
        Node d=new Node(56);
        Node e=new Node(232);
        Node f=new Node(76);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
       display(a);
        a=RemoventhNodefromlast2(a,6);
        display(a);


    }

}

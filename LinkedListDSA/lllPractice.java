package LinkedListDSA;


public class lllPractice{
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;

        }

    }
    public static Node nthNode(Node head, int n){

        Node temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;

        }

        int m=size-n+1;

        temp=head;

        for(int i=1;i<m;i++){
            temp=temp.next;

        }
        return temp;

    }

    public static void main(String args[]){

        Node head=new Node(34);
        head.next=new Node(23);
        head.next.next=new Node(56);
        head.next.next.next=new Node(46);
        head.next.next.next.next=new Node(76);
        head.next.next.next.next.next=new Node(89);

        Node ans=nthNode(head,4);

        System.out.println(ans.data);


    }






}


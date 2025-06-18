package LinkedListDSA;

public class MiddleElellemntOfLL {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
//    public static int getSize(Node head){
//        int count=0;
//
//        while (head!=null){
//            count++;
//            head=head.next;
//        }
//        return count;
//    }
    public static Node getMiddleElelmnt(Node head){
        Node temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }

        int mid=size/2;
        temp=head;
        for(int i=0;i<mid;i++){
            temp=temp.next;
        }
        return temp;

    }
    public static void main(String[] args){
        Node head=new Node(34);
        head.next=new Node(2);
        head.next.next=new Node(93);
        head.next.next.next=new Node(232);
        head.next.next.next.next=new Node(233);

        Node middl=getMiddleElelmnt(head);
        if(middl!=null){
            System.out.println("The middle of the ll is  "+middl.data);
        }else{
            System.out.println("the given ll is emptyu");
        }

    }

}

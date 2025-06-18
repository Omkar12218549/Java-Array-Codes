package LinkedListDSA;
import java.util.*;
public class nthnodeFromLast {
    public  static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node nthNodefromlast(Node head,int n){
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


    public static void main(String[] args) {
        Node a=new Node(23);
        Node b=new Node(223);
        Node c=new Node(89);
        Node d=new Node(56);

        a.next=b;
        b.next=c;
        c.next=d;

        Node q=nthNodefromlast(a,2);
        System.out.println(q.data);


    }

}

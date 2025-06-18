package LinkedListDSA;

public class SmallestNumberInlinkedList {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static int findMinValur(Node head){
        int minValue=head.data;
        Node currentNode=head.next;

        while (currentNode!=null){
            if(minValue> currentNode.data){
                minValue=currentNode.data;
            }
            currentNode=currentNode.next;
        }
        return minValue;
    }

    public static void main(String[] args) {
        Node a=new Node(34);
        Node b=new Node(21);
        Node c=new Node(54);
        Node d=new Node(44);

        a.next=b;
        b.next=c;
        c.next=d;
        System.out.println("The min value present in the ll is: "+findMinValur(a));


    }
}

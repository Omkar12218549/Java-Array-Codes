package LinkedListDSA;

public class Main {
    static class  Node{
        int data;
        Node next;


        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static void main(String[] args) {
        //creation of node
        Node firstNode=new Node(4);
        Node seconNode=new Node(14);
        Node thirdNode=new Node(24);
        Node fourthNode=new Node(34);

        //linkiing the node
        firstNode.next=seconNode;
        seconNode.next=thirdNode;
        thirdNode.next=fourthNode;

        Node currentNode=firstNode;
        while (currentNode!=null){
            System.out.print(currentNode.data+"->");
            currentNode=currentNode.next;
        }
        System.out.println("null");

    }
}

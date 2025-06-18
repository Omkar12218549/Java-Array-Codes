package LinkedListDSA;

public class IsertionOfLinkedListUsingMethod {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class linkedList{
        Node head=null;
        Node tail=null;
        void inserAtEnd(int val){
            Node temp=new Node(val);//this node is made to insert the newly added node
            if(head==null){
                head=temp;
                tail=temp;
            }else{
                tail.next=temp;
                tail=temp;
            }
        }
        void display(){
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        int Size(){
            Node temp=head;
            int count=0;
            while (temp!=null){
                temp=temp.next;
                count++;
            }
            return count;
        }

    }

    public static void main(String[] args) {
        linkedList ll=new linkedList();
        ll.inserAtEnd(2);
        ll.inserAtEnd(5);
        ll.inserAtEnd(4);
        ll.inserAtEnd(34);
        ll.display();
        System.out.println();
        System.out.println(ll.Size());
    }
}

package LinkedListDSA;
public class INSERTION {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;

        void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }else{
                tail.next=temp;
                tail=temp;
            }
        }
        void insertAtHead(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }else{
                temp.next=head;
                head=temp;
            }
        }
        void insertAt(int idx,int val){
            Node t=new Node(val);
            Node temp=head;
            if(idx==size()){//  these loop are made to set tail at the last element means if we are adding at last and at 0th index
                insertAtEnd(val);
                return;
            } else if (idx==0) {
                insertAtHead(val);
                return;
            } else if (idx<0 || idx>size()) {
                System.out.println("Wrong Index");
            }
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }

        int size(){
            Node temp=head;
            int count=0;
            while (temp!=null){
                temp=temp.next;
                count++;
            }
            return count;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println("null");
        }

    }

    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtEnd(67);
        ll.insertAtEnd(89);
        ll.insertAtEnd(56);
        ll.display();

        ll.insertAtHead(90);
        ll.display();


        ll.insertAt(2,23);
        ll.display();
    }

}
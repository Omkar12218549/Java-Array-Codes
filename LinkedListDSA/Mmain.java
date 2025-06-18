package LinkedListDSA;


public class Mmain
{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;

        }
    }
    public static class LinkedList{
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
            if(idx==0){
                insertAtHead(val);
                return;
            }
            if(idx==size()){
                insertAtEnd(val);
                return;
            }


            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;

        }



        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println("null");
        }

        int size(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                temp=temp.next;
                count++;
            }
            return count;
        }



        int middleElemnt(){
            Node temp=head;

            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }

            temp=head;
            int mid=count/2;

            for(int i=0;i<mid;i++){
                temp=temp.next;
            }
            return temp.data;
        }

    }













    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.insertAtHead(3);
        ll.insertAtHead(99);
        ll.insertAtEnd(34);
        ll.insertAtEnd(23);
        ll.insertAtEnd(12);
        ll.insertAtEnd(4);
        ll.insertAtEnd(55);
        ll.insertAtEnd(89);
        ll.insertAt(0,232);
        ll.insertAt(9,143);
        ll.display();
        System.out.println(ll.size());
        System.out.println(ll.middleElemnt());



    }
}
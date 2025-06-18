package LinkedListDSA;
//1. Find Middle of Linked List (One Traversal)
//2. Reverse Linked List
//3. Detect Cycle in Linked List
//4. Find Length of Linked List
//5. Get Nth Node from End (One Traversal)
class FIVEQues{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" => ");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    //1. Find Middle of Linked List (One Traversal)

    public static Node MiddleOfLL(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    // 2. Reverse Linked List
    public static void  ReverseRecu(Node head){
        Node temp=head;
        if(temp==null) return;
        ReverseRecu(temp.next);
        System.out.print(temp.data+" => ");
        //   System.out.println();
    }
    //3. Detect Cycle in Linked List
    public static boolean hasCycle(Node head){
        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    //4. Find Length of Linked List
    public static int size(Node head){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;

        }
        return count;
    }
    //5. Get Nth Node from End (One Traversal)
    public static Node nthNodeFromEnd(Node head,int n){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;

    }


    public static void main(String[] args){
        Node a=new Node(78);
        Node b=new Node(77);
        Node c=new Node(12);
        Node d=new Node(34);
        Node e=new Node(65);
        Node f=new Node(76);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        display(a);
        //1
        Node q=MiddleOfLL(a);
        System.out.println(q.data);
        //2
        ReverseRecu(a);
        System.out.println();

        // 3
        System.out.println("The ll has cycle? : "+hasCycle(a));

        //4
        System.out.println(size(a));


        //5
        Node ss=nthNodeFromEnd(a,4);
        System.out.println(ss.data);

    }



}
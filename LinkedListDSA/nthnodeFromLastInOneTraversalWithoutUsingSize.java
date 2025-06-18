package LinkedListDSA;

public class nthnodeFromLastInOneTraversalWithoutUsingSize {
    public static class Node{
        int  data;
        Node next;

        Node(int data)
        {
            this.data=data;
        }
    }
    public static Node nthNodefromlast2(Node head,int n){
        Node slow=head;
        Node fast=head;

        for(int i=0;i<n;i++){
           fast=fast.next;
        }


        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }

        return slow;

    }


    public static void main(String[] args) {
        Node a=new Node(67);
        Node b=new Node(78);
        Node c=new Node(23);
        Node d=new Node(56);
        Node e=new Node(77);
        Node f=new Node (34);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        Node q=nthNodefromlast2(a,2);
        System.out.println(q.data);

        Node ans=nthNodefromlast2(a,4);
        System.out.println(ans.data);


    }

}

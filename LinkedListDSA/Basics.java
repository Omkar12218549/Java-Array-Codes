package LinkedListDSA;

public class Basics {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }

    }

    public static void main(String[] args) {
        Node a=new Node(23);
        Node b=new Node(34);
        Node c=new Node(56);
        Node d=new Node(9000);

        a.next=b;
        b.next=c;
        c.next=d;
//        System.out.println(a);//@6acbcfc0
//        System.out.println(a.next);//@5f184fc6
//        System.out.println(b);//@5f184fc6  BOTH ARE SAME
//        System.out.println(a.data);//23


        //OOORRRR


//        System.out.println(a.data);//23
//        System.out.println(a.next.data);//34
//        System.out.println(a.next.next.data);//56                      BY USING ONLY A WE CAN PRINT ALL THE ELEMENT
//        System.out.println(a.next.next.next.data);//9000



        //  OOORRR

        Node temp=a;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }


    }
}

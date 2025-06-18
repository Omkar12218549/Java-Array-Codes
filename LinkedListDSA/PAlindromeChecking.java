package LinkedListDSA;

public class PAlindromeChecking {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node reverse(Node head){
        Node prev=null,curr=head;
        while (curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;

    }
    public  static boolean isPalindrome(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {//middle element Calculation
            slow = slow.next;
            fast = fast.next.next;

        }
        Node firstHalf = head;
        Node secondHalf = reverse(slow);

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
                firstHalf = firstHalf.next;
                secondHalf = secondHalf.next;
            }

            return true;
        }

    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(2);
        head.next.next.next=new Node(1);
        System.out.println("Is the give ll is Palindrome: "+ isPalindrome(head));
    }



}


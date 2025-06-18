package BINARYTREE;

public class CountingNodeOfTree {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val=val;
            left=right=null;
        }

    }
    public static int countNode(Node root){
        if(root==null) return 0;
        return 1+countNode(root.left)+countNode(root.right);
    }

    public static void main(String[] args) {
        Node root=new Node(2);
        root.left=new Node(33);
        root.right=new Node(222);
        root.left.left=new Node(12);
        root.left.right=new Node(7);

        int count=countNode(root);
        System.out.println("The number of node is: "+count);
    }

}

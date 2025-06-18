package BINARYTREE;

public class IMMplementation {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val=val;
            left=right=null;
        }
    }
    public static void inOrder(Node root){//left,root,right
        if(root==null) return;

        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);



    }

    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(4);
        root.right=new Node(2);
        root.left.left=new Node(3);
        root.left.right=new Node(55);
        inOrder(root);
    }
}

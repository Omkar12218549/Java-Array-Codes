package BINARYTREE;




class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
        left=right=null;
    }
}


public class BinaryTreepostOrdet {

    Node root;

    void postOrder(Node node){
        if(node==null){
            return;
        }

        postOrder(node.left);

        postOrder(node.right);
        System.out.print(node.data+" ");

    }

    public static void main(String[] args) {
        BinaryTreepostOrdet tree=new BinaryTreepostOrdet();
       tree.root=new Node(5);
        tree.root.left=new Node(1);
        tree.root.right=new Node(2);
        tree.root.left.left=new Node(3);
        tree.root.left.right=new Node(4);


        System.out.println("Post order traversal: ");
        tree.postOrder(tree.root);
    }


}

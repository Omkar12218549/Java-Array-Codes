package BINARYTREE;

class NodePre {
    int data;
    NodePre left;
    NodePre right;

    public NodePre(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTreePreOrder {
    NodePre root;

    void preOrder(NodePre node) {
        if (node == null) {
            return;
        }
        // Visit root
        System.out.println(node.data + " ");

        // Visit left node
        preOrder(node.left);

        // Visit right node
        preOrder(node.right);
    }

    public static void main(String[] args) {
        BinaryTreePreOrder tree2 = new BinaryTreePreOrder();
        tree2.root = new NodePre(56);  // Use NodePre to create nodes
        tree2.root.left = new NodePre(6);  // Use NodePre to create nodes
        tree2.root.right = new NodePre(7);  // Use NodePre to create nodes
        System.out.println("PreOrder Traversal");
        tree2.preOrder(tree2.root);  // Pass root node, not root.data
    }
}

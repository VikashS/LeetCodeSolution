package code.java.tree;

public class CheckBinarySearchTree {
    Node root;
    public static void main(String[] args) {
        CheckBinarySearchTree tree= new CheckBinarySearchTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);
        tree.root.left.left.left = new Node(7);

        if(tree.isBST(tree.root)){
            System.out.println("yes is BST");
        }else{
            System.out.println("No its not BST");
        }
    }

    private boolean isBST(Node root)
    {
        if (root==null) return true;
        if(root.left.data < root.data && root.left!=null)
            return false;
        if(root.right.data>root.data && root.left!=null)
            return false;
        if(!isBST(root.left) && (!isBST(root.right)))
            return false;

        return true;
    }

}

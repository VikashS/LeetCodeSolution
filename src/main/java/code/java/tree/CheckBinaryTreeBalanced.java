package code.java.tree;

public class CheckBinaryTreeBalanced {
    Node root;
    public static void main(String[] args) {
        CheckBinaryTreeBalanced tree = new CheckBinaryTreeBalanced();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);
        tree.root.left.left.left = new Node(7);

        if (tree.isBalanced(tree.root))
            System.out.println("Tree is balanced");
        else
            System.out.println("Tree is not balanced");
    }

    private boolean isBalanced(Node node)
    {
        int lh,rh;
        if(node==null) return true;
        lh = heightleft(node.left);
        rh = heightRight(node.right);
        if(Math.abs(lh-rh)<=1 && isBalanced(node.left) && isBalanced((node.right))) {
            return true;
        }
        return false;
    }

    private int heightleft(Node node)
    {
        if(node==null)return -1;
        int ht=0;
        return 1+ (ht+heightleft(node.left));
    }

    private int heightRight(Node node)
    {
        if(node==null)return -1;
        int ht=0;
        return 1+ (ht+heightRight(node.right));
    }
}

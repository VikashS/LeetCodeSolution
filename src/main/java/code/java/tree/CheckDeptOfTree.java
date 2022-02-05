package code.java.tree;

public class CheckDeptOfTree {
    Node root;
    public static void main(String[] args) {
        CheckDeptOfTree tree=new CheckDeptOfTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("Height of tree is : " +
                tree.maxDepth(tree.root));
    }

    private int maxDepth(Node root)
    {
        int maxDept=0;
        if(root==null) return -1;
        else{
            int leftDept = 0,rightDept=0;
            leftDept=leftDept+maxDepth(root.left);
            rightDept=rightDept+maxDepth(root.right);
            maxDept=Math.max(leftDept,rightDept) +1;
        }

        return maxDept;
    }
}

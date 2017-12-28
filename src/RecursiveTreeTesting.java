public class RecursiveTreeTesting {

    //In-order traversal means to "visit" the left branch, then the current node, and finally the right branch.
    // 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8
    public static void inOrderTraversal(TreeNode node) {
        if(node != null) {
            inOrderTraversal(node.left);
            visit(node);
            inOrderTraversal(node.right);
        }
    }
    //pre order traversal visits the current node bfore its child nodes. Root is always first node visited
    // 5 -> 3 -> 2 -> 4 -> 7 -> 6 -> 8
    public static void preOrderTraversal(TreeNode node) {
        if(node != null) {
            visit(node);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    //Post-order traversal visits the current node after its child nodes. Root is always last node visited.
    //from the bottom up from left subtree to right
    // 2 -> 4 -> 3 -> 6 -> 8 -> 7 -> 5
    public static void postOrderTraversal(TreeNode node) {
        if(node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            visit(node);
        }
    }

    public static void visit(TreeNode node) {
        System.out.println("Visiting: " + node.data);
    }

    public static void main(String[] args) {
        //TreeNode n1 = new TreeNode(1, null, null);
        TreeNode n2 = new TreeNode(2, null, null);
        TreeNode n3 = new TreeNode(3, null, null);
        TreeNode n4 = new TreeNode(4, null, null);
        TreeNode n5 = new TreeNode(5, null, null);
        TreeNode n6 = new TreeNode(6, null, null);
        TreeNode n7 = new TreeNode(7, null, null);
        TreeNode n8 = new TreeNode(8, null, null);
        //TreeNode n9 = new TreeNode(1, null, null);

        //left subtree
        n5.left = n3;
        n3.left = n2;
        n3.right = n4;

        n5.right = n7;
        n7.left = n6;
        n7.right = n8;

        //inOrderTraversal(n5);
        //preOrderTraversal(n5);
        postOrderTraversal(n5);



    }
}

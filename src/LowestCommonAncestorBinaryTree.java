public class LowestCommonAncestorBinaryTree {

    public static TreeNode lowestAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
            return null;

        //if a root node is equal to the value of p or q, return
        //  that node to the correct branch
        if(root == p || root == q)
            return root;


        /*Code To Test the logic
	  Creating an example tree
	             5
			   /   \
			  3      7
			 / \    /  \
			2   4  6     8

        POST ORDER:

        2 -> 4 -> 3 -> 6 -> 8 -> 7
        */

        TreeNode left = lowestAncestor(root.left, p, q);
        TreeNode right = lowestAncestor(root.right, p, q);

        //if right subtree is null, then we traversed and never found
        //   a node equal to p or q
        if(right == null)
            return left;

        //if left == null we traversed and never found a node in the left
        //  subtree equal to p or q
        else if(left == null)
            return right;

        //return the root node because both are not null,
        // i.e in other subtrees
        else
            return root;


    }

    public static void main(String[] args) {
        TreeNode n2 = new TreeNode(2, null, null);
        TreeNode n3 = new TreeNode(3, null, null);
        TreeNode n4 = new TreeNode(4, null, null);
        TreeNode n5 = new TreeNode(5, null, null);
        TreeNode n6 = new TreeNode(6, null, null);
        TreeNode n7 = new TreeNode(7, null, null);
        TreeNode n8 = new TreeNode(8, null, null);
        TreeNode n9 = new TreeNode(12, null, null);

        TreeNode n15 = new TreeNode(15, null, null);
        //left subtree
        n5.left = n3;
        n3.left = n2;
        n3.right = n4;

        n5.right = n7;
        n7.left = n6;
        n7.right = n8;
        //n8.right = n9;
        //n9.right = n15;


        //System.out.println(val.data);
        lowestAncestor(n5, n9, n6);
    }
}

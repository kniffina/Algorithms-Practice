public class MirrorBinaryTree {

    public static TreeNode mirror(TreeNode root) {
        if(root == null)
            return null;

        TreeNode curr =  null;

        //post order traversal
        //  have left subtree 2, 4, 3 (in that order after rec)
        //  rebuilt, then right.

        mirror(root.left);
        mirror(root.right);

        //root is now back at the root. Set root.left = right and visa versa
        curr = root.left;
        root.left = root.right;
        root.right = curr;

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

        mirror(n5);


    }
}
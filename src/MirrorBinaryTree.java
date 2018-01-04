public class MirrorBinaryTree {

    public static TreeNode mirror(TreeNode root) {
        if(root == null)
            return null;

        TreeNode curr =  null;

        //post order traversal.
        //   from the bottom up
        mirror(root.left);
        mirror(root.right);

        curr = root.left;
        root.left = root.right;
        root.right = curr;

        return root;

    }
}
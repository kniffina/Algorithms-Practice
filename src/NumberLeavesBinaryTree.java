public class NumberLeavesBinaryTree {

    public static int numberOfLeaves(TreeNode root) {
        if(root == null) return 0;
        else if(root.left == null && root.right == null) return 1;
        else {
            return numberOfLeaves(root.left) + numberOfLeaves(root.right);
        }
    }
}

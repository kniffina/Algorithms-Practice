public class IsIdentialBinaryTrees {

    public boolean isIdentical(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) return true;
        else if(root1 == null && root2 != null || root1 != null && root2 == null) return false;
        else
            return (root1.data == root2.data) && isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
    }
}

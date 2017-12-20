public class ValidateBST {
    public static boolean validateBST(TreeNode root) {
        return validateBST(root, null, null);
    }

    private static boolean validateBST(TreeNode root, Integer min, Integer max) {
        if(root == null) return true;
        if(min != null && root.data < min || max != null && root.data > max)
            return false;

        return validateBST(root.left, min, root.data) && validateBST(root.right, root.data, max);
    }
}

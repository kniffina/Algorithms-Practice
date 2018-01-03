public class FindKthSmallest {

    public TreeNode find(TreeNode root, int k) {
        if(root == null)
            return null;

        int leftSize = 0;

        if(root.left != null) {
            //leftSize = size(root.left);
        }
        if(leftSize + 1 == k) {
            return root;
        } else if(k <= leftSize) {
            return find(root.left, k);
        } else {
            return find(root.right, k-leftSize - 1);
        }
    }
}

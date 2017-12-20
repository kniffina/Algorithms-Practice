public class FindMaxBinaryTreeRecursively {

    public static int findMax(TreeNode root) {
        int max = Integer.MIN_VALUE;
        int rootData = Integer.MAX_VALUE;
        int leftData = Integer.MIN_VALUE;
        int rightData = Integer.MIN_VALUE;

        if(root != null) {
            rootData = root.data;
            leftData = findMax(root.left);
            rightData = findMax(root.right);

            if(leftData > rightData) {
                max = leftData;
            }
            else {
                max = rightData;
            }

            if(rootData > max) {
                max = rootData;
            }
        }

        return max;

        /*
        if (root == null) return Integer.MIN_VALUE;

        return Math.max(root.data, Math.max(findMax(root.left), findMax(root.right)));
         */
    }
}

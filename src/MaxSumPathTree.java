public class MaxSumPathTree {

    public static int maxSumPath(TreeNode root) {
        int[] maxRecursiveHolder = new int[1];
        maxSumPathMain(root, maxRecursiveHolder);
        return maxRecursiveHolder[0];
    }

    public static int maxSumPathMain(TreeNode root, int[] max) {
        if (root == null) return 0;
        System.out.println("**: " + root.data);
        int leftSum = maxSumPathMain(root.left, max);
        int rightSum = maxSumPathMain(root.right, max);

        System.out.println("Left Sum: " + leftSum);
        System.out.println("Right Sum: " + rightSum);

        //get the max path sum up to this node, including this node's value
        int nodeCumulativeValue = Math.max(root.data + leftSum, root.data + rightSum);

        System.out.println("Cumulative Value: " + nodeCumulativeValue);
        System.out.println();
        max[0] = Math.max(max[0], leftSum + root.data + rightSum);

        return nodeCumulativeValue;
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

        System.out.println(maxSumPath(n5));
    }
}

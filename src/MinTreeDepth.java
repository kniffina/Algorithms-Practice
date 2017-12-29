public class MinTreeDepth {

    public static int minTreeDepth(TreeNode root) {
        if(root == null)
            return 0;
        if(root.left != null && root.right == null) {
            return minTreeDepth(root.left);
        }

        if(root.right != null && root.left == null) {
            return minTreeDepth(root.right);
        }

        return 1 + Math.min(minTreeDepth(root.left), minTreeDepth(root.right));
    }

    public static void main(String[] args) {
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

        System.out.println(minTreeDepth(n5));
    }




}

public class CheckIfTreeBalanced {

    public static boolean isBalanced(TreeNode root) {
        int result = getHeight(root);
        System.out.println("Height: " + result);

        if(result <= -1) {
            return false;
        } else {
            return true;
        }
    }

    public static int getHeight(TreeNode root) {
        if(root == null)
            return 0;

        int leftHeight = getHeight(root.left);
        if(leftHeight == -1)
            return -1;

        int rightHeight = getHeight(root.right);
        if(rightHeight == -1)
            return -1;

        int difference = Math.abs(rightHeight - leftHeight);

        if(difference > 1) {
            return -1; //signal that heights are broken
        }

        //otherwise return the height
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        TreeNode n2 = new TreeNode(2, null, null);
        TreeNode n3 = new TreeNode(3, null, null);
        TreeNode n4 = new TreeNode(4, null, null);
        TreeNode n5 = new TreeNode(5, null, null);
        TreeNode n6 = new TreeNode(6, null, null);
        TreeNode n7 = new TreeNode(7, null, null);
        TreeNode n8 = new TreeNode(8, null, null);
        TreeNode n9 = new TreeNode(1, null, null);

        TreeNode n15 = new TreeNode(15, null, null);
        //left subtree
        n5.left = n3;
        n3.left = n2;
        n3.right = n4;

        n5.right = n7;
        n7.left = n6;
        n7.right = n8;
        n8.right = n9;
        n9.right = n15;


        System.out.println(isBalanced(n5));
    }
}
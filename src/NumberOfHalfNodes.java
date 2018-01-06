import java.util.LinkedList;
import java.util.Queue;

public class NumberOfHalfNodes {

    public static int numHalfIterative(TreeNode root) {
        int count = 0;
        if(root == null) return count;

        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);

        while(!q.isEmpty()) {
            root = q.remove();

            if(root.left != null && root.right == null || root.right != null && root.left == null)
                count++;

            if(root.left != null)
                q.add(root.left);

            if(root.right != null)
                q.add(root.right);
        }
        return count;
    }

    public static int numHalfRecursive(TreeNode root) {
        if(root == null) return 0;

        int count = 0;

        //if left and right have 2 nulls we will return 0. If 1 null then count increment
        if(root.left != null) count++;
        if(root.right != null) count++;

        return numHalfRecursive(root.left) + numHalfRecursive(root.right) + (count == 1 ? 1 : 0);
    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1, null, null);
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
        n2.left = n1;

        n5.right = n7;
        n7.left = n6;
        n7.right = n8;
        n8.right = n9;
        //n9.right = n15;


        System.out.println(numHalfRecursive(n5));
    }
}

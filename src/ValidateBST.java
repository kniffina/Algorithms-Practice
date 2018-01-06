import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ValidateBST {
    public static boolean isBST(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> s = new Stack<>();
        TreeNode prev = null;

        while(root != null || !s.isEmpty()) {
            while(root != null) {
                s.push(root);
                root = root.left;
            }

            root = s.pop();

            //*** PRINT
            System.out.println(root.data);

            //if prev = null no data to compare it to
            if(prev != null && prev.data <= root.data) return false;
            prev = root;
            root = root.right; //if null we return
        }
        return true;
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


        System.out.println(isBST(n5));
    }

}

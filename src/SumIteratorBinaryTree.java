import java.util.LinkedList;
import java.util.Queue;

public class SumIteratorBinaryTree {

    public static int sumItr(TreeNode root) {
        if(root == null) return 0;

        Queue<TreeNode> q = new LinkedList<TreeNode>();
        int sum = 0;
        q.add(root);

        while(!q.isEmpty()) {
            TreeNode curr = q.remove();
            sum += curr.data;

            if(curr.left != null)
                q.add(curr.left);

            if(curr.right != null)
                q.add(curr.right);
        }
        return sum;
    }
}

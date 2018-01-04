import java.util.LinkedList;
import java.util.Queue;

public class FindDeepestNodeTree {

    public static TreeNode findDeepest(TreeNode root) {
        if(root == null) return null;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        TreeNode curr = null;

        while(!q.isEmpty()) {
            curr = q.remove();

            if(curr.left != null)
                q.add(curr.left);

            if(curr.right != null)
                q.add(curr.right);
        }
        return curr;
    }
}
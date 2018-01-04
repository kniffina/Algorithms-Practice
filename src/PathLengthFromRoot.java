import java.util.LinkedList;
import java.util.Queue;

public class PathLengthFromRoot {

    public static int pathFromRoot(TreeNode root, int n) {
        if(root == null) return 0;

        Queue<TreeNode> q = new LinkedList<>();
        Queue<Integer> depth = new LinkedList<>();
        q.add(root);
        depth.add(1);

        while(!q.isEmpty()) {
            TreeNode curr = q.remove();
            Integer d = depth.remove();

            if(curr.data == n)
                return d;

            else {
                if(curr.left != null) {
                    q.add(curr.left);
                    depth.add(d + 1);
                }

                if(curr.right != null) {
                    q.add(curr.right);
                    depth.add(d + 1);
                }
            }
        }

        return 0;
    }
}
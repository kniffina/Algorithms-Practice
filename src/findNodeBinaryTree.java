import java.util.LinkedList;
import java.util.Queue;

public class findNodeBinaryTree {

    public TreeNode findNode(TreeNode root, int val) {
        if(root == null)
            return null;

        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);

        TreeNode curr = null;

        while(q.isEmpty() == false) {
            curr = q.remove(); //remove first node in queue

            //we found it
            if(curr.data == val) {
                break;
            }
            //add left node to queue to be checked
            if(curr.left != null) {
                q.add(curr.left);
            }
            //add right node to queue to be checked
            if(curr.right != null) {
                q.add(curr.right);
            }
        }
        //return if the current node is val
        if(curr.data == val)
            return curr;
        else
            return null;
    }
}

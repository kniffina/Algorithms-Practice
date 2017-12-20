import java.util.ArrayList;
import java.util.Stack;

public class InorderTreeTraversalIterativeList {

    public ArrayList<Integer> inorderItr(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> s = new Stack<TreeNode>();

        while (true) {
            while (root != null) {
                s.push(root);
                root = root.left;
            }
            if(s.isEmpty()) break;
            root = s.pop();
            list.add(root.data);
            root = root.right;
        }
        return list;
    }


}

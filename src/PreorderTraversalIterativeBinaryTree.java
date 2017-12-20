import java.util.ArrayList;
import java.util.Stack;

public class PreorderTraversalIterativeBinaryTree {

    public static ArrayList<Integer> preorder(TreeNode root) {
        ArrayList<Integer> preorderedList =  new ArrayList<Integer>();
        Stack<TreeNode> s = new Stack<TreeNode>();

        if (root == null){return preorderedList;}

        s.push(root);
        while(!s.isEmpty()) {
            root = s.pop();
            preorderedList.add(root.data);
            if (root.right != null) {s.push(root.right);}
            if (root.left  != null) {s.push(root.left);}
        }
        return preorderedList;
    }
}

import java.util.ArrayList;

public class AncestorsBinaryTree {

    public ArrayList<Integer> ancestorList = new ArrayList<Integer>();

    public boolean printAncestors(TreeNode root, int data) {
        if(root == null)
            return false;
        if(root.data == data) {
            return true;
        }

        if(printAncestors(root.left, data) || printAncestors(root.right, data)) {
            ancestorList.add(data);
            return true;
        }
        return false;
    }
}

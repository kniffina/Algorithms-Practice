import java.util.ArrayList;

public class PreorderTreeNodeList {

    ArrayList<Integer>preorderList = new ArrayList<Integer>();

    public void preorder(TreeNode root) {
        if(root != null) {
            preorderList.add(root.data);

            if(root.left != null) {
                preorder(root.left);
            }

            if(root.right != null) {
                preorder(root.right);
            }
        }
    }
}

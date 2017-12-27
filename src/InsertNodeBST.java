public class InsertNodeBST {

    public static TreeNode insertNode(TreeNode root, int data) {
        if(root == null)
            return new TreeNode(data, null, null);
        else if(data < root.data)
            root.left = insertNode(root.left, data);
        else if(data > root.data)
            root.right = insertNode(root.right, data);

        return root;
    }
    public static void main(String[] args) {

    }
}

import java.util.Stack;

public class SuccessorBST {

    public static TreeNode successor(TreeNode root, TreeNode s) {
        if(root ==  null) return null;

        TreeNode left = root.left;

        return root;


    }

    //in order iterative solution. O(n) time and O(n) space
    public static TreeNode successorIter(TreeNode root, TreeNode n) {
        if(root == null) return null;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        boolean successorFound = false;

        while(root != null || !stack.isEmpty()) {
            while(root != null) {
                stack.add(root);
                root = root.left;
            }

            root = stack.pop();

            //if this is true, we found it return that node
            if(successorFound)
                return root;

            if(root.data == n.data)
                successorFound = true;

            root = root.right;
        }
        return root;
    }
    public static void main(String[] args) {
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

        n5.right = n7;
        n7.left = n6;
        n7.right = n8;
        n8.right = n9;
        //n9.right = n15;

        TreeNode val = successorIter(n5, n4);

        System.out.println(val.data);
        //System.out.println(val.data);
    }
}

import java.util.Stack;

public class FindKthLargest {

    public static TreeNode findKthLargest(TreeNode root, int k) {
        if(root == null) return null;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<TreeNode> hold = new Stack<TreeNode>();

        while(root != null || !stack.isEmpty()) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            hold.push(root);
            root = root.right;
        }
        root = hold.pop();
        for(int i = 1; i < k; i++) {
            if(root == null)
                return null;

            root = hold.pop();
        }
        return root;
    }

    public static TreeNode findBetter(TreeNode root, int k) {
        if(root == null) return null;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        int count = 0;

        while(root != null || !stack.isEmpty()) {
            while(root != null) {
                stack.push(root);
                root = root.right;
            }

            root = stack.pop();
            count++;
            if(count == k)
                return root;

            root = root.left;
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


        TreeNode n = findBetter(n5, 2);

        System.out.println(n.data);
    }
}

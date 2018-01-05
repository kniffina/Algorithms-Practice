import java.util.Stack;

public class FindKthSmallest {

    public TreeNode find(TreeNode root, int k) {
        if(root == null)
            return null;

        int leftSize = 0;

        if(root.left != null) {
            //leftSize = size(root.left);
        }
        if(leftSize + 1 == k) {
            return root;
        }
        else if(k <= leftSize) {
            return find(root.left, k);
        }
        else {
            return find(root.right, k-leftSize - 1);
        }
    }

    public static TreeNode findKthSmallestIter(TreeNode root, int k) {
        if(root == null) return null;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        int count = 0;

        //in order traversal until we hit node K
        while(!stack.isEmpty() || root != null) {
            while(root != null) {
                stack.add(root);
                root = root.left;
            }
            root = stack.pop();
            count++; //iterate since started at 0
            if(count == k) return root;
            root = root.right;
        }
        return null;
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


        TreeNode n = findKthSmallestIter(n5, 3);

        System.out.println(n.data);
    }
}

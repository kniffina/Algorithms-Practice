import java.util.*;

public class DecompressTree {

    public static TreeNode decompressTree(String str) {
        if(str == null || str.equals("") || str.equals("*")) return null;

        ArrayList<Integer> nodes = new ArrayList<Integer>();
        String[] splits = str.split(",");

        for(String s : splits) {
            Integer i = s.equals("*") ? null : Integer.parseInt(s);
            nodes.add(i);
        }

        Queue<TreeNode> q = new LinkedList<>();
        int i = 0, size = nodes.size();
        TreeNode root = new TreeNode(nodes.get(0), null, null);

        while(i < nodes.size()) {
            TreeNode t = q.remove();
            if(t == null) {
                i += 2;
            }
            else {
                Integer leftVal = i + 1 > nodes.size() ? null : nodes.get(i + 1);
                Integer rightVal = i + 2 > nodes.size() ? null : nodes.get(i + 2);
                TreeNode leftChild = leftVal == null ? null : new TreeNode(leftVal, null, null);
                TreeNode rightChild = rightVal == null ? null : new TreeNode(rightVal, null, null);
                t.left = leftChild;
                t.right = rightChild;
                q.add(leftChild);
                q.add(rightChild);
                i += 2;
            }
        }
        return root;
    }

    public static void main(String[] args) {

    }
}

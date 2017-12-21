import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Serialize2BT {

    /*
    This problem was asked by Google.

Given the root to a binary tree, implement serialize(root), which serializes the
tree into a string, and deserialize(s), which deserializes the string back into the tree.
     */

    //1. recursive solution with helpers
    public static String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        sb = serializeTreeHelper(root, sb);
        if(sb.length() > 0) {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

    public static StringBuilder serializeTreeHelper(TreeNode root, StringBuilder sb) {
        if(root == null) {
            sb.append(", null");
            return null;
        }
        else {
            sb.append("," + root.data);
            serializeTreeHelper(root.left, sb);
            serializeTreeHelper(root.right, sb);
        }
        return sb;
    }

    public static TreeNode restoreTree(String str) {
        String[] split = str.split(",");
        LinkedList<String> nodes = new LinkedList<>(Arrays.asList(split));
        return restoreTreeHelper(nodes);
    }

    public static TreeNode restoreTreeHelper(LinkedList<String> list) {
        String value = list.remove(); //remove first element from list i.e. 1
        if(value == ", null")
            return null;

        TreeNode t = new TreeNode(Integer.parseInt(value), null, null);
        t.left = restoreTreeHelper(list);
        t.right = restoreTreeHelper(list);

        return t;
    }

    //.2 Iteratively


    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1, null, null);
        TreeNode n2 = new TreeNode(2, null, null);
        TreeNode n3 = new TreeNode(3, null, null);
        TreeNode n4 = new TreeNode(4, null, null);
        TreeNode n5 = new TreeNode(5, null, null);
        TreeNode n6 = new TreeNode(6, null, null);
        TreeNode n7 = new TreeNode(7, null, null);
        TreeNode n8 = new TreeNode(8, null, null);
        TreeNode n9 = new TreeNode(9, null, null);

        n5.left = n4;
        n4.left = n2;
        n2.left = n1;
        n2.right = n3;
        n5.right = n8;
        n8.left = n6;
        n8.right = n9;
        n6.right = n7;


    }

}

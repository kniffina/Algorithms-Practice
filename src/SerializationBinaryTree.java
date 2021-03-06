import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SerializationBinaryTree {

    public String serializeTree(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeTreeHelper(root, sb);
        if(sb.length() > 0) sb.deleteCharAt(0); //first comma
        return sb.toString();
    }

    private StringBuilder serializeTreeHelper(TreeNode t, StringBuilder sb) {
        if(t == null) sb.append(", null");
        else {
            sb.append("," + t.data);
            serializeTreeHelper(t.left, sb);
            serializeTreeHelper(t.right, sb);
        }
        return sb;
    }

    private TreeNode restoreTree(String str) {
        String[] nodesSplit = str.split(",");
        LinkedList<String> nodesList = new LinkedList<>(Arrays.asList(nodesSplit));
        return restoreTreeHelper(nodesList);
    }

    public TreeNode restoreTreeHelper(LinkedList<String> nodes) {
        String nodeDataStr = nodes.remove();//remove
        if(nodeDataStr.equals("null")) return null;

        //might need to remove null values
        TreeNode t = new TreeNode(Integer.valueOf(nodeDataStr), null, null);
        t.left = restoreTreeHelper(nodes);
        t.right = restoreTreeHelper(nodes);

        return t;
    }

    /*
    public String serializeTree(TreeNode root){
        if(root == null) return "N,";
        return String.valueOf(root.data) + "," + serializeTree(root.left) + serializeTree(root.right);
    }

    public TreeNode restoreTree(String str){
        return helper(new LinkedList<String>(Arrays.asList(str.split(","))));
    }

    public TreeNode helper(List<String> list){
        String s = list.remove(0);
        if(s.equals("N")) return null;
        return new TreeNode(Integer.valueOf(s), helper(list), helper(list));
    }
    */


}

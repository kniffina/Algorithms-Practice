import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintBinaryTreeLevelByLevel {

    public static ArrayList<ArrayList<Integer>>printLevelByLevel(TreeNode root) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> level = new ArrayList<Integer>();

        if (root == null) return list;

        Queue<TreeNode> currLvl = new LinkedList<TreeNode>();
        Queue<TreeNode> nextLvl = new LinkedList<TreeNode>();
        currLvl.add(root);

        while(!currLvl.isEmpty()) {
            TreeNode curr = currLvl.remove();

            if(curr != null) {
                level.add(curr.data);
                nextLvl.add(curr.left);
                nextLvl.add(curr.right);
            }

            //nothing in currLvl anymore
            if(currLvl.isEmpty()) {
                //if level has integers in it, add to list
                if(!level.isEmpty()) {
                    list.add(level);
                }
                level = new ArrayList<Integer>();

                while(!nextLvl.isEmpty()) {
                    currLvl.add(nextLvl.remove());
                }
            }
        }

        return list;
    }


}

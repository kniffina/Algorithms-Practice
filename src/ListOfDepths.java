import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ListOfDepths {

    public static ArrayList<LinkedList<TreeNode>> listDepths(TreeNode root) {
       ArrayList<LinkedList<TreeNode>> entireList = new ArrayList<LinkedList<TreeNode>>();

       if(root == null)
           return entireList;

       LinkedList<TreeNode> level = new LinkedList<TreeNode>();
       level.add(root);

       while(level.size() > 0) {
           entireList.add(level);
           LinkedList<TreeNode> currLvl = level;
           level = new LinkedList<>();

           for(TreeNode n : currLvl) {
               if(root.left != null)
                   level.add(root.left);

               if(root.right != null)
                   level.add(root.right);
           }
       }

       return entireList;

    }

    public static void printResult(ArrayList<ArrayList<TreeNode>> result){
        int depth = 0;
        for(ArrayList<TreeNode> entry : result) {
            Iterator<TreeNode> i = entry.listIterator();
            System.out.print("Link list at depth " + depth + ":");
            while(i.hasNext()){
                System.out.print(" " + ((TreeNode)i.next()).data);
            }
            System.out.println();
            depth++;
        }
    }



    public static void main(String[] args) {

    }


}

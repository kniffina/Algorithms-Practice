import java.util.Queue;

public class DFSandBFS {

    //DEPTH FIRST SEARCH
    // - go deep into graph. Follow node paths until get them all
    // - preferred if we want to visit every edge of graph. Simpler

    /*
    public static void DFS(Node root) {
        if(root == null)
            return;
        visit(root);
        root.visited = true;
        for each(Node n in root.adjacent) {
            if(n.visited == false)
                DFS(n);
        }
    }
    */

    //BREAD FIRST SEARCH
    // - go to each of the root (or whatever nodes) children first before expanding
    // - better for shortest path problems

    /*
    public static void BFS(Node root) {
        Queue q = new Queue();
        root.marked = true;
        q.add(root);

        while(!q.isEmpty()) {
            Node r = q.remove();
            visit(r);
            foreach(Node n in r.adjacent()) {
                if(n.marked == false) {
                    n.marked = true;
                    q.add(n);
                }
            }
        }
    }

     //  *** BFS  *******
    //visits 5 -> 3 -> 7 -> 2 -> 4 -> 6 -> 8
    //      visits all children first then goes to next level
    public static void breadth(TreeNode root) {
        if (root == null)
            return;
        Queue<TreeNode> queue = new LinkedList<TreeNode>() ;

        queue.clear();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.remove();
            System.out.print(node.data + " ");
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }

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
        //n8.right = n9;
        //n9.right = n15;

        breadth(n5);
        //System.out.println(isBST(n5));
    }
    */
}

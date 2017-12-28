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
    */
}

import java.util.LinkedList;
import java.util.Queue;

public class RouteBetweenTwoNodes {
    public static void main(String a[]) {
        Graph g = createNewGraph();
        Node[] n = g.getNodes();
        Node start = n[3];
        Node end = n[5];
        System.out.println(breadFirstSearch(g, start, end));
    }

    public static Graph createNewGraph() {
        Graph g = new Graph();
        Node[] temp = new Node[6];

        temp[0] = new Node("a", 3);
        temp[1] = new Node("b", 0);
        temp[2] = new Node("c", 0);
        temp[3] = new Node("d", 1);
        temp[4] = new Node("e", 1);
        temp[5] = new Node("f", 0);

        temp[0].addAdjacent(temp[1]);
        temp[0].addAdjacent(temp[2]);
        temp[0].addAdjacent(temp[3]);
        temp[3].addAdjacent(temp[4]);
        temp[4].addAdjacent(temp[5]);
        for (int i = 0; i < 6; i++) {
            g.addNode(temp[i]);
        }
        return g;
    }

    public enum State {
        Unvisited, Visited, Visiting;
    }

    //Given a directed graph, design an algorithm to find out whether
    //there is a route between 2 nodes
    public static boolean breadFirstSearch(Graph g, Node start, Node end) {
        Queue<Node> q = new LinkedList<Node>();

        //set all nodes to unvisited
        for(Node n : g.getNodes()) {
            n.state = State.Unvisited;
        }

        //set start state to Visiting because it is first in line
        start.state = State.Visiting;
        q.add(start);

        while(!q.isEmpty()) {
            //take the node at the front of the line
            Node node = q.remove();

            //check that node is there
            if(node != null) {
                //loop through the nodes adjacency list, adding them if they are not the end Node
                for(Node u : node.getAdjacent()) {
                    //check to make sure the state is Unvisited, otherwise it will result in an infinite loop
                    if(u.state == State.Unvisited) {
                        if (u == end) {
                            return true; //found path to end node
                        } else {
                            u.state = State.Visiting;
                            q.add(u);
                        }
                    }
                }
            }
        }
        //no path found so we can return false
        return false;
    }

}

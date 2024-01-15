import java.util.ArrayList;
import java.util.List;

public class AdjacencyList {

    public static List<List<Integer>> adj = new ArrayList<>();
    public static int V;
    public static char[] nodes;

    public static void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print("Graph " + nodes[i] + " is connected to: ");
            for (int neighbor : adj.get(i)) {
                System.out.print(nodes[neighbor] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        V = 7;

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        nodes = new char[V];
        for (int i = 0; i < V; i++)
            nodes[i] = (char) ('A' + i);

        addEdge(0, 1);
        addEdge(1, 2);
        addEdge(2, 3);
        addEdge(3, 4);
        addEdge(3, 5);
        addEdge(3, 6);
        addEdge(2, 4);
        addEdge(4, 5);

        printGraph();
    }
}
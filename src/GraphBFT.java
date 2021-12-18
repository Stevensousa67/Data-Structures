import java.util.*;
//Breadth First Traversal implemented using a linked list.
class GraphBFT {
    private int Vertices;   // No. of vertices
    private LinkedList<Integer> adj_list[]; //Adjacency Lists

    // graph Constructor:number of vertices in graph are passed
    GraphBFT(int v) {
        Vertices = v;
        adj_list = new LinkedList[v];
        for (int i=0; i<v; ++i)         //create adjacency lists
            adj_list[i] = new LinkedList();
    }

    // add an edge to the graph
    void addEdge(int v,int w) {
        adj_list[v].add(w);
    }

    // BFT traversal
    void BFT(int root_node)   {
        // initially all vertices are not visited
        boolean visited[] = new boolean[Vertices];

        // BFS queue
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // current node = visited, insert into queue
        visited[root_node]=true;
        queue.add(root_node);

        while (queue.size() != 0)  {
            // deque an entry from queue and process it
            root_node = queue.poll();
            System.out.print(root_node+" ");

            // get all adjacent nodes of current node and process
            Iterator<Integer> i = adj_list[root_node].listIterator();
            while (i.hasNext()){
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}
class Main1{
    public static void main(String args[])
    {
        //create a graph with 5 vertices
        GraphBFT g = new GraphBFT(5);
        //add edges to the graph
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(2, 4);
        //print BFT sequence
        System.out.println("Breadth-first traversal of graph with 0 as starting vertex:");  //Try using another starting point
        g.BFT(0);
    }
}
public class App {
    public static void main(String[] args) {
        int [][] mat = {{7,1,0,0},
                {1,0,5,1},
                {0,0,0,1},
                {0,0,0,0}};
        Graph graph = new Graph(mat);
        System.out.println(graph.getHeads());
        System.out.println(graph.getEdges());
    }
}

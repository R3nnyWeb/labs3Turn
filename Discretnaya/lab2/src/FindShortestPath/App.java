package FindShortestPath;

public class App {
    public static void main(String[] args) {
//        int[][] matrAdj =  {{0,  5, 4,  0, 0, 0, 0},
//                            {0,  0, 0,  0, 0, 0, 0},
//                            {0,  3, 0,  6, 0, 0, 0},
//                            {0,  8, 0,  0, 0, 0, 0},
//                            {0,  0, 0,  3, 0, 0, 0},
//                            {0,  0, 4,  0, 5, 0, 0},
//                            {10, 0, 12, 0, 0, 18, 0}};

////////////////////////////////////////////////////////
        int[][] matrAdj =  {{0,  8, 0,  0, 0, 0},
                            {0,  0, 0,  1, 0, 0},
                            {12, 0, 0,  13, 0, 0},
                            {0,  0, 0,  0, 0, 0},
                            {0,  30, 19,  0, 0, 15},
                            {0,  0, 0, 16, 0, 0}};
        Graph g = new Graph();
        g.loadFromAdjacency(matrAdj, true);
        Node n = g.getShortestPath();
        System.out.println("Минимальная длина пути: " + n.getWeight());
        System.out.println(n);
    }
}
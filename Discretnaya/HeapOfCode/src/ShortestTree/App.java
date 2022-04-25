package ShortestTree;

import Graph2.EdgeManager;
import Graph2.Graph;

public class App {
    public static void main(String[] args) {
        int[][] matrAdj =  {{0,  8, 12, 0,  0,  0},
                            {8,  0, 0,  1,  4,  0},
                            {12, 0, 0,  13, 19, 0},
                            {0,  1, 13, 0,  0,  16},
                            {0,  4, 19, 0,  0,  15},
                            {0,  0, 0,  16, 15, 0}};
        Graph g = new Graph();
        g.loadFromAdjacency(matrAdj, false);
        System.out.println("Исходный граф: ");
        System.out.println(g);
        System.out.println("Результат: ");
        EdgeManager tree= g.getShortestTree();
        System.out.println(tree);
        System.out.println("Общая длина путей: " + tree.getLengthAllEdges());
    }
}
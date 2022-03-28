package lab_2;

import Graph2.Edge;
import Graph2.EdgeManager;
import Graph2.Graph;
import ShortestPath.Node;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
//        int[][] matrAdj = {{0,  12, 0,  22, 6},
//                {12, 0,  4,  17, 0},
//                {0,  4,  0,  11, 9},
//                {22, 17, 11, 0,  19},
//                {6,  0,  9,  19, 0}};
//        int[][] matrInc = {{7,  1, -1,  0,  0,  0},
//                {0, -1,  1,  5,  1,  0},
//                {0,  0,  0, -5,  0,  1},
//                {0,  0,  0,  0, -1, -1}};
//
//        Graph g = new Graph();
//        g.loadFromAdjacency(matrAdj, false);
//        System.out.println(g);
//        System.out.println();
//        g.loadFromAdjacency(matrAdj, true);
//        System.out.println(g);

//        ArrayList<Edge> e = new ArrayList<Edge>();
//        e.add(new Edge(1,2, 1));
//        e.add(new Edge(1, 3, 2));
//        e.add(new Edge(2, 3, 3));
//        EdgeManager m = new EdgeManager(e);
//        m.delByEndNode(2);
//        System.out.println(e);
//        System.out.println(m);
        Node n = new Node(1);
        System.out.println(n);
    }
}

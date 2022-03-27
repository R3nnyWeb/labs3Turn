package GraphPack;

import java.util.ArrayList;

public class Graph {
    ArrayList<DirectMatching> matchings = new ArrayList<DirectMatching>();
    int numOfEdges;

    private void clean(){
        matchings.clear();
        numOfEdges = 0;
    }

    public void loadFromIncidence(int[][] matrix){
        clean();
        for (int i = 0; i<matrix.length; ++i){
            matchings.add(new DirectMatching(i+1));
        }
        for (int i=0; i<matrix[0].length; ++i){
            int head=0, node = -1;
            for (int j=0; j<matrix.length; ++j){
                if (matrix[j][i]>0){
                    head = j;
                }
                else if (matrix[j][i]<0) {
                    node = j;
                }
            }
            if (node == -1){
                node = head;
            }
            matchings.get(head).addEdge(node+1, matrix[head][i]);
        }
    }

    public void loadFromAdjacency(int[][] matrix){
        clean();
        for (int i=0; i<matrix.length; ++i){
            matchings.add(new DirectMatching(i+1));
            for (int j=0; j<matrix[i].length; ++j){
                if (matrix[i][j]!=0){
                    matchings.get(i).addEdge(j+1, matrix[i][j]);
                    numOfEdges++;
                }
            }
        }
    }

    public int[][] getIncidenceMatrix(){
        int size = matchings.size();
        int[][] res = new int [size][numOfEdges];
        int i = 0;
        for (DirectMatching matching : matchings) {
            ArrayList<Edge> edges = matching.getEdges();
            int head = matching.getHead()-1;
            for (Edge edge : edges){
                res[edge.getNode()-1][i] = -edge.getWeight();
                res[head][i] = edge.getWeight();
                i++;
            }
        }
        return res;
    }

    public int[][] getAdjacencyMatrix(){
        int size = matchings.size();
        int[][] res = new int [size][size];
        for (DirectMatching matching : matchings){
            ArrayList<Edge> edges= matching.getEdges();
            int head = matching.getHead()-1;
            for (Edge edge : edges){
                res[head][edge.getNode()-1] = edge.getWeight();
            }
        }
        return res;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        for (DirectMatching matching : matchings) {
            res.append(matching).append("\n");
        }
        return res.toString();
    }
}

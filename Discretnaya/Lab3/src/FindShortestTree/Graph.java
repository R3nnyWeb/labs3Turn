package FindShortestTree;

import java.util.HashSet;

public class Graph {
    private EdgeManager graph = new EdgeManager();
    private int numOfEdges, numOfNodes;
    private boolean isOriented;

    private void createGraph(int numOfNodes, int numOfEdges, boolean isOriented){
        graph = new EdgeManager();
        this.numOfNodes = numOfNodes;
        this.numOfEdges = numOfEdges;
        this.isOriented = isOriented;
    }

    public void loadFromIncidence(int[][] matrix, boolean isOriented){
        createGraph(matrix.length, matrix[0].length, isOriented);
        for(int i = 0; i<numOfEdges; ++i){
            int startNode = 0, endNode = 0;
            for(int j = 0; j<numOfNodes; ++j){
                int currentNode = matrix[j][i];
                if (currentNode != 0){
                    if (currentNode > 0 ){
                        if (startNode == 0){
                            startNode = j + 1;
                        }
                        else endNode = j + 1;
                    }
                    else {
                        endNode = j + 1;
                    }
                }
            }
            if (endNode == 0){
                endNode = startNode;
            }
            graph.addEdge(startNode, endNode, matrix[startNode-1][i]);
        }
    }

    public void loadFromAdjacency(int[][] matrix, boolean isOriented){
        createGraph(matrix.length, 0, isOriented);
        for(int i = 0; i<matrix.length; ++i){
            int a = isOriented ? 0 : i;
            for(int j = a; j<matrix[i].length; ++j){
                if (matrix[i][j] != 0) {
                    graph.addEdge(i+1, j+1, matrix[i][j]);
                    numOfEdges++;
                }
            }
        }
    }

    public EdgeManager getShortestTree(){
        EdgeManager initial = new EdgeManager(graph);
        EdgeManager result = new EdgeManager();
        HashSet<Integer> nodes = new HashSet<>();
        nodes.add(1);
        while(nodes.size() < numOfNodes){
            EdgeManager tmp = new EdgeManager();
            for(int i : nodes){
                tmp.addAll(initial.getByNode(i));
            }
            Edge shortEdge = tmp.getShortestEdge();
            nodes.add(shortEdge.getStartNode());
            nodes.add(shortEdge.getEndNode());
            initial.delMarkedEdge(nodes);
            result.addEdge(shortEdge);
        }
        return result;
    }

    @Override
    public String toString() {
        return graph.toString();
    }
}
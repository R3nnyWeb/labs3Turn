package FindShortestPath;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class EdgeManager{
    private ArrayList<Edge> edges;

    public EdgeManager(){
        edges = new ArrayList<>();
    }

    public void addEdge(int startNode, int endNode, int length){
        edges.add(new Edge(startNode, endNode, length));
    }

    public ArrayList<Edge> getByStartNode(int startNode){
        return new ArrayList<Edge>(edges.stream()
                .filter(edge -> edge.getStartNode() == startNode)
                .toList());
    }

    public ArrayList<Edge> getByEndNode(int endNode){
        return new ArrayList<Edge>(edges.stream()
                .filter(edge -> edge.getEndNode() == endNode)
                .toList());
    }

    @Override
    public String toString() {
        return edges.stream()
                .map(Edge::toString)
                .collect(Collectors.joining("\n"));
    }
}

package FindShortestTree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.stream.Collectors;

public class EdgeManager{
    private ArrayList<Edge> edges;

    public EdgeManager(){
        edges = new ArrayList<>();
    }

    public EdgeManager(EdgeManager copyFrom){
        edges = new ArrayList<>(copyFrom.edges);
    }

    public void addEdge(int startNode, int endNode, int length){
        edges.add(new Edge(startNode, endNode, length));
    }

    public void addEdge(Edge edge){
        edges.add(edge);
    }

    public void addAll(ArrayList<Edge> edges){
        this.edges.addAll(edges);
    }

    public Edge getShortestEdge(){
        return edges.stream().min(Comparator.comparing(Edge::getLength)).get();
    }

    public int getLengthAllEdges(){
        return edges.stream().mapToInt(Edge::getLength).sum();
    }

    public ArrayList<Edge> getByNode(int node){
        return new ArrayList<Edge>(edges.stream()
                .filter(edge -> edge.getStartNode() == node
                        || edge.getEndNode() == node)
                .toList());
    }

    public void delMarkedEdge(HashSet<Integer> markNodes){
        edges.removeIf(edge -> markNodes.contains(edge.getStartNode()) &&
                markNodes.contains(edge.getEndNode()));
    }

    @Override
    public String toString() {
        return edges.stream()
                .map(Edge::toString)
                .collect(Collectors.joining("\n"));
    }
}
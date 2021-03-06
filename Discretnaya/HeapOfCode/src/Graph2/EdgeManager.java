package Graph2;

import ShortestPath.Node;

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

    public EdgeManager(ArrayList<Edge> linqTo){
        edges = linqTo;
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

    public ArrayList<Edge> getAllEdges(){
        return new ArrayList<>(edges);
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

    public ArrayList<Edge> getByNode(int node){
        return new ArrayList<Edge>(edges.stream()
                .filter(edge -> edge.getStartNode() == node
                             || edge.getEndNode() == node)
                .toList());
    }

    public void delEdge(Edge edge){
        edges.remove(edge);
    }

    public void delMarkedEdge(HashSet<Integer> markNodes){
        edges.removeIf(edge -> markNodes.contains(edge.getStartNode()) &&
                markNodes.contains(edge.getEndNode()));
    }

    public void delByStartNode(int startNode){
        edges.removeIf(edge -> edge.getStartNode() == startNode);
    }

    public void delByEndNode(int endNode){
        edges.removeIf(edge -> edge.getEndNode() == endNode);
    }

    public void swapNodes(int node1 ,int node2){
        edges.forEach(edge -> {
            if(edge.getStartNode() == node1){
                edge.setStartNode(node2);
            }
            else if(edge.getStartNode() == node2){
                edge.setStartNode(node1);
            }
            if(edge.getEndNode() == node1){
                edge.setEndNode(node2);
            }
            else if(edge.getEndNode() == node2){
                edge.setEndNode(node1);
            }
        });
    }

    @Override
    public String toString() {
        return edges.stream()
                .map(Edge::toString)
                .collect(Collectors.joining("\n"));
    }
}
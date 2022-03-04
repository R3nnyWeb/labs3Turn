package GraphPack;

import java.util.ArrayList;

public class DirectMatching {
    private int head;
    private ArrayList<Edge> edges;

    DirectMatching(int head){
        this.head = head;
        edges = new ArrayList<Edge>();
    }

    public void addEdge(int node, int weight){
        edges.add(new Edge(node, weight));
    }

    public int getHead() {
        return head;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public void setHead(int head) {
        this.head = head;
    }

    @Override
    public String toString(){
        return "Г(X"+head+")="+edges;
    }
}

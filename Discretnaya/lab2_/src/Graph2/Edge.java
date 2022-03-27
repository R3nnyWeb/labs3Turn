package Graph2;

public class Edge {
    private int startNode, endNode;
    private final int length;

    public Edge(int startNode, int endNode, int length) {
        this.startNode = startNode;
        this.endNode = endNode;
        this.length = length;
    }

    public int getStartNode() {
        return startNode;
    }

    public void setStartNode(int startNode) {
        this.startNode = startNode;
    }

    public int getEndNode() {
        return endNode;
    }

    public void setEndNode(int endNode) {
        this.endNode = endNode;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "X"+startNode+" –("+length+")–> X"+endNode;
    }
}
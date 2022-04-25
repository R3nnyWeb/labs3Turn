package FindShortestTree;

public class Edge {
    private final int startNode, endNode;
    private final int length;

    public Edge(int startNode, int endNode, int length) {
        this.startNode = startNode;
        this.endNode = endNode;
        this.length = length;
    }

    public int getStartNode() {
        return startNode;
    }

    public int getEndNode() {
        return endNode;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "X"+startNode+" –("+length+")– X"+endNode;
    }
}
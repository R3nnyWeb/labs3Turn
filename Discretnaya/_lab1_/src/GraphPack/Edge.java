package GraphPack;

public class Edge {
    private final int node;
    private final int weight;

    public Edge(int node, int weight) {
        this.node = node;
        this.weight = weight;
    }

    public int getNode() {
        return node;
    }

    public int getWeight() {
        return weight;
    }
    @Override
    public String toString(){
        return "X"+node;
    }
}

public class Edge {
    private final TopGraph startHead;
    private final TopGraph endHead;
    private final int weight;

    public Edge(TopGraph startHead, TopGraph endHead, int weight) {
        this.startHead = startHead;
        this.endHead = endHead;
        this.weight = weight;
    }

    public TopGraph getStartHead() {
        return startHead;
    }

    public TopGraph getEndHead() {
        return endHead;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "startHead=" + startHead +
                ", endHead=" + endHead +
                ", weight=" + weight +
                "} \n";
    }
}

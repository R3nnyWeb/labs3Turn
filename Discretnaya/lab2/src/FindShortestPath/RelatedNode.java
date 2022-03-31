package FindShortestPath;

import java.util.ArrayList;

public class RelatedNode {
    private final Node linq;
    private final int length;

    public RelatedNode(Node linq, int length) {
        this.linq = linq;
        this.length = length;
    }

    public void callDestroy(ArrayList<String> paths, int index, int weight){
        linq.destroy(paths, index, length, weight);
    }
}
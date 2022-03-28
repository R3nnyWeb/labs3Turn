package ShortestPath;

import java.util.ArrayList;

public class RelatedNode {
    private final Node linq;
    private final int length;

    public RelatedNode(Node linq, int length) {
        this.linq = linq;
        this.length = length;
    }

    public void callDestroy(ArrayList<String> paths){
        linq.destroy(paths, linq.getIndexNode(), length, linq.getWeight());
    }

    public Node getLinq() {
        return linq;
    }

    public int getLength() {
        return length;
    }
}

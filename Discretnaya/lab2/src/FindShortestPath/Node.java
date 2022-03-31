package FindShortestPath;

import java.util.ArrayList;
import java.util.ListIterator;

public class Node {
    private ArrayList<RelatedNode> reverseMatching;
    private ArrayList<Integer> directedMatching;

    private int weight = Integer.MAX_VALUE;
    private final int indexNode;
    ArrayList<String> paths;

    public Node(int indexNode){
        this.indexNode = indexNode;
        paths = new ArrayList<>();
        reverseMatching = new ArrayList<>();
        directedMatching = new ArrayList<>();
    }

    public void destroy(ArrayList<String> lastPaths, int index, int length, int weightLast){
        if(length != -1){
            directedMatching.remove((Integer) index);
            if(length + weightLast <= weight){
                if(length + weightLast == weight){
                    addToPath(lastPaths, length);
                    paths.addAll(lastPaths);
                }
                else{
                    paths = new ArrayList<>(lastPaths);
                    weight = length + weightLast;
                    addToPath(paths, length);
                }
            }
            if(directedMatching.size() == 0){
                destroyNodes();
            }
        }
        else{
            paths.add("X"+indexNode);
            destroyNodes();
        }
    }

    private void destroyNodes(){
        reverseMatching.forEach(node -> node.callDestroy(paths, indexNode, weight));
    }

    private void addToPath(ArrayList<String> p, int length){
        for(final ListIterator<String> i = p.listIterator(); i.hasNext();){
            final String path = i.next();
            i.set("X"+indexNode+"–("+length+")–>" + path);
        }
    }

    public void addReverseMatching(Node node, int length){
        reverseMatching.add(new RelatedNode(node, length));
    }

    public void addDirectedMatching(int index){
        directedMatching.add(index);
    }

    public int getIndexNode() {
        return indexNode;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.join("\n", paths);
    }
}
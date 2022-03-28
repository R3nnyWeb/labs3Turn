package ShortestPath;

import java.util.ArrayList;

public class Node {
    private ArrayList<RelatedNode> reverseMatching;
    private ArrayList<Integer> directedMatching;

    private int weight = Integer.MAX_VALUE;
    private final int indexNode;
    ArrayList<String> paths;

    public Node(int indexNode){
        this.indexNode = indexNode;
        paths = new ArrayList<>();
    }

    public void destroy(ArrayList<String> lastPaths, int index, int length, int weightLast){
        if(length != -1){
            directedMatching.remove((Integer) index);
            if(length + weightLast <= weight){
                if(length + weightLast == weight){
                    paths.addAll(lastPaths);
                }
                else{
                    paths = lastPaths;
                    weight = length + weightLast;
                }
                lastPaths.forEach(path -> path = "X"+indexNode+"–("+length+")–>" + path);
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
        reverseMatching.forEach(node -> node.callDestroy(paths));
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

    @Override
    public String toString() {
        return String.join("\n", paths);
    }
}
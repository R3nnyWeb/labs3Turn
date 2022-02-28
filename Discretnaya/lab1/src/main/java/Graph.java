import java.util.*;

public class Graph {
    private final Set<TopGraph> graphTops; //Множество вершин графа
    private Map<TopGraph, ArrayList<TopGraph>> directMatch; //Прямое соответсвие
    private byte[][] adjacencyMatrix;  //Матрица смежности

     Graph(byte[][] adjacencyMatrix,int numberOfTops ){
         graphTops = new LinkedHashSet<>();
         initGraphTops(numberOfTops);
         this.adjacencyMatrix = adjacencyMatrix;
         directMatch = directMatchFromAdjacencyMatrix();
     }

     private void initGraphTops(int numberOfTops){
         for (int i = 0; i <numberOfTops ; i++) {
             graphTops.add(new TopGraph(i));
         }
     }

    public int getNumberOfTops() {
        return graphTops.size();
    }

    private Map<TopGraph, ArrayList<TopGraph>> directMatchFromAdjacencyMatrix(){
         directMatch = new LinkedHashMap<>();

        for (int i = 0; i <getNumberOfTops() ; i++) {
            ArrayList<TopGraph> directMatchTops = new ArrayList();
            for (int j = 0; j <getNumberOfTops() ; j++) {
                if (adjacencyMatrix[i][j] == 1){

                    directMatchTops.add(new TopGraph(j));
                }
            }
            directMatch.put(new TopGraph(i), directMatchTops);
        }
         return directMatch;
    };


     public Map<TopGraph, ArrayList<TopGraph>> getDirectMatch(){
       return directMatch;
     };

    @Override
    public String toString() {
        return "Graph{" +
                "graphTops=" + graphTops.toString() +
                '}';
    }
}

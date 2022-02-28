import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Map;

public class Graph {
    private final Set<TopGraph> graphTops; //Множество вершин графа
    private Map<TopGraph, LinkedHashSet<TopGraph>> directMatch; //Прямое соответсвие
    private byte[][] adjacencyMatrix;  //Матрица смежности

     Graph(byte[][] adjacencyMatrix,int numberOfTops ){
         graphTops = new LinkedHashSet<>();
         initGraphTops(numberOfTops);
         this.adjacencyMatrix = adjacencyMatrix;

     }

     private void initGraphTops(int numberOfTops){
         for (int i = 0; i <numberOfTops ; i++) {
             graphTops.add(new TopGraph(i));
         }
     }

    public int getNumberOfTops() {
        return graphTops.size();
    }

    @Override
    public String toString() {
        return "Graph{" +
                "graphTops=" + graphTops.toString() +
                '}';
    }
}

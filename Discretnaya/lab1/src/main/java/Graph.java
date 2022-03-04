import java.util.ArrayList;

public class Graph {
  private   ArrayList<TopGraph> heads;
  private ArrayList<Edge> edges;
  private int[][] adjacencyMatrix;
  private ArrayList<Match> directMatch;
  Graph(int[][] adjacencyMatrix){
      this.adjacencyMatrix = adjacencyMatrix;
      initHeads();
      initEdges();
      initDirectMatch();
  }

  private void initEdges(){
      edges = new ArrayList<>();
      for (int i = 0; i <heads.size() ; i++) {
          for (int j = 0; j < heads.size() ; j++) {
              if (adjacencyMatrix[i][j] != 0){
                  edges.add(new Edge(heads.get(i), heads.get(j), adjacencyMatrix[i][j]));
              }
          }
      }
  }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    private  void initDirectMatch(){
      directMatch = new ArrayList<>();
      ArrayList<TopGraph> currentDirectMatch = new ArrayList<>();
      

        for (int i = 1; i <edges.size() ; i++) {

          Edge currentEdge = edges.get(i);





      }
  }

  private void  initHeads(){
      heads = new ArrayList<>();
      for (int i = 0; i <adjacencyMatrix.length ; i++) {
        heads.add(new TopGraph(i));
      }
  }

  public ArrayList<TopGraph> getHeads(){
      return heads;
  }

}

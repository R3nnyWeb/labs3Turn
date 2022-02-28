import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {



    @Test
    void getNumberOfTopsTest() {
        int exceptedNumberOfTops = 7;
        byte[][] arr = new byte[exceptedNumberOfTops][exceptedNumberOfTops];
        Graph graph = new Graph(arr,exceptedNumberOfTops);
        assertEquals(exceptedNumberOfTops,graph.getNumberOfTops());
    }

    @Test
    void getDirectMatchTest(){
        int exceptedNumberOfTops = 7;
        Map<TopGraph, ArrayList<TopGraph>> exceptedDirectMatch;
        exceptedDirectMatch = new LinkedHashMap<>(){
            {
                put(new TopGraph(0), new ArrayList<>(){
                    {
                      add(new TopGraph(0));
                      add(new TopGraph(4));
                      add(new TopGraph(6));
                    }
                });
                put(new TopGraph(1), new ArrayList<>(){
                    {
                        add(new TopGraph(0));
                        add(new TopGraph(2));
                        add(new TopGraph(4));
                    }
                });
                put(new TopGraph(2), new ArrayList<>(){
                    {
                        add(new TopGraph(3));
                    }
                });
                put(new TopGraph(3), new ArrayList<>(){
                    {
                        add(new TopGraph(2));
                        add(new TopGraph(5));
                    }
                });
                put(new TopGraph(4), new ArrayList<>(){
                    {
                        add(new TopGraph(0));
                        add(new TopGraph(5));
                    }
                });
                put(new TopGraph(5), new ArrayList<>(){
                    {
                        add(new TopGraph(2));
                        add(new TopGraph(3));
                        add(new TopGraph(6));
                    }
                });
                put(new TopGraph(6), new ArrayList<>(){
                    {
                        add(new TopGraph(6));
                    }
                });
            }
        };

        byte[][] adjacencyMatrix = {{1,0,0,0,1,0,1},
                                    {1,0,1,0,1,0,0},
                                    {0,0,0,1,0,0,0},
                                    {0,0,1,0,0,1,0},
                                    {1,0,0,0,0,1,0},
                                    {0,0,1,1,0,0,1},
                                    {0,0,0,0,0,0,1}};
        Graph graph = new Graph(adjacencyMatrix,exceptedNumberOfTops);
        Map<TopGraph, ArrayList<TopGraph>> actualDirectMatch = graph.getDirectMatch();
        boolean result = true;
        Set<TopGraph> exceptedGraphSet = exceptedDirectMatch.keySet();
        Set<TopGraph> actualGraphSet = actualDirectMatch.keySet();
            

        assert(result);



    }
}
import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {



    @Test
    void getNumberOfTops() {
        int exceptedNumberOfTops = 7;
        byte[][] arr = new byte[exceptedNumberOfTops][exceptedNumberOfTops];
        Graph graph = new Graph(arr,exceptedNumberOfTops);
        assertEquals(exceptedNumberOfTops,graph.getNumberOfTops());
    }

    @Test
    void getDirectMatch(){
        int exceptedNumberOfTops = 7;
        Map<TopGraph, LinkedHashSet<TopGraph>> exceptedDirectMatch;
        byte[][] adjacencyMatrix = {{1,0,0,0,1,0,1},
                                    {1,0,1,0,1,0,0},
                                    {0,0,0,1,0,0,0},
                                    {0,0,1,0,0,1,0},
                                    {1,0,0,0,0,1,0},
                                    {0,0,1,1,0,0,1},
                                    {0,0,0,0,0,0,0}};

    }
}
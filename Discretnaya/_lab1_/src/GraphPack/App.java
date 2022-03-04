package GraphPack;

public class App {
    public static void printMatrix(int[][] matrix){
        for (int[] i : matrix){
            for (int j : i){
                System.out.printf("%3d",j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrAdj = {{0,  12, 0,  22, 6},
                           {12, 0,  4,  17, 0},
                           {0,  4,  0,  11, 9},
                           {22, 17, 11, 0,  19},
                           {6,  0,  9,  19, 0}};
        int[][] matrInc = {{7,  1, -1,  0,  0,  0},
                           {0, -1,  1,  5,  1,  0},
                           {0,  0,  0, -5,  0,  1},
                           {0,  0,  0,  0, -1, -1}};

        System.out.println("Текущая матрица смежности");
        printMatrix(matrAdj);
        System.out.println();

        Graph graph = new Graph();
        graph.loadFromAdjacency(matrAdj);
        System.out.println("Представление графа:");
        System.out.println(graph);

        System.out.println("Создание матрицы инцидентности");
        int[][] outInc = graph.getIncidenceMatrix();
        printMatrix(outInc);
        System.out.println();

        System.out.println("Создание матрицы смежности:");
        int[][] outAdj = graph.getAdjacencyMatrix();
        printMatrix(outAdj);
        System.out.println();
    }
}



//        System.out.println("Текущая матрица инцидентности");
//        printMatrix(matrInc);
//        System.out.println();
//
//        graph.loadFromIncidence(matrInc);
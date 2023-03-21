package matrices;

import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        int[][] array = {
                {1,1,0},
                {0,1,1},
                {0,1,1}
        };

        AbstractMatrix matrix = new StandardMatrix(array);
        System.out.println(matrix);
        MatrixAdapter matrixAsGraph = new MatrixAdapter(matrix);
        matrixAsGraph.setSource(new Index(0,0));

        DfsVisit<Index> algorithm = new DfsVisit<>();
        Set<Index> connectedComponent = algorithm.traverse(matrixAsGraph);
        System.out.println(connectedComponent);

        matrix = new CrossMatrix(array);
        matrixAsGraph = new MatrixAdapter(matrix);

        DfsVisit<Index> algorithm2 = new DfsVisit<>();
        Set<Index> connectedComponent2 = algorithm2.traverse(matrixAsGraph);
        System.out.println(connectedComponent2);

    }
}

package matrices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Index index1 = new Index(1,1);
        Index index2 = new Index(0,0);
        AbstractMatrix matrix1 = new StandardMatrix(5,5);
        System.out.println(matrix1);
        System.out.println(matrix1.getNeighbors(index1));

        System.out.println("*********");
        AbstractMatrix matrix2 = new CrossMatrix(5,5);
        System.out.println(matrix2);
        System.out.println(matrix2.getNeighbors(index2));

        List<AbstractMatrix> matrices = new ArrayList<>();
        matrices.add(matrix1);
        matrices.add(matrix2);
        for(AbstractMatrix matrix:matrices){
            System.out.println(matrix.getNeighbors(index2));
        }

    }
}

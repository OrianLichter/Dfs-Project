package matrices;

import java.util.*;

public class CrossMatrix extends AbstractMatrix{

    public CrossMatrix(int numOfRows, int numOfColumns) {
        super(numOfRows, numOfColumns);
    }

    public CrossMatrix(int[][] anArray) {
        super(anArray);
    }

    @Override
    public Collection<Index> getNeighbors(Index index) {
        List<Index> neighbors = new ArrayList<>();
        int currentValue; // Variable to check if the value exits or not
        try {
            currentValue = intArray[index.getRow() - 1][index.getColumn()-1];
            neighbors.add(new Index(index.getRow()-1,index.getColumn()-1));
        }catch (IndexOutOfBoundsException iobe){}
        try {
            currentValue = intArray[index.getRow() + 1][index.getColumn()+1];
            neighbors.add(new Index(index.getRow()+1,index.getColumn()+1));
        }catch (IndexOutOfBoundsException iobe){}
        try {
            currentValue = intArray[index.getRow()-1][index.getColumn()+1];
            neighbors.add(new Index(index.getRow()-1,index.getColumn()+1));
        }catch (IndexOutOfBoundsException iobe){}
        try {
            currentValue = intArray[index.getRow()+1][index.getColumn()-1];
            neighbors.add(new Index(index.getRow()+1,index.getColumn()-1));
        }catch (IndexOutOfBoundsException iobe){}

        return neighbors;
    }
}

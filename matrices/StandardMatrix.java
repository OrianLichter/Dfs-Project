package matrices;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class StandardMatrix extends AbstractMatrix{


    public StandardMatrix(int numOfRows, int numOfColumns) {
        super(numOfRows, numOfColumns);
    }

    public StandardMatrix(int[][] anArray) {
        super(anArray);
    }

    public StandardMatrix(int number){
        // Call the constructor=> StandardMatrix(int numOfRows, int numOfColumns)
        this(number,number);
    }

    /*
    1 0 1
    0 1 0
    1 1 1
     */

    @Override
    public Collection<Index> getNeighbors(Index index) {
        // LinkedHashSet<>() = Using for to remember the order of entry.
        Set<Index> neighbors = new LinkedHashSet<>();
        int currentValue; // Variable to check if the value exits or not
        try {
            currentValue = intArray[index.getRow() - 1][index.getColumn()];
            neighbors.add(new Index(index.getRow()-1,index.getColumn()));
        }catch (IndexOutOfBoundsException iobe){}
        try {
            currentValue = intArray[index.getRow() + 1][index.getColumn()];
            neighbors.add(new Index(index.getRow()+1,index.getColumn()));
        }catch (IndexOutOfBoundsException iobe){}
        try {
            currentValue = intArray[index.getRow()][index.getColumn()-1];
            neighbors.add(new Index(index.getRow(),index.getColumn()-1));
        }catch (IndexOutOfBoundsException iobe){}
        try {
            currentValue = intArray[index.getRow()][index.getColumn()+1];
            neighbors.add(new Index(index.getRow(),index.getColumn()+1));
        }catch (IndexOutOfBoundsException iobe){}

        return neighbors;
    }

    public void DoNothing(){}
}

package matrices;

import java.util.*;

public abstract class AbstractMatrix implements Matrix {
    int[][] intArray;

    /*
    1 1 0
    0 1 1
    0 1 1
    */


    /**
     * Populates the 2D array with 0's and 1's
     * @param numOfRows
     * @param numOfColumns
     */
    public AbstractMatrix(int numOfRows, int numOfColumns){
        System.out.println("Calling class= " + getClass().getName());
        intArray = new int[numOfRows][numOfColumns];
        Random generator = new Random();
        for (int row = 0; row < numOfRows ; row++) {
            for (int column = 0; column < numOfColumns ; column++) {
                intArray[row][column] = generator.nextInt(2);
            }
        }
    }

    public AbstractMatrix(int[][] anArray){
        System.out.println("Calling class= " + getClass().getName());
        List<int[]> rowList = new ArrayList<>();
        // To copy the array[][] 2D
        for (int[] row:anArray) {
            //copy row by row
            int[] clone = row.clone();
            rowList.add(clone);
        }
        // Covert the List to Array[][]
        intArray = rowList.toArray(new int[0][]);

    }

    @Override
    public int getValue(Index index) {
        return intArray[index.getRow()][index.getColumn()];
    }

    @Override
    public String toString() {
        // StringBuilder = Dynamic array of string's
        StringBuilder matrixBuilder = new StringBuilder();
        for (int[] row:intArray) {
            matrixBuilder.append(Arrays.toString(row));
            matrixBuilder.append("\n");
        }
        return matrixBuilder.toString();
    }

    public abstract Collection<Index> getNeighbors(Index index);
}

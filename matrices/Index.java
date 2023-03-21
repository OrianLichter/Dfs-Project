package matrices;

import java.util.Objects;

/*
  Location based on row and column in a Matrix object
 */
public class Index {
    private int row,column;

    public Index(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Index)) return false;
        Index index = (Index) o;
        return getRow() == index.getRow() && getColumn() == index.getColumn();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRow(), getColumn());
    }

    @Override
    public String toString() {
        return "(" +
                 row +
                "," + column + ")";

    }

    public static void main(String[] args) {
        Index index1 = new Index(1,1);
        Index index2 = new Index(1,1);
        System.out.println(index1.equals(index2));
        System.out.println(index1);

    }
}

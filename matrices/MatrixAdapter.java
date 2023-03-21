package matrices;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * This class uses the Adapter pattern, a.k.k Decorator/Wrapper
 * adapts a Matrix to the functionality of the Graph interface
 */

public class MatrixAdapter implements Graph<Index> {
    private AbstractMatrix matrix;
    private Index source;

    public MatrixAdapter(@NotNull AbstractMatrix matrix){
        this.matrix = matrix;
        this.source = new Index(0,0);
    }

    public AbstractMatrix getMatrix() {
        return matrix;
    }

    public void setMatrix(AbstractMatrix matrix) {
        this.matrix = matrix;
    }

    public void setSource(@NotNull Index source) {
        if((source.getRow()>=0 && source.getRow() < matrix.intArray.length )&&
                (source.getColumn() >= 0 && source.getColumn()<matrix.intArray[0].length)){
            this.source = source;
        }

    }

    public Index getSource() {
        return source;
    }



    @Override
    public Node<Index> getRoot() {
        return new Node<>(source);
    }

    /*
    1  1  0
    0  1  1
    0  1  1
     */

    @Override
    public Collection<Node<Index>> getReachableNodes(Node<Index> node) {
        if(matrix.getValue(node.getData())==1){
            List<Node<Index>> reachableNodes  = new ArrayList<>();
            for(Index neighbor:matrix.getNeighbors(node.getData())){
                if(matrix.getValue(neighbor) == 1){
                    Node<Index> reachableNode = new Node<>(neighbor,node);
                    reachableNodes.add(reachableNode);
                }
            }
            return reachableNodes;
        }
        return null;
    }
}

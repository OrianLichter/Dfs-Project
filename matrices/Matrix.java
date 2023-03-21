package matrices;

import java.util.Collection;

/**
* @author Orian
 * This interface represents the common functionality required of all matrices
*/


public interface Matrix {
    int getValue(Index index);
    Collection<Index> getNeighbors(Index index);

}

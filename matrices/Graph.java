package matrices;

import java.util.Collection;

/**
 * This interface defines thr common functionality required
 * of a Graph-like object
 */

public interface Graph<T> {
    Node<T> getRoot();
    /*
    Collections in Java:
    1. Lists
    2. Set
    3. Vector
    4. Queues
     */
    Collection<Node<T>> getReachableNodes(Node<T> node);
}

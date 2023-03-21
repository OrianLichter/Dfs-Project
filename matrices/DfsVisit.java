package matrices;

import java.util.*;

public class DfsVisit<T> {
    private Stack<Node<T>> workingStuck;
    private Set<Node<T>> finished;

    public DfsVisit(){
        workingStuck = new Stack<>();
        finished = new LinkedHashSet<>();
    }

    public Set<T> traverse(Graph<T> graph){
        workingStuck.push(graph.getRoot());
        while (!workingStuck.empty()){
            Node<T> removed = workingStuck.pop();
            finished.add(removed);
            Collection<Node<T>> reachableNodes = graph.getReachableNodes(removed);
            for(Node<T> reachableNode :reachableNodes){
                if(!finished.contains(reachableNode) && !workingStuck.contains(reachableNode))
                    workingStuck.push(reachableNode);
            }
        }
//        LinkedHashSet - HashSet that also maintains a linked list,
//        enable insertion order
        Set<T> blackSet = new LinkedHashSet<>();
        for(Node<T> node: finished){
            blackSet.add(node.getData());
        }
        finished.clear();
        return blackSet;
    }




}

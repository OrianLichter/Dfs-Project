package matrices;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Node<T>{
    private T data;
    private Node<T> parent;

    public Node(T data, Node<T> parent) {
        this.data = data;
        this.parent = parent;
    }

    public Node(T data){
        this(data,null);
    }

    public Node(){

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;
        Node<?> node = (Node<?>) o;
        return getData().equals(node.getData());
    }

    /*
    Hash Function
    take each data member as its binary representation
    perform linear transformation using a primary number
    aX+b
    Horner's method
     */
    @Override
    public int hashCode() {
        return data!=null ? data.hashCode() : 0;
    }

    public T getData() {
        return data;
    }

    public void setData(@NotNull T data) {
        this.data = data;
    }

    public Node<T> getParent() {
        return parent;
    }

    public void setParent(Node<T> parent) {
        this.parent = parent;
    }




}

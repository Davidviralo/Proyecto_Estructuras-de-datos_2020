package Estructuras_de_datos;

public class SingleNode<T> {

    private T data;
    private SingleNode<T> next;

    public SingleNode() {
        this(null);
    }

    public SingleNode(T data) {
        this.data = data;
        next = null;
    }

    public T getData() {
        return data;
    }

    public SingleNode<T> getNext() {
        return next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(SingleNode<T> next) {
        this.next = next;
    }
}
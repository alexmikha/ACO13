package main.java.week4.linked_list;

/**
 * Created by mykhailov on 18.06.16.
 */
public class Node {
    private Node next;
    private Node previous;
    private Object value;


    public Node(){

    }

    public Node(Object value) {
        this.value = value;
    }

    public Node(Node next, Node previous, Object value) {
        this.next = next;
        this.previous = previous;
        this.value = value;
    }
    public Node(Node previous, Object value) {
        this.previous = previous;
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}

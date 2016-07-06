package main.java.homeWork.myLinkedList;

/**
 * Created by mykhailov on 06.06.2016.
 */
public class Node {
    Node next;
     Node prev;
     Object vallue;

    public Node(Object value) {
        this.next = prev;
        this.prev = next;
    }

    public Node(Node tail, Object value) {
        //tail = tail;
        this.vallue = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Object getVallue() {
        return vallue;
    }

    public void setVallue(Object vallue) {
        this.vallue = vallue;
    }

    @Override
    public String toString() {
        return "Node{" +
                "next=" + next +
                ", prev=" + prev +
                '}';
    }
}




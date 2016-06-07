package homeWork.myLinkedList;

/**
 * Created by mykhailov on 06.06.2016.
 */
public class Node {
    Node next;
    private Node prev;

    public Node(Object o) {
        this.next = null;
        this.prev = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "next=" + next +
                ", prev=" + prev +
                '}';
    }
}




package week4.linked_list;

import java.util.*;


/**
 * Created by gorobec on 18.06.16.
 */
public class MyLinkedList<T> implements List<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public MyLinkedList() {
    }

    public MyLinkedList(Node<T> head, Node<T> tail, int size) {
        this.head = head;
        this.tail = tail;
        this.size = size;

    }

    private void assertIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index input!!");
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        Node<T> iter = head;
        while (iter != null && !o.equals(iter.value))
            iter = iter.next;
        return (iter != null);
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }


    @Override
    public T[] toArray() {
        T[] result = (T[]) new Object[size];
        int i = 0;
        for (Node<T> iter = head; iter != null; iter = iter.next)
            result[i++] = iter.value;
        return result;
    }

    @Override
    public boolean add(Object o) {
        if (head == null) {
            head = tail = new Node(o);
            size++;
            return true;
        }

        Node newNode = new Node(tail, o);
        tail.next = newNode;
        tail = newNode;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (o == null) return false;

        Node<T> iter = head;
        while (iter != null && !o.equals(iter.value))
            iter = iter.next;
        if (iter == null)
            return false;
        size--;
        if (iter == head) {
            head = head.next;
            if (head == null)
                tail = null;
            else head.previous = null;
        } else if (iter == tail) {
            tail = tail.previous;
            tail.next = null;
        } else {
            iter.previous.next = iter.next;
            iter.next.previous = iter.previous;
        }
        return true;
    }


    @Override
    public boolean addAll(Collection c) {
        boolean change = false;
        MyIterator it = (MyIterator) c.iterator();
        while (it.hasNext())
            if (add(it.next()))
                change = true;
        return change;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        // if (index < 0 || index > size) return false;
        assertIndex(index);
        T[] a = (T[]) c.toArray();
        int numNew = a.length;
        if (numNew == 0)
            return false;

        Node<T> predecessor;
        Node<T> successor;
        if (index == size) {
            successor = null;
            predecessor = head;
        } else {
            successor = findNode(index);
            predecessor = successor.previous;
        }

        for (T o : a) {
            Node<T> newNode = new Node<>(predecessor, o, null);
            if (predecessor == null)
                head = newNode;
            else
                predecessor.next = newNode;
            predecessor = newNode;
        }

        if (successor == null) {
            tail = predecessor;
        } else {
            predecessor.next = successor;
            successor.previous = predecessor;
        }
        size += numNew;

        return true;
    }


    @Override
    public void clear() {
        if (isEmpty()) {
            return;
        }
        head = tail = null;
        size = 0;

    }

    //todo Exception
    @Override
    public T get(int index) {
        assertIndex(index);

        Node<T> iter = findNode(index);
        return iter.value;
    }


    private Node<T> findNode(int index) {
        assertIndex(index);

        Node<T> iter = head;
        for (int i = 0; i < index; i++) {
            iter = iter.next;
        }
        return iter;
    }


    @Override
    public T set(int index, Object element) {
        assertIndex(index);

        Node iter = findNode(index);
        T toReturn = (T) iter.value;

        iter.value = element;

        return toReturn;
    }


    @Override
    public void add(int index, Object element) {
        assertIndex(index);
        if (element == null) {
            throw new NullPointerException("Invalid element input!!");
        }
        // find  the node
        Node<T> previous = null;
        Node<T> iter = head;

        findNode(index);
        // add a node between previous and iter
        Node newNode = new Node(element);
        // first node
        if (iter == head) {
            newNode.next = head;
            head = newNode;
        } else {
            previous.next = newNode;
            newNode.next = iter;
        }
        // update tail if necessary
        if (index == size) {
            tail = newNode;
        }
        // update size
        size++;
    }


    @Override
    public T remove(int index) {
        assertIndex(index);
        Node<T> iter = findNode(index);
        if (iter == head) {
            head = iter.next;
            if (iter.next == null) {
                head = tail = null;
            } else {
                head.previous = null;
                iter.next = null;
            }
        } else if (iter == tail) {
            tail = iter.previous;
            tail.next = null;
            iter.previous = null;

        } else {
//        previous-> me -> next --->  previous -> next
            iter.previous.next = iter.next;
//        previous<- me <- next ---> previous <- next
            iter.next.previous = iter.previous;
            iter.previous = null;
            iter.next = null;
        }
        size--;
        return iter.value;
    }

    @Override
    public int indexOf(Object o) {
        if (o == null) return -1;

        Node<T> iter = head;
        for (int i = 0; i < size; i++) {
            if (o.equals(iter.value)) return i;
            iter = iter.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int index = size;
        if (o == null) {
            for (Node<T> iter = tail; iter != null; iter = iter.previous) {
                index--;
                if (iter.value == null)
                    return index;
            }
        } else {
            for (Node<T> iter = tail; iter != null; iter = iter.previous) {
                index--;
                if (o.equals(iter.value))
                    return index;
            }
        }
        return -1;
    }

    @Override
    public ListIterator listIterator() {
//        NOP
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        //        NOP
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException("index invalid !!!");
        }

        Node<T> iter = findNode(fromIndex);

        int count = (toIndex - fromIndex) + 1;

        MyLinkedList<T> newSubList = new MyLinkedList<>();
        newSubList.head = new Node(iter.value);
        Node<T> lastIter = newSubList.head;
        int countIndex = 1;
        iter = iter.next;
        while (iter != null && countIndex < count) {
            lastIter.next = new Node<>(iter.value);
            lastIter = lastIter.next;
            iter = iter.next;
            countIndex++;
        }
        return newSubList;
    }


    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {

        boolean change = false;
        MyIterator it = (MyIterator) c.iterator();
        while (it.hasNext()) {
            T o = it.next();
            while (contains(o)) {
                remove(o);
                change = true;
            }
        }
        return change;
    }

    @Override
    public boolean containsAll(Collection c) {
        for (Object e : c) {
            if (!contains(e))
                return false;
        }
        return true;
    }

    @Override
    public Object[] toArray(Object[] a) {
        //        NOP
        return new Object[0];
    }

    private static class Node<T> {
        Node<T> next;
        Node<T> previous;
        T value;

        public Node() {
        }

        public Node(T value) {
            this.value = value;
        }

        public Node(Node<T> previous, T element, Node<T> next) {
            this.previous = previous;
            this.next = next;
            this.value = element;
        }

        public Node(Node<T> previous, T value) {
            this.previous = previous;
            this.value = value;
        }


        public Node<T> getNext() {
            return next;
        }

        public boolean hasNext() {
            return (next != null);
        }

        public boolean hasPrevious() {
            return (previous != null);
        }
    }

    private class MyIterator implements Iterator, MyIterator1 {

        Node<T> iterator;


        public MyIterator() {
            iterator = new Node<>();
            iterator.next = head;
        }

        @Override
        public boolean hasNext() {
            return iterator.next != null;
        }

        @Override
        public T next() {
            iterator = iterator.next;
            return iterator.value;
        }
    }
}


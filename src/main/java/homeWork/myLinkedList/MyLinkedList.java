package main.java.homeWork.myLinkedList;

import java.util.*;


/**
 * Created by mykhailov on 18.06.16.
 */
public class MyLinkedList<T> implements List<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public MyLinkedList() {
    }

    private void assertIndex(int index)  {
        if (index < 0 || index >= size()) {
            try {
                throw new MyIndexOutOfBoundsException("Invalid index input!!! " + String.valueOf(index));
            } catch (MyIndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
    }

    private void assertIndexExclusive(int index)  {
        if (index < 0 || index > size()) {
            try {
                throw new MyIndexOutOfBoundsException("Invalid index input!!! " + String.valueOf(index));
            } catch (MyIndexOutOfBoundsException e) {
                e.printStackTrace();
            }
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
        while (iter != null && !o.equals(iter.value)) iter = iter.next;
        return (iter != null);
    }


    @Override

    public Iterator<T> iterator() {
        return new MyIterator<>();
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
    public boolean add(T o) {
        if (head == null) {
            head = tail = new Node<>(o);
            size++;
            return true;
        }
        Node<T> newNode = new Node<>(tail, o);
        tail.next = newNode;
        tail = newNode;
        size++;
        return true;
    }


    @Override
    public boolean remove(Object o) {
        int index = indexOf(o);
        if (index != -1) {
            remove(index);
            return true;
        } else return false;
    }


    @Override
    public boolean addAll(Collection c) {
        boolean change = false;
        for (Object o : c) {
            add((T) o);
            change = true;
        }
        return change;
    }


    @Override
    public boolean addAll(int index, Collection c) {
        assertIndexExclusive(index);
        boolean change = false;
        for (Object o : c) {
            add(index, (T) o);
            index++;
            change = true;
        }
        return change;
    }


    @Override
    public void clear() {
        if (isEmpty()) {
            return;
        }
        for (Node<T> iter = head; iter != null; ) {
            Node<T> next = iter.next;
            iter.value = null;
            iter.next = null;
            iter.previous = null;
            iter = next;
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
        assertIndexExclusive(index);
        Node<T> iter = head;
        for (int i = 0; i < index; i++) {
            iter = iter.next;
        }
        return iter;
    }


    @Override
    public T set(int index, T element) {
        if (this == element) {
            throw new IllegalArgumentException();
        }
        assertIndex(index);
        Node<T> iter = findNode(index);
        T toReturn = iter.value;
        iter.value = element;
        return toReturn;
    }


    @Override
    public void add(int index, T element) {
        assertIndexExclusive(index);
        Node<T> newNode = new Node<> (element);
        // inserting in an empty list
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        }
        // inserting at the beginning list != empty
        else if (index == 0) {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
        // inserting at the end (list != empty)
        else if (index == size()) {
            newNode.previous = tail;
            tail.next = newNode;
            tail = newNode;
        }
        // inserting somewhere in the middle
        else {
            if (index >= 1) ;
            Node<T> nodeBefore = findNode(index - 1);

            newNode.next = nodeBefore.next;
            newNode.next.previous = newNode;

            newNode.previous = nodeBefore;
            nodeBefore.next = newNode;
        }
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
        Node<T> iter = head;
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (iter.value == null) return i;
                iter = iter.next;
            }
        } else for (int i = 0; i < size; i++) {
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
                if (iter.value == null) return index;
            }
        } else {
            for (Node<T> iter = tail; iter != null; iter = iter.previous) {
                index--;
                if (o.equals(iter.value)) return index;
            }
        }
        return -1;
    }


    @Override
    public ListIterator<T> listIterator() {
//        NOP
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        //        NOP
        return null;
    }


    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > size() || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException("Invalid index input!!!");
        }
        MyLinkedList<T> newLinkedList = new MyLinkedList<>();
        int i = 0;
        for (Node<T> iter = head; iter != null && i <= toIndex; iter = iter.next) {
            if (i >= fromIndex && i <= toIndex) {
                newLinkedList.add(iter.value);
            }
            i++;
        }
        return newLinkedList;
    }


    @Override
    public boolean retainAll(Collection c) {
        MyLinkedList<T> tmpList = new MyLinkedList<>();
        for (T o : this) {
            if (!c.contains(o)) tmpList.add(o);
        }
        return this.removeAll(tmpList);
    }


    @Override
    public boolean removeAll(Collection c) {
        if (c.isEmpty()) return false;
        boolean change = false;
        for (Object o : c) {
            while (contains(o)) {
                remove(o);
                change = true;
            }
        }
        return change;
    }


    @Override
    public boolean containsAll(Collection c) {
        for (Object o : c) {
            if (!this.contains(o)) return false;
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

        public Node(Node<T> next, Node<T> previous, T value) {
            this.next = next;
            this.previous = previous;
            this.value = value;
        }

        public Node(Node<T> previous, T value) {
            this.previous = previous;
            this.value = value;
        }
    }


    private class MyIterator<T> implements Iterator {

        Node<T> iterator;

        public MyIterator() {
            iterator = new Node<>();
            iterator.next = (Node<T>) head;
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


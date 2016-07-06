package main.java.homeWork.myLinkedList;

import java.util.*;

/**
 * Created by gorobec on 05.06.16.
 */
public class MyLinkedList implements List {

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
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
        return indexOf(o) != -1;
    }


    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {

        if (head == null) {
            head = tail = new Node(o);
            size++;
            return true;
        }
        tail.next = new Node(o);
        tail = tail.next;


        Node newNode = new Node(tail, o);
        tail.setNext(newNode);
        tail = newNode;

        return false;
    }

    @Override
    public boolean remove(Object o) {
        int index = indexOf(o);
        if (index != -1) {
            return (boolean) remove(index);
        }else {
            return false;
        }
    }

    @Override
    public Object remove(int index) {
        if (index < 0 || index >= size) {
         //   throw new IndexOutOfBoundsException("index = " + index);
            System.exit(1);
        }
        Node prev = null,
        p = head;
        for (int i = 0; i < index; i++) {
            prev = p;
            p = p.next;
        }
        // remove
        if (p == head){
            head = head.next;
        }else {
            prev.next = p.next;
        }
        // if the last node was removed update tail
        if (p == tail){
            tail = prev;
        }
        size--;
        return true;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {
        size = 0;
        head = tail = null;
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index = " + index);
        }
        Node iter = head;
        for (int i = 0; i < index; i++) {

            iter = iter.next;
        }
        return iter.next;


    }

    @Override
    public Object set(int index, Object element) {
        checkIndex(index);
        Node p = head;
        Object oldVal = p.next;
        return oldVal;

      //  return null;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException();
    }

    @Override
    public void add(int index, Object element) {

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index = " + index);
        }
        // find  the node
        Node prev = null;
        Node p = head;
        for (int i = 0; i < index; i++) {
            prev = p;
            p = p.next;
        }
        // add a node between prev and p
        Node n = new Node(element);
        // first node
        if (p == head) {
            n.next = head;
            head = n;
        } else {
            prev.next = n;
            n.next = p;
        }
        // update tail if necessary
        if (index == size) {
            tail = n;
        }
        // update size
        size++;
    }


    @Override
    public int indexOf(Object o) {
        int index =0;
        if(o == null){
            for (Node p = head;  p != null ;  p = p.next) {
                if (p.next == null) {
                    return index;
                }
                index++;
            }
        }else {
            for (Node p = head;  p != null ;  p = p.next) {
                if (o.equals(p.next)){
                    return index;
                }
                index++;
            }
        }
        // o is not in the list
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }


}

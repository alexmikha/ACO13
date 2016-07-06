package  main.java.data_structures.binary_search_tree;


import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by gorobec on 02.07.16.
 */
public class BinarySearchTree<E> implements Set<E>, Iterable<E> {

    private Node<E> root;
    private int size;
    private Comparator<? super E> comparator;

    public BinarySearchTree() {
    }

    public BinarySearchTree(Comparator<? super E> comparator) {
        this.comparator = comparator;
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
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyBinaryTreeIterator<>();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {

        if(root == null){
            root = new Node<>(e);
            size++;
            return true;
        }

        if(comparator != null){
//            todo compare with comparator
        } else if(e != null) {

            Comparable<? super E> eComparable = (Comparable<E>) e;

            Node<E> iter = root;


            while (iter != null) {

                int compareResult = eComparable.compareTo(root.value);
                if (compareResult > 0) {
                    iter = iter.rightChild;
                } else if (compareResult < 0) {
                    iter = iter.leftChild;
                } else {
                    return false;
                }
            }


        }



        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    private static class Node<T> {

        T value;
        Node<T> parent;
        Node<T> leftChild;
        Node<T> rightChild;

        public Node(T value) {
            this.value = value;
        }
    }

    private class MyBinaryTreeIterator<E> implements Iterator<E> {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            return null;
        }
    }
}

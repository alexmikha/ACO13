package homeWork.myArrayList;

import java.util.Arrays;

/**
 * Created by mykhailov on 04.06.2016.
 */
public class MyArrayList {

    private Object[] myArray;
    private int size;

    public static final int DEFAULT_CAPACITY = 4;

    public MyArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public MyArrayList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        myArray = new Object[capacity];
        size = 0;
    }


    public int size() {
        return size;
    }

    public void add(int index, Object object) {
        if (index < 0 && index >= myArray.length)
            throw new IndexOutOfBoundsException();
        if (size == myArray.length) {
            expandCapacity();
        }
        System.arraycopy(myArray, size, myArray, index, size - index);
        // add element
        myArray[index] = object;
        size++;
    }


    public void expandCapacity() {
        if (size >= myArray.length) {
            myArray = Arrays.copyOf(myArray, myArray.length * 2);
        }
    }


    public boolean add(Object object) {
        if (size == myArray.length)
            expandCapacity();
        if (size < myArray.length) {
            myArray[size++] = object;
        }
        return true;
    }


    public Object get(int index) {
        if (index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException(index);
        else
            return myArray[index];
    }

    public Object remove(int index) {
        if (index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException(index);
        if (index >= 0 && index < size()) {
            Object temp = myArray[index];
            fastRemove(index);
            return temp;
        }
        return false;
    }

    public void fastRemove(int index) {
        int moved = size - index - 1;
        System.arraycopy(myArray, index + 1, myArray, index, moved);
        myArray[--size] = null;
    }

    public boolean remove(Object object) {
        if (object == null) {
            for (int i = 0; i < size; i++)
                if (myArray[i] == null) {
                    fastRemove(i);
                    return true;
                }
        } else {
            for (int j = 0; j < size; j++)
                if (object.equals(myArray[j])) {
                    fastRemove(j);
                    return true;
                }
        }
        return false;
    }


    public Object set(int index, Object newObject) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        Object oldObject = myArray[index];
        myArray[index] = newObject;
        return oldObject;
    }


    public void clear() {
        for (int i = 0; i < size; i++) {
            myArray[i] = null;
            size = 0;
        }
    }

    public boolean contains(Object object) {
        return indexOf(object) != -1;
    }

    public int indexOf(Object object) {
        if (object == null) {
            for (int i = 0; i < size; i++)
                if (myArray[i] == null) return i;
        } else {
            for (int j = 0; j < size; j++)
                if (object.equals(myArray[j])) return j;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "myArray=" + Arrays.toString(myArray) +
                '}';
    }
}

package homeWork.myArrayList;

import java.util.Arrays;

/**
 * Created by mykhailov on 04.06.2016.
 */
public class MyArrayList {

    private Object[] myArray;
    private int size;

    public static final int DEFAULT_CAPACITY = 10;

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
        if (index < 0 || index > myArray.length)
            throw new IndexOutOfBoundsException();

        if (size() == myArray.length)
            //   expandCapacity(myArray);
            expandCapacity();
//        for (int i = size; i > index; i--)
//            myArray[i] = myArray[i - 1];
        System.arraycopy(myArray, size - 1, myArray, index, size - index);
        // add element
        myArray[index] = object;
        size++;
    }

//    private Object[] expandCapacity(Object[] myArray) {
//        Object[] newArray = new Object[this.myArray.length * 2];
//        System.arraycopy(this.myArray, 0, newArray, 0, size());
//        this.myArray = newArray;
//        return newArray;
//    }

    public void expandCapacity() {
        if (size >= myArray.length) {
            Object[] newArray = new Object[this.myArray.length * 2];
            System.arraycopy(this.myArray, 0, newArray, 0, size());
            this.myArray = newArray;
        }
    }


    public boolean add(Object object) {
        if (size < myArray.length) {
            myArray[size] = object;
            size++;
        } else if (size == myArray.length)
            // myArray = expandCapacity(myArray);
            expandCapacity();
        add(size(), object);
        //     myArray[size++] = object; // не работает
        return false;
    }

    public Object get(int index) {
        if (index >= 0 && index < this.size())
            return myArray[index];
        else
            throw new IndexOutOfBoundsException();
    }

    public Object remove(int index) {
        if (index >= 0 && index < this.size()) {
            Object temp = myArray[index];
            fastRemove(index);
            return temp;
        }
        return false;
    }

    public void fastRemove(int index) {
        int moved = size - index - 1;
        System.arraycopy(myArray, index + 1, myArray, index, moved);
        myArray[size--] = null;
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
        if (index < 0 || index > myArray.length - 1)
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
        for (int i = 0; i < size; i++)
            if (object.equals(myArray[i])) return i;
        return -1;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "myArray=" + Arrays.toString(myArray) +
                '}';
    }
}

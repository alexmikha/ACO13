package homeWork.myArrayList;

import java.util.Arrays;

/**
 * Created by mykhailov on 04.06.2016.
 */
public class MyArrayList {

    private Object[] myArray;
    private int size;
    //  private int capacity;

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
            expandCapacity(myArray);

        for (int i = size; i > index; i--)
            myArray[i] = myArray[i - 1];

        // add element
        myArray[index] = object;
        size++;
    }

    private Object[] expandCapacity(Object[] myArray) {
        Object[] newArray = new Object[this.myArray.length * 2];
        System.arraycopy(this.myArray, 0, newArray, 0, size());
        this.myArray = newArray;
        return newArray;
    }


    public boolean add(Object object) {
        if (size > myArray.length)
            myArray = expandCapacity(myArray);
        add(size(), object);
        return false;
    }

    public Object get(int index) {
        return myArray[index];
    }

    public Object remove(int index) {
        if (index >= 0 && index < this.size()) {
            Object temp = myArray[index];
            for (int i = index; i < this.size() - 1; i++)
                myArray[index] = myArray[index + 1];
            size--;
            return temp;
        }
        return false;
    }

    public boolean remove(int index, Object object) {
        if (object == null) {

            for (index = 0; index < size; index++)
                if (myArray[index] == null) {
                    remove(index);
                    return true;
                }
        } else {
            for (index = 0; index < size; index++)
                if (object.equals(myArray[index])) {
                    remove(index);
                    return true;
                }
        }
        return false;
    }


    public Object set(int index, Object newObject) {
        if (index < 0 || index >= myArray.length - 1)
            throw new IndexOutOfBoundsException();
        Object oldObject = myArray[index];
        myArray[index] = newObject;

        return oldObject;
    }

    public void clear() {
        myArray = null;
        size = 0;
    }

    public boolean contains(Object object) {
        for (int i = 0; i < this.size(); i++) {
            if (this.myArray[i].equals(object))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "myArray=" + Arrays.toString(myArray) +
                '}';
    }
}

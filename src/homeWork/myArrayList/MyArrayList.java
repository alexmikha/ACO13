package homeWork.myArrayList;

/**
 * Created by mykhailov on 04.06.2016.
 */
public class MyArrayList {

    private Object[] myArray;
    private int mySize;

    public MyArrayList() {
        myArray = new Object[10];
        mySize = 0;
    }

    public int size() {
        return mySize;
    }
    
    public void add(int index, Object element) {
        if (index < 0 || index > size())
            throw new IndexOutOfBoundsException();

        if (size() == myArray.length) {
            resize();
        }
        for (int i = size(); i > index; i--)
            myArray[i] = myArray[i - 1];

        // add element
        myArray[index] = element;
        mySize++;
    }

    private void resize() {
        Object[] newArray = new Object[size() * 2];
        System.arraycopy(myArray, 0, newArray, 0, size());
        myArray = newArray;
    }

    public void add(Object element){
        add(size(), element);
    }

}

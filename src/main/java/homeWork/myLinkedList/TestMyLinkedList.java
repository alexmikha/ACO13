package main.java.homeWork.myLinkedList;

import main.java.data_structures.linked_list.MyIndexOutOfBoundException;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by mykhailov on 06.07.2016.
 */
public class TestMyLinkedList {

    private List<String> list;

    @Before
    public void setUp() {
        this.list = new MyLinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
    }

    @Test(expected = MyIndexOutOfBoundException.class)
    public void test_get_index_outputexeption() {

        list.get(0);

    }
}


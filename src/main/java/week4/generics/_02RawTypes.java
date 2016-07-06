package main.java.week4.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mykhailov on 16.06.16.
 */
public class _02RawTypes {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        List list2 = new ArrayList();

        list2.add("String");

//        list2 = list;
        list = list2;

        int a = list.get(0);


    }
}

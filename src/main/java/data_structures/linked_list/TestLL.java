package  main.java.data_structures.linked_list;

import java.util.List;

/**
 * Created by gorobec on 18.06.16.
 */
public class TestLL {
    public static void main(String[] args) {


        List<Integer> list = new MyLinkedList<>();



        list.add(5);

        int expected = 1;
        int actual = list.size();
        boolean result = actual == expected;

        System.out.printf("Metod add, result %s, actual - %d, expected %d\n", result, actual, expected);

        list.add(15);
        list.add(25);

        for (Object o : list) {
            System.out.println(o);
        }

        expected = 2;
         actual = list.indexOf(25);
        result = actual == expected;

        System.out.printf("Metod indexOf, result %s, actual - %d, expected %d\n", result, actual, expected);

        expected = 2;
         actual = list.size();
        result = actual == expected;

        System.out.printf("Metod add, result %s, actual - %d, expected %d\n", result, actual, expected);




        expected = 5;
        actual = (Integer)list.get(0);
        result = actual == expected;

        System.out.printf("Metod get, result %s, actual - %d, expected %d\n", result, actual, expected);

        expected = 5;
        actual = (Integer)list.remove(0);
        result = actual == expected;

        System.out.printf("Metod get, result %s, actual - %d, expected %d\n", result, actual, expected);

        expected = 25;
        actual = (Integer)list.remove(1);
        result = actual == expected;

        System.out.printf("Metod remove, result %s, actual - %d, expected %d\n", result, actual, expected);


        expected = 15;
        actual = (Integer)list.remove(0);
        result = actual == expected;

        System.out.printf("Metod remove, result %s, actual - %d, expected %d\n", result, actual, expected);

        expected = 15;
        actual = (Integer)list.remove(0);
        result = actual == expected;

        System.out.printf("Metod remove, result %s, actual - %d, expected %d\n", result, actual, expected);


    }
}

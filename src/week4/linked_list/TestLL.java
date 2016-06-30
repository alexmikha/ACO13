package week4.linked_list;


import java.util.List;

/**
 * Created by gorobec on 18.06.16.
 */
public class TestLL {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList<>();
        MyLinkedList list1 = new MyLinkedList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);


        list.add(5);
        int expected = 1;
        int actual = list.size();
        boolean result = actual == expected;

        System.out.printf("Method add, result %s, actual - %d, expected %d\n", result, actual, expected);

        list.add(15);
        list.add(25);

        for (Object o : list) {
            System.out.print(o + ", ");
        }
        System.out.println();

        expected = 1;
        actual = list.lastIndexOf(15);
        result = actual == expected;
        System.out.printf("Method lastIndexOf(Object o), result %s, actual - %d, expected %d\n", result, actual, expected);

        expected = 2;
        actual = list.indexOf(25);
        result = actual == expected;
        System.out.printf("Method indexOf, result %s, actual - %d, expected %d\n", result, actual, expected);


        expected = 3;
        actual = list.size();
        result = actual == expected;
        System.out.printf("Method add, result %s, actual - %d, expected %d\n", result, actual, expected);

        expected = 5;
        actual = (int) list.get(0);
        result = actual == expected;
        System.out.printf("Method get, result %s, actual - %d, expected %d\n", result, actual, expected);

        expected = 15;
        actual = (int) list.remove(1);
        result = actual == expected;
        System.out.printf("Method remove(Object o), result %s, actual - %d, expected %d\n", result, actual, expected);

        expected = 5;
        actual = (int) list.remove(0);
        result = actual == expected;
        System.out.printf("Method remove(Object o), result %s, actual - %d, expected %d\n", result, actual, expected);


        expected = 25;
        actual = (int) list.remove(0);
        result = actual == expected;
        System.out.printf("Method remove(Object o), result %s, actual - %d, expected %d\n", result, actual, expected);


        for (Object o : list) {
            System.out.println(o);
        }
        list.add(0, 10);
        int expected1 = 10;
        Integer actual1 = (Integer) list.get(0);
        boolean result1 = actual1.equals(expected1);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "add(int index, T element)",
                result1, expected1, actual1);


        list.add(25);
        boolean expected4 = true;
        boolean actual4 = list.contains(25);
        boolean result4 = actual4 == expected4;
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "contains",
                result4, expected4, actual4);


        list.addAll(list1);
        int expected5 = 6;
        Integer actual5 = list.size();
        boolean result5 = actual5 == (expected5);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "addAll(Collection c)",
                result5, expected5, actual5);
        for (Object o : list) {
            System.out.print(o + ", ");
        }
        System.out.println();
        boolean expected11 = true;
        boolean actual11 = list.containsAll(list1);
        boolean result11 = actual11 == (expected11);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "containsAll(Collection c)",
                result11, expected11, actual11);


        list.addAll(3, list1);
        int expected6 = 10;
        Integer actual6 = list.size();
        boolean result6 = actual6 == (expected6);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "addAll(int index, Collection c)",
                result6, expected6, actual6);

        for (Object o : list) {
            System.out.print(o + ", ");
        }
        System.out.println();


        System.out.print("subList: ");
        for (Object o : list1.subList(1, 2)) {
            System.out.print(o + ", ");
        }
        System.out.println();
        System.out.print("subList: ");
        for (Object o : list1.subList(2, 3)) {
            System.out.print(o + ", ");
        }
        System.out.println();

        System.out.print("subList: ");
        List lst = list1.subList(0, 1);
        for (Object o : lst) {
            System.out.print(o + ", ");
        }
        System.out.println();

        lst.subList(0, 1).get(0);                        // начало и конец subList определяется
        System.out.println(lst.subList(0, 1).get(0));    // но не работает если list1.subList(0, 1).clear
        int expected7 = 1;                               // или remove
        Object actual7 = lst.subList(0, 1).get(0);
        boolean result7 = actual7.equals(expected7);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "subList",
                result7, expected7, actual7);


        list1.removeAll(list1);
        int expected8 = 0;
        Integer actual8 = list1.size();

        boolean result8 = actual8 == (expected8);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "removeAll(Collection c)",
                result8, expected8, actual8);
        for (Object o : list1) {
            System.out.print(o + ", ");
        }

        list.set(0, 20);
        int expected9 = 20;
        int actual9 = (int) list.get(0);
        boolean result9 = actual9 == (expected9);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "set(int index, Object element)",
                result9, expected9, actual9);
        for (Object o : list) {
            System.out.print(o + ", ");
        }
        System.out.println();

        int expected2 = 20;
        Integer actual2 = (Integer) list.get(0);
        list.remove(0);
        boolean result2 = actual2.equals(expected2);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "remove(int index)",
                result2, expected2, actual2);
        for (Object o : list) {
            System.out.print(o + ", ");
        }
        System.out.println();

        list.clear();
        int expected3 = 0;
        Integer actual3 = list.size();
        boolean result3 = actual3 == (expected3);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "clear",
                result3, expected3, actual3);

        boolean expected10 = true;
        boolean actual10 = list.isEmpty();
        boolean result10 = actual10 == (expected10);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "isEmpty",
                result10, expected10, actual10);

    }
}
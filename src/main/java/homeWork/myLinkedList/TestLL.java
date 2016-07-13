package main.java.homeWork.myLinkedList;


/**
 * Created by mykhailov on 18.06.16.
 */
public class TestLL {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList<>();
        MyLinkedList list1 = new MyLinkedList<>();
        MyLinkedList list2 = new MyLinkedList<>();
        MyLinkedList list3 = new MyLinkedList<>();
        MyLinkedList list4 = new MyLinkedList<>();
        MyLinkedList list5 = new MyLinkedList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(10);
        list2.add(15);

        list4.add(5);
        list4.add(5);
        list4.add(6);
        list4.add(7);
        list4.add(6);
        list4.add(5);

        list5.add(5);
        list5.add(6);

        list.add(5);
        int expected = 1;
        int actual = list.size();
        boolean result = actual == expected;
        System.out.printf("Method - add, result %s, actual - %d, expected %d\n", result, actual, expected);

        list.add(15);
        list.add(25);
        list.add("A");


        for (Object o : list) {
            System.out.print(o + ", ");
        }
        System.out.println();

        expected = 1;
        actual = list.lastIndexOf(15);
        result = actual == expected;
        System.out.printf("Method - lastIndexOf(Object o), result %s, actual - %d, expected %d\n", result, actual, expected);

        expected = 2;
        actual = list.indexOf(25);
        result = actual == expected;
        System.out.printf("Method - indexOf, result %s, actual - %d, expected %d\n", result, actual, expected);


        expected = 4;
        actual = list.size();
        result = actual == expected;
        System.out.printf("Method - add, result %s, actual - %d, expected %d\n", result, actual, expected);

        expected = 5;
        actual = (int) list.get(0);
        result = actual == expected;
        System.out.printf("Method - get, result %s, actual - %d, expected %d\n", result, actual, expected);

        list.remove(2);
        expected = 3;
        actual = list.size();
        result = actual == expected;
        System.out.printf("Method - remove(index), result %s, actual - %d, expected %d\n", result, actual, expected);

        list.remove(0);
        expected = 2;
        actual = list.size();
        result = actual == expected;
        System.out.printf("Method - remove(index), result %s, actual - %d, expected %d\n", result, actual, expected);

        list.remove("A");
        expected = 1;
        actual = list.size();
        result = actual == expected;
        System.out.printf("Method - remove(Object o), result %s, actual - %d, expected %d\n", result, actual, expected);


        for (Object o : list) {
            System.out.println(o);
        }
        list.add(0, 10);
        int expected1 = 10;
        Integer actual1 = (Integer) list.get(0);
        boolean result1 = actual1.equals(expected1);
        System.out.printf("Method - %s, result - %s," +
                        " expected - %s, actual - %s\n", "add(int index, T element)",
                result1, expected1, actual1);


        list.add(25);
        boolean expected4 = true;
        boolean actual4 = list.contains(25);
        boolean result4 = actual4 == expected4;
        System.out.printf("Method - %s, result - %s," +
                        " expected - %s, actual - %s\n", "contains",
                result4, expected4, actual4);

        System.out.println("size before addAll(Collection c) " + list.size());
        for (Object o : list) {
            System.out.print(o + ", ");
        }
        System.out.println();
        list.addAll(list1);
        int expected5 = 7;
        Integer actual5 = list.size();
        boolean result5 = actual5 == (expected5);
        System.out.printf("Method - %s, result - %s," +
                        " expected - %s, actual - %s\n", "addAll(Collection c)",
                result5, expected5, actual5);
        System.out.println("size after addAll(Collection c) " + list.size());
        for (Object o : list) {
            System.out.print(o + ", ");
        }
        System.out.println();


        boolean actual11 = list.containsAll(list1);
        System.out.printf("Method - %s, result - %s," +
                        " expected - %s, actual - %s\n", "containsAll(Collection c)",
                actual11, true, actual11);


        list.addAll(3, list1);
        int expected6 = 11;
        Integer actual6 = list.size();
        boolean result6 = actual6 == (expected6);
        System.out.printf("Method - %s, result - %s," +
                        " expected - %s, actual - %s\n", "addAll(int index, Collection c)",
                result6, expected6, actual6);

        for (Object o : list) {
            System.out.print(o + ", ");
        }
        System.out.println();

        list.add(5, "B");
        String expected15 = "B";
        String actual15 = (String) list.get(5);
        boolean result15 = actual15.equals(expected15);
        System.out.printf("Method - %s, result - %s," +
                        " expected - %s, actual - %s\n", "add(int index, T element) in middle list ",
                result15, expected15, actual15);
        System.out.println("List after addAll(int index, T element) in middle list ");
        for (Object o : list) {
            System.out.print(o + ", ");
        }
        System.out.println();


        System.out.println("subList before ");
        for (Object o : list1.subList(0, 3)) {
            System.out.print(o + ", ");
        }
        System.out.println();
        list1.addAll(list.subList(1, 3));
        System.out.println("subList after addAll(list.subList(1,3)) ");
        for (Object o : list1) {
            System.out.print(o + ", ");
        }
        System.out.println();
        int expected7 = 7;
        Integer actual7 = list1.size();
        boolean result7 = actual7.equals(expected7);
        System.out.printf("Method - %s, result - %s," +
                        " expected - %s, actual - %s\n", "subList",
                result7, expected7, actual7);


        System.out.println("size before retainAll " + list.size());
        for (Object o : list) {
            System.out.print(o + ", ");
        }
        System.out.println();
        list.retainAll(list2);
        int expected14 = 2;
        System.out.println("size after retainAll " + list.size());
        for (Object o : list) {
            System.out.print(o + ", ");
        }
        System.out.println();
        Integer actual14 = list.size();
        boolean result14 = actual14 == expected14;
        System.out.printf("Method - %s, result - %s," +
                        " expected - %s, actual - %s\n", "retainAll",
                result14, expected14, actual14);


        System.out.println("size before removeAll " + list1.size());
        for (Object o : list4) {
            System.out.print(o + ", ");
        }
        System.out.println();
        list4.removeAll(list5);
        System.out.println("size after removeAll(list(5, 6)) " + list4.size());
        for (Object o : list4) {
            System.out.print(o + ", ");
        }
        System.out.println();
        int expected8 = 1;
        Integer actual8 = list4.size();
        boolean result8 = actual8 == expected8;
        System.out.printf("Method - %s, result - %s," +
                        " expected - %s, actual - %s\n", "removeAll(Collection c)",
                result8, expected8, actual8);

        System.out.println("List before set size " + list1.size());
        for (Object o : list1) {
            System.out.print(o + ", ");
        }
        System.out.println();

        list1.set(0, 20);
        int expected9 = 20;
        int actual9 = (int) list1.get(0);
        boolean result9 = actual9 == expected9;
        System.out.printf("Method - %s, result - %s," +
                        " expected - %s, actual - %s\n", "set(int index, Object element)",
                result9, expected9, actual9);
        System.out.println("List after set size " + list1.size());
        for (Object o : list1) {
            System.out.print(o + ", ");
        }
        System.out.println();


        System.out.println("List before remove(int index) size " + list1.size());
        for (Object o : list1) {
            System.out.print(o + ", ");
        }
        System.out.println();
        int expected2 = 6;
        list1.remove(0);
        Integer actual2 = list1.size();
        boolean result2 = actual2 == expected2;
        System.out.printf("Method - %s, result - %s," +
                        " expected - %s, actual - %s\n", "remove(int index)",
                result2, expected2, actual2);
        System.out.println("List after remove(int index) size " + list1.size());
        for (Object o : list1) {
            System.out.print(o + ", ");
        }
        System.out.println();

        list.clear();
        int expected3 = 0;
        Integer actual3 = list.size();
        boolean result3 = actual3 == expected3;
        System.out.printf("Method - %s, result - %s," +
                        " expected - %s, actual - %s\n", "clear",
                result3, expected3, actual3);

        boolean expected10 = true;
        boolean actual10 = list.isEmpty();
        boolean result10 = actual10 == expected10;
        System.out.printf("Method - %s, result - %s," +
                        " expected - %s, actual - %s\n", "isEmpty",
                result10, expected10, actual10);
    }
}

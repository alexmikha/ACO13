package main.java.homeWork.myArrayList;

/**
 * Created by mykhailov on 20.06.2016.
 */
public class TestMAL {

    public static void main(String[] args) {

        MyArrayList<Integer> myList = new MyArrayList<>(4);
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;
        int number4 = 4;
        int number5 = 5;

        myList.add(0, number1);
        int expected = 1;
        Object actual = myList.get(0);
        boolean result = actual.equals(expected);
        System.out.printf("Method name - add(int index, T object), " +
                "result - %s, expected - %s,  actual - %s\n", result, expected, actual);


        myList.add(number2);
        int expected1 = 2;
        Object actual1 = myList.get(1);
        boolean result1 = actual1.equals(expected1);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "add(T object)",
                result1, expected1, actual1);


        myList.add(number3);
        int expected2 = 3;
        Object actual2 = myList.get(2);
        boolean result2 = actual2.equals(expected2);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "get(int index)",
                result2, expected2, actual2);


        int expected3 = 2;
        Integer actual3 = myList.remove(1);
        boolean result3 = actual3.equals(expected3);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "remove(int index)",
                result3, expected3, actual3);

        int expected4 = 3;
        Integer actual4 = myList.remove(1);
        boolean result4 = actual4.equals(expected4);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "remove(T object)",
                result4, expected4, actual4);


        Boolean actual5 = myList.contains(1);
        boolean result5 = actual5.equals(true);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "contains(T object)",
                result5, true, actual5);

        myList.clear();
        int expected6 = 5;
        myList.add(number1);
        myList.add(number2);
        myList.add(number3);
        myList.add(number4);
        myList.add(number5);

        int actual6 = myList.size();
        boolean result6 = actual6 == expected6;
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "expandCapacity()",
                result6, expected6, actual6);

        int expected7 = 4;
        Integer actual7 = myList.indexOf(5);
        boolean result7 = actual7.equals(expected7);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "indexOf(T object)",
                result7, expected7, actual7);

        myList.set(4, number1);
        int expected8 = 1;
        Object actual8 = myList.get(4);
        boolean result8 = actual8.equals(expected8);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "set(int index, T newObject)",
                result8, expected8, actual8);

        myList.clear();
        int expected9 = 0;
        int actual9 = myList.size();
        boolean result9 = actual9 == expected9;
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "clear()",
                result9, expected9, actual9);
    }
}



package homeWork.myArrayList;

/**
 * Created by mykhailov on 20.06.2016.
 */
public class TestMAL {

    public static void main(String[] args) {

        MyArrayList myList = new MyArrayList(4);
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;
        int number4 = 4;
        int number5 = 5;

        myList.add(0, number1);
        int expected = 1;
        Object actual = myList.get(0);
        boolean result = actual.equals(expected);
        System.out.printf("Method name - add(int index, Object object), " +
                "result - %s, expected - %s,  actual - %s\n", result, expected, actual);


        myList.add(number2);
        int expected1 = 2;
        Object actual1 = myList.get(1);
        boolean result1 = actual1.equals(expected1);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "add(Object object)",
                result1, expected1, actual1);


        myList.add(number3);
        int expected2 = 3;
        Object actual2 = myList.get(3);
        boolean result2 = actual2.equals(expected2);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "get(int index)",
                result2, expected2, actual2);


        int expected3 = 3;
        Object actual3 = myList.remove(3);
        boolean result3 = actual3.equals(expected3);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "remove(int index)",
                result3, expected3, actual3);


        int expected4 = 2;
        Object actual4 = myList.remove(number2);
        boolean result4 = actual4.equals(expected4);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "remove(Object object)",
                result4, expected4, actual4);


        myList.set(1, number4);
        int expected5 = 4;
        Object actual5 = myList.get(1);
        boolean result5 = actual5.equals(expected5);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "set(int index, Object newObject)",
                result5, expected5, actual5);


        int expected6 = 1;
        Object actual6 = myList.indexOf(4);
        boolean result6 = actual6.equals(expected6);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "indexOf(Object object)",
                result6, expected6, actual6);


        Object actual7 = myList.contains(4);
        boolean result7 = actual7.equals(true);
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "contains(Object object)",
                result7, true, actual7);


        System.out.println("size before - " + myList.size());
        int expected9 = 5;
        myList.add(number5);
        int actual9 = myList.size();
        System.out.println("size after - " + myList.size());
        boolean result9 = actual9 == expected9;
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "expandCapacity()",
                result9, expected9, actual9);

        myList.clear();
        int expected8 = 0;
        int actual8 = myList.size();
        boolean result8 = actual8 == expected8;
        System.out.printf("Method name - %s, result - %s," +
                        " expected - %s, actual - %s\n", "clear()",
                result8, expected8, actual8);
    }
}



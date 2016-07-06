package main.java.week1.day2;

/**
 * Created by mykhailov on 23.05.2016.
 */
public class ArrayUtils {
    public static void PrintArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }

    public static void PrintArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
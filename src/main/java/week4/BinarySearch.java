package main.java.week4;

import java.util.*;

/**
 * Created by mykhailov on 18.06.16.
 */
public class BinarySearch {
    public static void main(String[] args) {
        /*int[] array = ArrayUtils.createArray(1_000_000);
        long start = System.currentTimeMillis();
        boolean isContain = contains(array, 89999);
        long finish = System.currentTimeMillis();
        System.out.printf("LineSearch - %d ms\n", finish - start);
        System.out.println(isContain);


        start = System.currentTimeMillis();
        Arrays.sort(array);
        int[] sortedArray = array;
        boolean isContain2 = binarySearch(sortedArray, 89999);
        finish = System.currentTimeMillis();
        System.out.printf("BinarySearch - %d ms\n", finish - start);
        System.out.println(isContain2);*/


        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Hola");
        list.add("Hell");
        list.add("Hi");


        Collections.sort(list);

        System.out.println(binarySearch(list, "Hello"));
    }
// todo at home
    private static<T extends Comparable<T>> boolean binarySearch(List<T> list, T object) {

        int start = 0;
        int end = list.size() - 1;

        while (start != end){
            int middle = start + (end - start) / 2;
            if (list.get(middle).compareTo(object) < 0){
                start = middle + 1;
            }
            else if (list.get(middle).compareTo(object) > 0){
                end = middle - 1;
            } else {
                return true;
            }
        }

        return false;
    }



    private static boolean binarySearch(List list , Object number, Comparator comparator) {return false;}


    private static boolean binarySearch(int[] sortedArray, int number) {
        int start = 0;
        int end = sortedArray.length - 1;

        while (start != end){
            int middle = start + (end - start) / 2;
            if (sortedArray[middle] < number){
                start = middle + 1;
            }
            else if (sortedArray[middle] > number){
                end = middle - 1;
            } else {
                return true;
            }
        }

        return false;
    }

    private static boolean contains(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == number) return true;
        }
        return false;
    }
}

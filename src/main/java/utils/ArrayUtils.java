package  main.java.utils;

/**
 * Created by gorobec on 18.06.16.
 */
public class ArrayUtils {
    public static int[] createArray(int size){
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random() * 10);
        }
        return array;
    }

    public static void selectSort(int[] array){
        if(array == null || array.length <= 1) return;

        for (int i = 0; i < array.length; i++) {
            int idx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[idx]) {
                    idx = j;
                }
            }
            swap(array, i, idx);
        }
    }
    public static void bubleSort(int[] array){
        if(array == null || array.length <= 1) return;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array.length - 1 ; j++) {
                if(array[j] > array[j + 1])
                swap(array, j, j + 1);
            }
        }
    }

    public static void insertSort(int[] array){
//    todo at home
    }

    private static void swap(int[] array, int i, int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}

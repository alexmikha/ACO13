package homeWork.sort;

/**
 * Created by mykhailov on 23.06.2016.
 */
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;

                }
            }
            if (i != min_i) {
                int temp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = temp;
            }
        }
    }
}

package main.java.homeWork.sort;

/**
 * Created by mykhailov on 23.06.2016.
 */
public class BubbleSort {

     void bubbleSort(int[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j< i; j++) {
             if (arr[j] > arr[j + 1]) {
                   int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
  //                  temp--;
  //                System.out.print(temp + "\n");
                }
            }
        }
    }
}

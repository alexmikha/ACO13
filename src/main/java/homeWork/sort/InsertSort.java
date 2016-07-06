package main.java.homeWork.sort;

/**
 * Created by mykhailov on 25.06.2016.
 */
public class InsertSort {
 public    void insertSort(int[] arr){
        int i, j, tmp;
        for (i = 1; i < arr.length; i++) {
            tmp = arr[i];
            for ( j = i-1; j >= 0 && arr[j] > tmp ; j--){
                arr[j + 1] = arr[j];
            }
            arr[j+1] = tmp;

            }
        }
    }


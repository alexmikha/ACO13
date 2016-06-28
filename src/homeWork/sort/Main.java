package homeWork.sort;

import java.util.ArrayList;

public class Main {
    //   public static int arr[] = new int[5];
    static int[] arr = {1, 5, 3, 2, 0, 4};
    static int[] arr1 = {1, 5, 3, 2, 0, 4};
    static int[] arr2 = {1, 5, 3, 2, 0, 4};

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        InsertSort insertSort = new InsertSort();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(0);
        list.add(4);
//        System.out.println("Нулевой индеkс: " + list.get(0));
//        for (Integer in : list) {
//            System.out.print(in + "  ");
//        }
//        System.out.println();

 //       System.out.println("List: " + list);
        bubbleSort.bubbleSort(arr);
        System.out.print("bubbleSorted: ");
        for (int anArr1 : arr) {
            System.out.print(anArr1 + " ");

        }
        System.out.println("");
        selectionSort.selectionSort(arr1);
        System.out.print("selectionSorted: ");
        for (int anArr : arr1) {
            System.out.print(anArr + " ");
        }
        System.out.println();

        insertSort.insertSort(arr2);
        System.out.print("insertSort :" );
        for (int anArr : arr2) {
            System.out.print(anArr + " ");
        }

            System.out.println();
            System.out.print("Реверс: ");
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(i + ", ");
            }

        }
    }











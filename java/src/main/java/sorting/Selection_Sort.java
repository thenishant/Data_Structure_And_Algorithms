package main.sorting;

import static main.sorting.Commons.printArray;
import static main.sorting.Commons.swap;

public class Selection_Sort {


    private static void sort(int[] array) {
        for (int lastSortedIndex = array.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= lastSortedIndex; i++) {
                if (array[i] > array[largest])
                    largest = i;
            }
            swap(array, largest, lastSortedIndex);
        }
    }

    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        sort(array);
        printArray(array);
    }
}

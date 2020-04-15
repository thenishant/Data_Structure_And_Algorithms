package sorting;

import static sorting.Commons.printArray;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        sort(array);
        printArray(array);
    }

    private static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int newElement = array[i];
            int j;
            for (j = i; j > 0 && array[j - 1] > newElement; j++) {
                array[j] = array[j - 1];
            }
            array[j] = newElement;
        }
    }
}

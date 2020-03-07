package main.sorting;

public class Commons {

    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static void printArray(int[] array) {
        for (int value : array) {
            System.out.println(value + " ");
        }
    }

}

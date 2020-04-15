package sorting;


import static sorting.Commons.printArray;
import static sorting.Commons.swap;

public class Bubble_Sort {


    private static void sort(int[] array) {
        for (int unsortedArray = array.length - 1; unsortedArray > 0; unsortedArray--) {
            for (int i = 0; i < unsortedArray; i++) {
                if (array[i] > array[i + 1])
                    swap(array, i, i + 1);
            }
        }
    }


    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        sort(array);
        printArray(array);
    }
}

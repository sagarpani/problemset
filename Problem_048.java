//INSERTION SORT

import java.util.Arrays;
public class Problem_048 {
    public static void main(String[] args) {
        int[] arr = {7, 6, 56, 3, 2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Shift elements of arr[0..i-1] that are greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place key at the correct position
            arr[j + 1] = key;
        }
    }
}
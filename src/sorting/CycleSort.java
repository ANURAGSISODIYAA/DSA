package src.sorting;

import java.util.Arrays;

public class CycleSort {
    // Time complexity - O(n)
    // if [0 to N] -----> value = index
    // if [1 to N] -----> value = index-1

    public static void main(String[] abc) {
        int[] arr = {5, 3, 4, 1, 2};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cycle(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}

package src.sorting;
import java.util.Arrays;

public class BubbleSort {

     // Time complexity - O(n^2)

    public static void main(String[] args) {
        int[] nums = {5, 3, 2, 4, 1};
        bubble(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void bubble(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j - 1, j);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;

            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

package day3;

import java.util.Arrays;

public class Moveszeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        int n = arr.length;
        int index = 0; // track non-zero position
        int i;         // loop variable

        // move non-zero elements forward
        for (i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // fill remaining positions with zero
        for (i = index; i < n; i++) {
            arr[i] = 0;
        }

        System.out.println("Array after moving zeroes: " + Arrays.toString(arr));
    }
}

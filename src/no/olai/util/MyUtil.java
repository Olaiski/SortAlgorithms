package no.olai.util;

import java.util.Arrays;

public class MyUtil {


    /**
     *
     * @return sets and returns int array for use throughout the exercises
     */
    public static int[] getIntArray() {
        return new int[]{20, 35, -15, 7, 55, 1, -22};
    }

    /**
     *
     * @param arr input array
     * @param i index for swap
     * @param j index for swap
     */
    public static void swap(int[] arr, int i, int j) {

        if (i == j) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

}

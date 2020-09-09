package no.olai.bubblesort;

import no.olai.util.MyUtil;

import java.util.Arrays;

/**
 * Bubble Sort
 *  Degrades quickly
 *  Partitions the array into a sorted partition and unsorted partition
 *
 *  In place algorithm, stable sort.
 *  O (n^2) time complexity - Quadratic, one of the least efficient sort algorithms.
 *
 */

public class BubbleSortMain {

    public static void main(String[] args) {

        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }



    private static void bubbleSort(int[] arr) {

        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (arr[i] > arr[i + 1]) {
                    MyUtil.swap(arr, i, i + 1);
                }
            }
        }
    }



}

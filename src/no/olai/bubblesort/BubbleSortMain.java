package no.olai.bubblesort;

import no.olai.util.MyUtil;

import java.util.Arrays;

/**
 * Bubble Sort
 *
 *  Degrades quickly
 *  Partitions the array into a sorted partition and unsorted partition
 *  "Bubbles" from left to right / bottom to top
 *
 * Info:
 *  - In place algorithm, stable sort.
 *  - O(n^2) time complexity - Quadratic, one of the least efficient sort algorithms.
 *
 */

public class BubbleSortMain {

    public static void main(String[] args) {

        int[] arr = MyUtil.getIntArray();

        MyUtil.printArray(arr);

        bubbleSort(arr);

        MyUtil.printArray(arr);
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

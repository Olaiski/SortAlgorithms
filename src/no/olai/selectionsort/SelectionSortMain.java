package no.olai.selectionsort;

import no.olai.util.MyUtil;

import java.util.Arrays;

/**
 * Selection Sort
 *  Traverse array, look for largest element, swap it with the
 *  last element in the unsorted partition. At that point, swapped
 *  element will be in it's correct sorted position.
 *
 *  In place Algorithm
 *  O(n^2) - Quadratic, generally less swapping than Bubble Sort.
 *  Unstable algorithm
 */

public class SelectionSortMain {
    public static void main(String[] args) {

        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        System.out.println(Arrays.toString(arr));

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));

    }

    private static void selectionSort(int[] arr) {

        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (arr[i] > arr[largest]) largest = i;
            }
            MyUtil.swap(arr, largest, lastUnsortedIndex);
        }

    }
}

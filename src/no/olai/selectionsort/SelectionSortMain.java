package no.olai.selectionsort;

import no.olai.util.MyUtil;

import java.util.Arrays;

/**
 * Selection Sort
 *
 *  Traverse array, look for largest element, swap it with the
 *  last element in the unsorted partition. At that point, swapped
 *  element will be in it's correct sorted position.
 *
 * Info:
 *  - In place Algorithm
 *  - O(n^2) - Quadratic, generally less swapping than Bubble Sort.
 *  - Unstable algorithm
 */

public class SelectionSortMain {
    public static void main(String[] args) {

        int[] arr = MyUtil.getIntArray();

        MyUtil.printArray(arr);

        selectionSort(arr);

        MyUtil.printArray(arr);

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

package no.olai.insertionsort;

import no.olai.util.MyUtil;

import java.util.Arrays;


/**
 * Insertion Sort
 *
 *  This impl. grows assorted position from left to right
 *
 *  First iteration the element position 0 is in the sorted partition.
 *  Elements from 1 into the right is in the unsorted partition. (firstUnsortedIndex = 1)
 *  Each iteration, take first element in unsorted partition and insert it into the sorted partition.
 *   (grows by 1 for each iteration)
 *
 *  Insert: Compare the value with the values in the sorted partition, traverse the sorted
 *  partition from right to left, look for value that is <= to the one we're trying to insert.
 *  Shift values arr[i] = arr [i - 1]
 *
 * Info:
 *  - In place algorithm
 *  - O(n^2) - Quadratic (100 steps, 10 items. 1000 steps, 100 items etc..)
 *  - Stable algorithm
 *
 */

public class InsertionSortMain {
    public static void main(String[] args) {

        int[] arr = MyUtil.getIntArray();

        MyUtil.printArray(arr);

        insertionSort(arr);

        MyUtil.printArray(arr);

    }

    private static void insertionSort(int[] arr) {

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {
            int newElement = arr[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && arr[i - 1] > newElement; i--) {
                arr[i] = arr[i - 1]; // Shifting..
            }
            arr[i] = newElement;
        }
    }

}

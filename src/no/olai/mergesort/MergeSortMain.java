package no.olai.mergesort;


import no.olai.util.MyUtil;

import java.util.Arrays;

/**
 * Merge Sort
 *
 *  Recursive, divide and conquer algorithm.
 *  Two phases: Splitting and merging
 *  Splitting phase leads to faster sorting during the merging phase
 *  Splitting is logical. Don't create new arrays.
 *
 * Splitting phase
 *  - Start with unsorted array
 *  - Divide array into two arrays, unsorted. First array left, second right.
 *  - Split the left and right arrays into two arrays each.
 *  - Keep splitting until the arrays have only one element each, by default they are sorted.
 *
 * Merging phase
 *  - Merge every left/right pair of sibling arrays into a sorted array
 *  - After first merge, we'll have a bunch of 2-element sorted arrays
 *  - Then merge those sorted arrays (left/right siblings) to end up with 4 element sorted arrays
 *  - Repeat until you have a single sorted array
 *  - Not in-place. Uses temp arrays
 *
 * Info:
 *  - Not in-place algorithm
 *  - O(nlogn) - Base 2. Repeatedly dividing the array in half during splitting phase
 *  - Stable algorithm
 *
 */

public class MergeSortMain {
    public static void main(String[] args) {

        int[] arr = MyUtil.getIntArray();

        MyUtil.printArray(arr);

        mergeSort(arr);

        MyUtil.printArray(arr);

    }
    private static void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length);
    }

    private static void mergeSort(int[] arr, int start, int end) {

        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);

        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {

        if (arr[mid - 1] <= arr[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            // If arr[i] <= arr[j], assign arr[i] to the current position in temp
            // and then increment i and temp index
            // If arr[j] is the smaller, then we'll write the element in the
            // right position and increment j and temp index.
            temp[tempIndex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        System.arraycopy(arr, i, arr, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, arr, start, tempIndex);

        // Key ting to understand: When we're merging a partition,
        // we're gonna copy the merged values back into those same positions.
    }


}

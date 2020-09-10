package no.olai.shellsort;

import no.olai.util.MyUtil;

import java.util.Arrays;


/**
 * Shell Sort
 *
 *  Variation of insertion sort.
 *  Starts with a larger gap value, as the algorithm runs, the gap is reduced.
 *  Goal is to reduce the amount of shifting required.
 *
 *  Last gap value is always 1, equivalent to insertion sort.
 *  Algorithm preliminary work ( gap > 1 ), then becomes insertion sort.
 *  By the time we get to insertion sort, the array has been partially sorted, so there's less shifting required.
 *
 *  Common way to calculate gap: Knuth Sequence.
 *  In this impl. we'll base gap on the array length. Init. arr.length / 2.
 *  Each iteration, divide gap value by 2 to get the next gap value.
 *
 * Info:
 *  - In place algorithm
 *  - Difficult to get time complexity right, depends on the gap. Worst case is O(n^2), but can perform much better.
 *  - Unstable algorithm
 *
 */

public class ShellSortMain {
    public static void main(String[] args) {

        int[] arr = MyUtil.getIntArray();

        System.out.println(Arrays.toString(arr));

        shellSort(arr);

        System.out.println(Arrays.toString(arr));

    }

    private static void shellSort(int[] arr) {

        for (int gap = arr.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < arr.length; i++) {
                int newElement = arr[i];

                int j = i;

                while (j >= gap && arr[j - gap] > newElement) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = newElement;
            }
        }
    }


}

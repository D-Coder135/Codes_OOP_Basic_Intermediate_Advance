/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 25-01-2022/01/2022
 *   Time: 12:35 PM
 *   File: XXIX_ThreeWayPartitioning
 */

/**
 * Given an array of size n and a range [a, b]. The task is to partition the array around the range such
 * that array is divided into three parts.
 * <p>
 * 1) All elements smaller than a come first.
 * 2) All elements in range a to b come next.
 * 3) All elements greater than b appear in the end.
 * The individual elements of three sets can appear in any order. You are required to return the modified array.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * n = 5
 * A[] = {1, 2, 3, 3, 4}
 * [a, b] = [1, 2]
 * Output: 1
 * Explanation: One possible arrangement is:
 * {1, 2, 3, 3, 4}. If you return a valid
 * arrangement, output will be 1.
 */

package final450DSA.arrays;

public class XXIX_ThreeWayPartitioning {

    public void threeWayPartition(int[] array, int a, int b) {
        int start = 0;
        int end = array.length - 1;

        for (int i = 0; i <= end; i++) {
            if (array[i] < a) {
                swap(i, start, array);
                start++;
            } else {
                if (array[i] > b) {
                    swap(i, end, array);
                    end--;
                    i--;
                }
            }
        }
    }

    public void swap(int a, int b, int[] array) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
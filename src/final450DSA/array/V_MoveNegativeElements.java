/**
 * Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative
 * element at the end of array without changing the order of positive element and negative element.
 * <p>
 * Example 1:
 * <p>
 * Input :
 * N = 8
 * arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
 * Output :
 * 1  3  2  11  6  -1  -7  -5
 */

package final450DSA.array;

import java.util.ArrayList;

public class V_MoveNegativeElements {

    public void segregateElements(int[] arr, int n) {
        // Your code goes here
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                list.add(arr[i]);
            } else {
                arr[index] = arr[i];
                index++;
            }
        }
        index = n - list.size();

        for (Integer integer : list) {
            arr[index] = integer;
            index++;
        }
    }

}

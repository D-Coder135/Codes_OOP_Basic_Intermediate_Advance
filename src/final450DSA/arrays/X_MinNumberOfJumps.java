/**
 * Given an array of N integers arr[] where each element represents the max number of steps that can be
 * made forward from that element. Find the minimum number of jumps to reach the end of the array
 * (starting from the first element). If an element is 0, then you cannot move through that element.
 * <p>
 * Note: Return -1 if you can't reach the end of the array.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 11
 * arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
 * Output: 3
 * Explanation:
 * First jump from 1st element to 2nd
 * element with value 3. Now, from here
 * we jump to 5th element with value 9,
 * and from here we will jump to last.
 */


package final450DSA.arrays;

public class X_MinNumberOfJumps {
    static int minJumps(int[] arr) {
        // your code here
        int currfar = 0, currend = 0, jumps = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            currfar = Math.max(currfar, i + arr[i]);

            if (i == currend) {
                jumps++;
                currend = currfar;
            }

            if (currend >= arr.length - 1) {
                break;
            }
        }
        if (currend < arr.length - 1) {
            return -1;
        } else {
            return jumps;
        }
    }
}

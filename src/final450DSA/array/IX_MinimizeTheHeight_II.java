/**
 * Given an array arr[] denoting heights of N towers and a positive integer K, you have to modify the height of each
 * tower either by increasing or decreasing them by K only once. After modifying, height should be a non-negative
 * integer. Find out the minimum possible difference of the height of shortest and longest towers after
 * you have modified each tower.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * K = 2, N = 4
 * Arr[] = {1, 5, 8, 10}
 * Output:
 * 5
 * Explanation:
 * The array can be modified as
 * {3, 3, 6, 8}. The difference between
 * the largest and the smallest is 8-3 = 5.
 */


package final450DSA.array;

import java.util.Arrays;

public class IX_MinimizeTheHeight_II {

    int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int ans = (arr[n - 1] + k) - (arr[0] + k);

        int tempMax = arr[n - 1] - k;

        int tempMin = arr[0] + k;

        int max, min;

        for (int i = 0; i < n - 1; i++) {
            max = Math.max(tempMax, arr[i] + k);
            min = Math.min(tempMin, arr[i + 1] - k);

            if (min >= 0) {
                ans = Math.min(ans, max - min);
            } else {
                min = arr[0] + k;
            }
        }
        return ans;
    }

}
/*
* static int minJumps(int[] arr){
        // your code here
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            i = arr[i];
        }
        if(sum >= arr.length) {
            return sum;
        } else {
            return -1;
        }
    }*/
package final450DSA.array;

import java.util.Arrays;

public class IX_MinimizeTheHeight_I {

    int getMinDiff(int[] arr, int n, int k) {
        // code here
        int minDiff = 0;

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (i < n / 2) {
                arr[i] = arr[i] + k;
            } else {
                arr[i] = arr[i] - k;
            }
        }
        minDiff = arr[n - 1] - arr[0];
        return minDiff;
    }

}

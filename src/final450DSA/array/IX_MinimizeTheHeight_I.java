package final450DSA.array;

import java.util.Arrays;

public class IX_MinimizeTheHeight_I {

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

            ans = Math.min(ans, max - min);
        }
        return ans;
    }

}

/**
 * Given an array, rotate the array by one position in clock-wise direction.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 5
 * A[] = {1, 2, 3, 4, 5}
 * Output:
 * 5 1 2 3 4
 */


package final450DSA.array;

public class VII_RotateClockwise {
    public void rotate(int[] arr, int n) {
        int temp = arr[n - 1];

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
    }
}

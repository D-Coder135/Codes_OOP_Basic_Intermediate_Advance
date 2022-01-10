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

        System.arraycopy(arr, 0, arr, 1, n - 1);
        arr[0] = temp;
    }
}

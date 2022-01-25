/**
 * Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
 * <p>
 * Example 1:
 * Input:
 * N = 5
 * arr[]= {0 2 1 2 0}
 * Output:
 * 0 0 1 2 2
 * Explanation:
 * 0s 1s and 2s are segregated
 * into ascending order.
 */


package final450DSA.arrays;

public class IV_Sort012 {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sort012(int[] a, int n) {
        // code here
        int low = 0, mid = 0, high = a.length - 1;

        while (mid <= high) {
            switch (a[mid]) {
                case 0 -> {
                    swap(a, low, mid);
                    low++;
                    mid++;
                }
                case 1 -> mid++;
                case 2 -> {
                    swap(a, mid, high);
                    high--;
                }
            }
        }
    }
}

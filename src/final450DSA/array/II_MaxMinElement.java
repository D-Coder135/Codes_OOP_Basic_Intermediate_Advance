/**
 * Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 6
 * A[] = {3, 2, 1, 56, 10000, 167}
 * Output:
 * min = 1, max =  10000
 */


package final450DSA.array;

import java.util.Arrays;

public class II_MaxMinElement {
    static class Pair {
        long first, second;

        public Pair(long first, long second) {
            this.first = first;
            this.second = second;
        }
    }

    static Pair getMinMax(long[] a, long n) {
        Arrays.sort(a);
        long min = a[0];
        long max = a[(int) (n - 1)];
        return (new Pair(min, max));
    }
}

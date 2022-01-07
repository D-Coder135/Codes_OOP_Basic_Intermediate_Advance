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
    }
}

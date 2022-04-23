/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 23-04-2022/04/2022
 *   Time: 10:38 PM
 *   File: MergeOverlappingIntervals
 */

package final450DSA.stackAndQueues;

public class MergeOverlappingIntervals {
    static class Solution {
        public int[][] merge(int[][] intervals) {
            Pair[] pairs = new Pair[intervals.length];
            //return ans.toArray(new int[0][]);
        }

        public static class Pair implements Comparable<Pair> {
            int start;
            int end;

            public Pair(int start, int end) {
                this.start = start;
                this.end = end;
            }

            @Override
            public int compareTo(Pair other) {
                if (this.start != other.start) {
                    return this.start - other.start;
                } else {
                    return this.end - other.end;
                }
            }
        }

    }
}

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
                return 0;
            }
        }

    }
}

/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 23-04-2022/04/2022
 *   Time: 10:38 PM
 *   File: MergeOverlappingIntervals
 */

package final450DSA.stackAndQueues;

import java.util.Arrays;
import java.util.Stack;

public class MergeOverlappingIntervals {
    static class Solution {
        public int[][] merge(int[][] intervals) {
            Pair[] pairs = new Pair[intervals.length];
            for (int i = 0; i < intervals.length; i++) {
                pairs[i] = new Pair(intervals[i][0], intervals[i][1]);
            }
            Stack<Pair> st = new Stack<>();
            for (int i = 0; i < pairs.length; i++) {
                if (i == 0) {
                    st.push(pairs[i]);
                } else {
                    Pair top = st.peek();

                    if (pairs[i].start > top.end) {
                        st.push(pairs[i]);
                    }
                }
            }

            //return ans.toArray(new int[0][]);
        }

        public static class Pair {
            int start;
            int end;

            public Pair(int start, int end) {
                this.start = start;
                this.end = end;
            }

//            @Override
//            public int compareTo(Pair other) {
//                if (this.start != other.start) {
//                    return this.start - other.start;
//                } else {
//                    return this.end - other.end;
//                }
//            }
        }

    }
}

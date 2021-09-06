/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 06/09/21
 *   Time: 7:11 PM
 *   File: TwoSum.java
 */

package leetCodes;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 3};
        int target = 6;
        int[] resultantArray = twoSum(nums, target);
        System.out.println(Arrays.toString(resultantArray));
    }

    public static int[] twoSum(int[] nums, int target) {
        int size = 2;
        int[] resultantArray = new int[size];
        int j = 0;
        while (j < nums.length) {
            for (int index = 1; index < nums.length; index++) {
                int element = nums[j];
                if ((element + nums[index]) == target && index != j) {
                    resultantArray[0] = j;
                    resultantArray[1] = index;
                }
            }
            j++;
        }
        if (!Arrays.toString(resultantArray).isEmpty()) {
            return resultantArray;
        } else {
            return null;
        }
    }
}

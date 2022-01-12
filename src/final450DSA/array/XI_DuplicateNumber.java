/**
 * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
 * There is only one repeated number in nums, return this repeated number.
 * You must solve the problem without modifying the array nums and uses only constant extra space.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,3,4,2,2]
 * Output: 2
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [3,1,3,4,2]
 * Output: 3
 */

package final450DSA.array;

public class XI_DuplicateNumber {

    public int findDuplicate(int[] nums) {
        boolean[] booleanArray = new boolean[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (booleanArray[nums[i]]) {
                return nums[i];
            }
            booleanArray[nums[i]] = true;
        }
    }
}

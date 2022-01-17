/**
 * Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
 * If such an arrangement is impossible, it must rearrange it to the lowest possible order (i.e., sorted in ascending order).
 * The replacement must be in place and use only constant extra memory.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3]
 * Output: [1,3,2]
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [3,2,1]
 * Output: [1,2,3]
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [1,1,5]
 * Output: [1,5,1]
 */


package final450DSA.array;

public class XIV_NextPermutation {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 1;
        int j = nums.length - 1;

        while (i > 0 && nums[i] <= nums[i - 1]) {
            i--;
        }
        if (i > 0) {
            while (j > 0 && nums[j] <= nums[i - 1]) {
                j--;
            }
            swap(nums, i - 1, j);
        }
        reverse(nums, i, nums.length - 1);
    }

    private void reverse(int[] nums, int i, int j) {
        if (i < j) {

        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

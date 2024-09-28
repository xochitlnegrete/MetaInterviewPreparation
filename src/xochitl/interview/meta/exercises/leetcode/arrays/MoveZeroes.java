/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
* */

package xochitl.interview.meta.exercises.leetcode.arrays;

public class MoveZeroes {
    public static void main(String[] args) {

        moveZeroes2(new int[]{0,1,0,3,12});
    }

    public static void moveZeroes(int[] nums) {
        int zeroes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroes++;
            } else {
                nums[i - zeroes] = nums[i];
            }
        }

        if (zeroes > 0) {
            for (int i = nums.length - zeroes; i < nums.length; i++) {
                nums[i] = 0;
            }
        }

        for (int i : nums) {
            System.out.print(i);
        }
    }

    public static void moveZeroes2(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != index) {
                    nums[index] = nums[i];
                    nums[i] = 0;
                }
                index++;
            }
        }
        for (int i : nums) {
            System.out.print(i + ",");
        }
    }
}

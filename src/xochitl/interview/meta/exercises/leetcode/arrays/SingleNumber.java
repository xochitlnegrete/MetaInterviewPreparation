/*
* Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
*/package xochitl.interview.meta.exercises.leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1,1,2,2,4}));
    }

    public static int singleNumber(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for (int num : nums) {
            if (numbers.contains(num)) {
                numbers.remove(num);
            } else {
                numbers.add(num);
            }
        }
        return numbers.iterator().next();
    }
}

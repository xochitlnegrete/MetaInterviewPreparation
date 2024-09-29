/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
* */

package xochitl.interview.meta.exercises.leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] result = twoSum2(new int[]{2,7,11,15}, 9);

        if (result == null) System.out.println("No possible answer");
        else {
            PrintArray.printArray(result);
        }
    }

    public static int[] twoSum(int[] nums, int target){
        if (nums.length < 2)    {
            return null;
        }
        if (nums.length == 2)    {
            if (nums[0] + nums[1] != target)    return null;
            else return new int[]{1,0};
        }

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int n1 = nums[i];
                int n2 = nums[j];
                System.out.printf("[%d] + [%d] = %d\n", n1, n2, n1 +n2);
                if (n1 + n2 == target)  return new int[]{i, j};
            }
        }
        return null;
    }

    public static int[] twoSum2(int[] nums, int target){
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if(hashMap.containsKey(complement)){
                return new int[]{i, hashMap.get(complement)};
            }
            hashMap.put(nums[i], i);
        }

        return null;
    }
}
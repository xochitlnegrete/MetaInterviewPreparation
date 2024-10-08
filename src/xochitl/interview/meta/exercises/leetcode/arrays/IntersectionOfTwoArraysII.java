/*
* Given two integer arrays nums1 and nums2, return an array of their intersection. 
Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
*/package xochitl.interview.meta.exercises.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
    int[] array = intersect(new int[]{1,1,2,2}, new int[]{2,2});

    for (int i : array) {
      System.out.println(i);
    }
  }

  public static int[] intersect(int[] nums1, int[] nums2) {
    if(nums1.length == nums2.length && nums1.length == 0) return new int[]{};
    
        ArrayList<Integer> output = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
          for (int j = 0; j < nums2.length; j++) {
            if(nums1[i] == nums2[j])  {
              output.add(nums1[i]);
              nums2[j] = -1;
              break;
            }
          }
        }

        int[] intArray = new int[output.size()];
            for (int i = 0; i < output.size(); i++) {
                intArray[i] = output.get(i);
            }
        return intArray;
  }
}

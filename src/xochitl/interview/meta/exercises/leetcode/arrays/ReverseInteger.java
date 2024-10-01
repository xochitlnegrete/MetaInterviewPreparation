/*
Given a signed 32-bit integer x, return x with its digits reversed. 
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:
Input: x = 123
Output: 321

Example 2:
Input: x = -123
Output: -321

Example 3:
Input: x = 120
Output: 21
* */

package xochitl.interview.meta.exercises.leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }

    public static int reverse(int num) {
        int result = 0;
        while(num > 10) {
          result = result * 10 + num % 10;
          num = num / 10;
        }
        result = result * 10 + num;

        return result;
    }
}

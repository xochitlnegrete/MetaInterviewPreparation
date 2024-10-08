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

package xochitl.interview.meta.exercises.leetcode.strings;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }

    public static int reverse(int num) {
        long result = 0;
        while(num != 0) {
          result = result * 10 + num % 10;
          num = num / 10;
        }

        return (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) ? 0 : (int) result;
    }
}

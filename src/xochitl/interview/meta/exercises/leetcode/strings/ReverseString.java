package xochitl.interview.meta.exercises.leetcode.strings;

/*
Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
* */

import xochitl.interview.meta.exercises.leetcode.arrays.PrintArray;

public class ReverseString {
    public static void main(String[] args) {
        reverseString(new char[]{'h','e','l','l','o'});
    }

    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length/2; i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }

        PrintArray.printArray(s);
    }
}

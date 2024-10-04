/*
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.

Example 2:
Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
* */

package xochitl.interview.meta.exercises.leetcode.strings;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
    }

    public static int strStr(String haystack, String needle) {
        if(haystack.equals(needle)) return 0;
        if(needle.length() > haystack.length()) {
          return -1;
        }
        
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
          String temp = haystack.substring(i, i + needle.length());
          if(temp.equals(needle)) {
            return i;
          }
        }
        return -1;
    }
}

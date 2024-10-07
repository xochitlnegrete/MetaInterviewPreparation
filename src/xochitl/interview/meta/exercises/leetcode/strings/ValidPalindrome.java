/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, 
it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
* */

package xochitl.interview.meta.exercises.leetcode.strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(validPalindrome("race a car"));
    }

    public static boolean validPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        for (int i = 0; i < s.length() / 2; i++) {
          if(s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
          }
        }
        return true;
    }
}

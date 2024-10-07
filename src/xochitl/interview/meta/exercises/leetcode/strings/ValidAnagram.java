/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false
* */

package xochitl.interview.meta.exercises.leetcode.strings;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("car", "car"));
    }
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())   return false;
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        for (char c : s.toCharArray())  {
            if(mapS.containsKey(c)) {
                mapS.put(c, mapS.get(c) + 1);
            }
            else {
                mapS.put(c, 1);
            }
        }

        for (char c : t.toCharArray())  {
            if(mapT.containsKey(c)) {
                mapT.put(c, mapT.get(c) + 1);
            }
            else {
                mapT.put(c, 1);
            }
        }

        return mapS.equals(mapT);
    }
}

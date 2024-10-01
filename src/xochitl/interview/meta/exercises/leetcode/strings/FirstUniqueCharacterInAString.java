package xochitl.interview.meta.exercises.leetcode.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("ooo"));
    }
    public static int firstUniqChar(String s) {
        s = s.toLowerCase();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if(map.containsKey(currentChar))    {
                map.replace(currentChar, -1);
            }
            else {
                map.put(s.charAt(i), i);
            }
        }

        for (Integer value : map.values()) {
            if(value != -1)  return value;
        }

        return -1;
    }
}

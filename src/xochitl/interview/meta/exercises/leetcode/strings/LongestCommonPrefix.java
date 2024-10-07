/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
* */

package xochitl.interview.meta.exercises.leetcode.strings;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        int i = 0;
        int iString = 0;
        String output = "";
        char c = ' ';

        while(i < strs.length)  {
          //System.out.println("i: " + i);
          if(strs[i].length() > iString)  {
            //System.out.println("compare: " + strs[i].charAt(iString));
            if(i == 0)  {
              c = strs[i].charAt(iString);
              output = output.concat(String.valueOf(c));
            }
            else {
              if(strs[i].charAt(iString) != c)  {
                  if(iString == 0)    return "";
                  output = output.substring(0, iString);
                  return output;
              }
            }
            if(i == strs.length - 1)  {
                  iString++;
                  i = 0;
                }
            else  i++;
          }
          else  return output.substring(0, iString);
        }
        
        return  output;
    }
}

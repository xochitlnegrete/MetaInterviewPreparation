package xochitl.interview.meta.exercises.leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class ContainsDuplicates {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,4,5,6,7,}));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                System.out.println("The repeated value is: " + num);
                return true;
            }
        }

        return false;
    }

    public static boolean containsDuplicate2(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return Arrays.stream(nums)
                .filter(num -> map.put(num, map.getOrDefault(num, 0) + 1) == null)
                .findFirst()
                .isPresent();
    }

    public boolean containsDuplicate3(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();

        for (int num : nums) {
            if (!numbers.add(num)) {
                return true;
            }
        }

        return false;
    }
}

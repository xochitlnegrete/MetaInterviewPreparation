/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
* */

package xochitl.interview.meta.exercises.leetcode.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RotateArray {
    public static void main(String[] args) {
        rotate4(new int[]{1,2,3,4,5,6,7}, 3);
    }

    public static void rotate(int[] nums, int k) {
        int[] output = new int[nums.length];
        int counter = 0;

        for (int i = nums.length - k; i < nums.length; i++) {
            output[counter] = nums[i];
            counter++;
        }

        for (int i = 0; i < nums.length - k; i++) {
            output[counter] = nums[i];
            counter++;
        }

        System.out.println(Arrays.toString(output));
    }

    public static void rotate2(int[] nums, int k) {
        int i = nums.length - k;
        int[] output = new int[nums.length];
        int cont = 0;

        do{
            output[cont] = nums[i];
            cont++;
            if (i == nums.length - 1)   {
                i = 0;
            }
            else {
                i++;
            }
        }while (i != nums.length - k);

        System.out.println(Arrays.toString(output));
    }

    public static void rotate3(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Asegurarse de que k no exceda n

        // Usamos IntStream para crear un nuevo arreglo rotado
        int finalK = k;
        int[] output = IntStream.range(0, n)
                .map(i -> nums[(i + n - finalK) % n]) // Calculamos el índice rotado
                .toArray();

        System.out.println(Arrays.toString(output));
    }

    public static void rotate4(int[] nums, int k) {
        int n = nums.length;
        int[] output = new int[n];
        int startIndex = n - k;

        for (int j = 0; j < n; j++) {
            output[j] = nums[(startIndex + j) % n];
        }

        System.out.println(Arrays.toString(output));
    }
}

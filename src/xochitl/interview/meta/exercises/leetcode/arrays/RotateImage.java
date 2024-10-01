package xochitl.interview.meta.exercises.leetcode.arrays;

import java.util.ArrayList;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
    }
    public static void rotate(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int[] row : matrix)    {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

package xochitl.interview.meta.exercises.leetcode.arrays;

public class PlusOne {
    public static void main(String[] args) {

        int[] result = plusOne(new int[]{0});

        for (int i : result) {
            System.out.print(i);
        }
    }

    public static int[] plusOne(int[] digits) {
        if (digits.length == 0) return new int[]{};

        boolean flag = true;//flag = if we have a pending 1 to add
        int i = digits.length - 1;//it starts to evaluate every digit since the last element until the first one

        do {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0; //9 + 1 means flag = true and add 0
            }
            i--;
            //if it's the first digit and there's a pending one to add
            if (i == -1) {
                int[] result = new int[digits.length + 1];
                //it needs to add a 1 at left
                result[0] = 1;
                //and then copy the rest at right
                System.arraycopy(digits, 0, result, 1, digits.length - 1);

                return result;
            }

        } while (true);
    }

    public static int[] plusOne2(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                // It just increases that number and returns it
                digits[i]++;
                return digits;
            }
            // if it's 9 it needs to replace it for a 0
            digits[i] = 0;
        }

        // If it comes to here is because all digits are 9 and creates a new array with 1 and the rest are 0's
        int[] result = new int[n + 1];
        result[0] = 1; // Added 1 at the beginning
        return result;
    }
}

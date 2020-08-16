import java.util.Arrays;

public class TwoDArray {
    public static void main(String args[]) {

        final int NUM_ROWS = 5;
        final int MAX_COLS = NUM_ROWS;

        int[][] nums = new int[NUM_ROWS][];

        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            nums[i] = new int[NUM_ROWS - i];
        }

        System.out.println(Arrays.toString(nums[0]));
        System.out.println(Arrays.toString(nums[1]));
        System.out.println(Arrays.toString(nums[2]));
        System.out.println(Arrays.toString(nums[3]));
        System.out.println(Arrays.toString(nums[4]));
        System.out.println(Arrays.toString(nums));
    }
}
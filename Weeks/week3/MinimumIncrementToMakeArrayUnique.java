import java.util.Arrays;

public class MinimumIncrementToMakeArrayUnique {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);

        int counter = 0;

        if (nums.length == 1) {
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {

            if (nums[i - 1] >= nums[i]) {
                counter += (nums[i - 1] - nums[i]) + 1;
                nums[i] += (nums[i - 1] - nums[i]) + 1;

            }

        }
        return counter;
    }
}

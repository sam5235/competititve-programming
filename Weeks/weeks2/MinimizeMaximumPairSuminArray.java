import java.util.Arrays;

public class MinimizeMaximumPairSuminArray {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int sumPair ;
        int i = 0;
        int j = nums.length - 1;
        int max = 0;
        while (i < nums.length / 2) {
            sumPair = nums[i] + nums[j];
            max = Math.max(max, sumPair);
            i++;
            j--;
        }
       
        return max;
    }
}

import java.util.Arrays;

public class FrequencyOfTheMostFrequentElement {

    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int cost = 0;
        int length = 1;
        int i = 0;
        int j = 0;
        int freq = 0;
        while (j < nums.length - 1) {
            if (cost <= k) {
                freq = Math.max(freq, length);
                length++;
                cost += (nums[j + 1] - nums[j]) * (length - 1);
                j++;
            } else {

                cost -= nums[j] - nums[i];
                length--;
                i++;
            }
        }
        if (cost <= k) {
            freq = Math.max(freq, length);
        }
        return freq;
    }
}

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> frequency = new HashMap<>();

        for (int num : nums) {
            if (frequency.containsKey(num)) {
                frequency.put(num, frequency.get(num) + 1);
            } else
                frequency.put(num, 1);

        }
        // System.out.println(frequency);

        int[][] arr = new int[nums.length][2];
        int i = 0;
        for (int num : frequency.keySet()) {
            int occurance = frequency.get(num);
            arr[i][0] = num;
            arr[i][1] = occurance;
            i++;
        }

        Arrays.sort(arr, (a, b) -> b[1] - a[1]);
        // System.out.println(arr);
        int[] result = new int[k];
        for (int j = 0; j < k; j++) {
            result[j] = arr[j][0];
        }
        return result;
    }
}

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindOriginalArrayFromDoubledArray {

    public int[] findOriginalArray(int[] changed) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : changed) {
            if (freq.containsKey(num)) {
                freq.put(num, freq.get(num) + 1);
            } else
                freq.put(num, 1);
        }
        int[] original = new int[changed.length / 2];
        int[] empty = {};
        int k = 0;
        Arrays.sort(changed);
        if (changed.length % 2 == 0) {
            for (int num : changed) {
                if (freq.containsKey(num)) {
                    if (num == 0 && freq.get(0) % 2 != 0) {
                        break;
                    }
                    if (freq.containsKey(num * 2)) {
                        if (freq.get(num * 2) > 1) {
                            freq.put(num * 2, freq.get(num * 2) - 1);
                        } else {
                            freq.remove(num * 2);
                        }
                        original[k] = num;
                        k++;

                        if (freq.get(num) > 1) {
                            freq.put(num, freq.get(num) - 1);
                        } else
                            freq.remove(num);
                    }
                }

              
            }
            System.out.println(freq);
            if (freq.isEmpty()) {
                return original;
            } else
                return empty;

        } else
            return empty;

    }

    
}

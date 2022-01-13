import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    class Solution {
        public String largestNumber(int[] nums) {
            String[] strings = new String[nums.length];
            for (int i = 0; i < nums.length; i++) {
                strings[i] = String.valueOf(nums[i]);
            }

            Arrays.sort(strings, new Comparator<String>() {
                public int compare(String a, String b) {
                    return compare(a, b, 0);
                }

                int compare(String a, String b, int idx) {
                    if (idx % a.length() == 0 && idx % b.length() == 0 && idx != 0) {
                        return 0;
                    }
                    if (b.charAt(idx % b.length()) > a.charAt(idx % a.length())) {
                        return 1;
                    } else if (b.charAt(idx % b.length()) < a.charAt(idx % a.length())) {
                        return -1;
                    }
                    return compare(a, b, idx + 1);
                }

            });

            if (strings[0].equals("0")) {
                return "0";
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < strings.length; i++) {
                sb.append(strings[i]);
            }
            String answer = sb.toString();
            return answer;
        }

    }
}

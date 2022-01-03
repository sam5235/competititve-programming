import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class ArithmeticSubarrays {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> bool = new ArrayList<>();
       
        for (int k = 0; k < l.length ; k++) {
            List<Integer> subArth = new ArrayList<>();
            for (int i = l[k]; i <= r[k]; i++) {
                subArth.add(nums[i]);
            }
            Collections.sort(subArth);
            int diff = subArth.get(1) - subArth.get(0);
            boolean val  = true;
            for (int i = 0; i < subArth.size()-1; i++) {
                if (subArth.get(i + 1) - subArth.get(i) != diff) {
                  val = false;
                    break;
                }
            
            }
            bool.add(val);
        }
        return bool;
    }
}

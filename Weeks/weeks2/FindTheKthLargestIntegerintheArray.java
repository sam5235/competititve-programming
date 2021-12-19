import java.util.Arrays;
import java.util.Comparator;

public class FindTheKthLargestIntegerintheArray {
  public String kthLargestNumber(String[] nums, int k) {
    Arrays.sort(nums, new Comparator<String>() {
      public int compare(String a, String b) {
        if (a.length() == b.length()) {
          for (int i = 0; i < a.length(); i++) {

            if (a.charAt(i) > b.charAt(i)) {
              return -1;
            } else if (a.charAt(i) < b.charAt(i)) {
              return 1;
            }
          }
        } else {
          if (a.length() > b.length()) {
            return -1;
          } else
            return 1;
        }
        return 0;
      }
    });
    System.out.println(Arrays.toString(nums));
    return nums[k - 1];
  }

}

public class SearchInsert {
            public int searchInsert(int[] nums, int target) {
            Integer start = 0;
            Integer end = nums.length;
            while (start < end) {
                Integer mid = (start + end) / 2;
                if(target <= nums[mid]) {
                    end = mid;
                } else if (target > nums[mid]) {
                    start = mid + 1;
                }
            }
            return start;
        }
    }


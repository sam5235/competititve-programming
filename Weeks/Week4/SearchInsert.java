public class SearchInsert {
            public int searchInsert(int[] nums, int target) {
            int start = 0;
            int end = nums.length;
            while (start < end) {
                int mid = (start + end) / 2;
                if(target <= nums[mid]) {
                    end = mid;
                } else if (target > nums[mid]) {
                    start = mid + 1;
                }
            }
            return start;
        }
            }


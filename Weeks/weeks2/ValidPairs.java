public class ValidPairs {
    public int numIdenticalPairs(int[] nums) {
        int max = 0;
        for (int num:nums){
            max = Math.max(max, num);
            }
        int pair = 0;
        int[] countArray = new int[max - 1];
        for(int num:nums){
            pair += countArray[num];
            countArray[num]++;
        }
        return pair;
        }
    }


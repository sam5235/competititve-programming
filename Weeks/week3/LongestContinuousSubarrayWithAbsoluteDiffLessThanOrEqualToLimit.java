import java.util.ArrayDeque;
import java.util.Deque;

public class LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit{
    
            
     public int longestSubarray(int[] nums, int limit) {
        int i = 0;
        int j = 0;
        int length = 1;
        Deque<Integer> dq_min = new ArrayDeque<Integer>();
        Deque<Integer> dq_max = new ArrayDeque<>();
        int frontMin, frontMax;
        
        while(j < nums.length){
               
                
                     while(!dq_min.isEmpty() &&dq_min.peekLast() > nums[j] ){
                     dq_min.pollLast();
                    
                     }
                     dq_min.addLast(nums[j]);
                     while(!dq_max.isEmpty()  && dq_max.peekLast() < nums[j]){
                          dq_max.pollLast();
                    
                     }
                     dq_max.addLast(nums[j]);
                frontMin = dq_min.peekFirst();
            frontMax = dq_max.peekFirst();
            while(Math.abs(frontMax - frontMin) > limit){
               
                
                if(nums[i] ==  frontMin){
                     dq_min.pollFirst();
                    frontMin = dq_min.peekFirst();
                }
                 if(nums[i] ==  frontMax){
                     dq_max.pollFirst();
                     frontMax = dq_max.peekFirst();
                     
                }
                
                i++;
                 
                  
        }
            length  = Math.max(length, (j-i)+1);
            j++;
        
        }
            
     

    return length;
    }
}
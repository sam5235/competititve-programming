import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI {
    
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            Stack<Integer> nextGreat = new Stack<>();
        
            Map<Integer, Integer> next = new HashMap<>();
            
            
            
             for (int i =  0; i < nums2.length; i++){
                 if(nextGreat.isEmpty()){
                     nextGreat.push(i);
                 }else if (nums2[nextGreat.peek()]> nums2[i]){
                     nextGreat.push(i);    
                     
                 }else {
                     while(!nextGreat.isEmpty() && (nums2[nextGreat.peek()]<nums2[i])){
                      
                         next.put(nums2[nextGreat.peek()],  nums2[i]);
                         nextGreat.pop();
                         
                     }
                          nextGreat.push(i);   
                 }
               
             }
        
            while(!nextGreat.isEmpty()){
                next.put(nums2[nextGreat.pop()], -1);
            }
             
            int[] answer = new int[nums1.length];
            for(int i = 0; i < nums1.length; i++){
               
                    answer[i] = next.get(nums1[i]);
                
            }
            
              return answer;
            
        }
    
}

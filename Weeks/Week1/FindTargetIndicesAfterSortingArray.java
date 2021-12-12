import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class FindTargetIndicesAfterSortingArray {
    public List<Integer> targetIndices(int[] nums, int target) {
            
       List<Integer> numList = new ArrayList<Integer>(nums.length);
      numList = Arrays.stream(nums).boxed().collect(Collectors.toList());     
        //  numList = Arrays.asList(nums);
        System.out.println("numList" + numList);

        List<Integer> sortedList = new ArrayList<Integer>();
        sortedList = countingSort(numList);
         System.out.println("sortedList" + sortedList);
         
        List<Integer> result = new ArrayList<Integer>();
        int k = 0;
        for(int i = 0; i < sortedList.size(); i++){
            
            if(sortedList.get(i) == target){
               result.add(k, i);
                k++;
            }
        }
        return result;
        
    }
    public static List<Integer> countingSort(List<Integer> arr) {
    // Write your code here
    List<Integer> freqList = new ArrayList<>();
        for (int i = 0; i <= 100; i++){
            freqList.add(0);
        }
       // System.out.println( Collections.max(arr));
        
        for (int i = 0; i < arr.size(); i++ ){
            int num = arr.get(i);
           freqList.set(num, freqList.get(num)+1) ;
        } 
       
        int k = 0;
        for (int i = 0; i < freqList.size(); i++){
            for (int j = 0; j < freqList.get(i); j++){
                arr.set(k, i);
                k++;
            }
        }
       return arr; 
    }
    public static void main(String[] args){
        FindTargetIndicesAfterSortingArray findTargetIndicesAfterSortingArraye = new FindTargetIndicesAfterSortingArray();
        int [] nums  = {100, 1, 1};
        int  target = 1;
        List<Integer> result =  findTargetIndicesAfterSortingArraye.targetIndices(nums, target);
        System.out.println(result);
    }
    	
}
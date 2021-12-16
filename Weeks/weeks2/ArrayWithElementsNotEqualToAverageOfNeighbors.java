import java.util.*;

class ArrayWithElementsNotEqualToAverageOfNeighbors {

    public static int[] rearrangeArray (int[] nums) {
        Arrays.sort(nums);     
         int i = 1;
         while(i < nums.length-3){
             swap(nums, i);


             i = i + 2;
         }
         return nums;
    }

    public static int[] swap( int[] num, int i){
     int temp = num[i];
     num[i] = num[i + 2];
     num[i + 2] = temp;

     return num;
    }
    public static void main(String[] args){
    ArrayWithElementsNotEqualToAverageOfNeighbors tester = new ArrayWithElementsNotEqualToAverageOfNeighbors();
    int[] arr = {9,4,7,6,5};
     int[] arr2 = tester.rearrangeArray(arr);
   System.out.println(Arrays.toString(arr2));
    }
}
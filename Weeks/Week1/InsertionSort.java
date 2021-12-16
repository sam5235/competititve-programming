import java.util.List;

public class InsertionSort {
    public static void swap(List<Integer> a, int j) {
        int temp = a.get(j);
        a.set(j, a.get(j-1));
         System.out.println(a);
        a.set(j-1, temp );
    }
 
     public static void insertionSort1(int n, List<Integer> arr) {
     // Write your code here
     
         for(int j = n-1 ; j > 0; j--){
             if(arr.get(j) < arr.get(j-1)){
               
                 swap(arr, j);
                 
         
         
     }
    
             }
       System.out.println(arr);
}}

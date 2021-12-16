import java.util.List;

public class BubbleSort {

    public static void swap(List<Integer> a, int j) {
        int temp = a.get(j);
        a.set(j, a.get(j+1));
        a.set(j+1, temp );
    }
   
    
     public static void countSwaps(List<Integer> a) {
     int n = a.size();
     int count = 0;
     
     for (int i = 0; i < n; i++) {
     
      for (int j = 0; j < n - 1; j++) {
         // Swap adjacent elements if they are in decreasing order
         if (a.get(j) > a.get(j+1)) {
             swap(a, j);
             count++;
         }
     }
     
 }
         System.out.println("Array is sorted in " + count +" swaps.");
         System.out.println("First Element: "+ a.get(0));
         System.out.println("Last Element: "+ a.get(n-1));
 
     }
 
 
}

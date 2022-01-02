import java.util.ArrayList;
import java.util.List;

public class PancakeSorting {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> sorterList = new ArrayList<>();
        
        for (int i = arr.length - 1; i >= 0; i--) {
            int index = max(arr, arr.length - 1);
            if (arr[index] != arr[i]) {
                reverse(arr, index);
                sorterList.add(index);
                reverse(arr, i);
                sorterList.add(i);
            }

        }

        return sorterList;
    }

    public int max(int[] arr, int e) {
        int max = 0;
        int index = 0;
        for (int i = 0; i <= e; i++) {
            max = Math.max(max, arr[i]);
            if (max == arr[i]) {
                index = i;
            }

        }
        return index;
    }

    public void reverse(int[] arr, int e) {
        int i = 0;
        int j = e;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

}

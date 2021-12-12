import java.util.*;

public class SortColors {
    public void sortColors(int[] nums) {
        int [] a = selectionSort(nums, nums.length);
            
            System.out.print(Arrays.toString(a));
    }

    int select(int arr[], int i) {

        int min = arr[i];
        int index = i;
        while (i < arr.length) {
            if (min > arr[i]) {
                min = arr[i];
                index = i;
            }
            i++;
        }
        return index;
    }

    int[] selectionSort(int arr[], int n) {
        // code here
        for (int i = 0; i < arr.length; i++) {
            int index = select(arr, i);
            swap(arr, i, index);
        }
        return arr;
    }

    void swap(int arr[], int i, int minIdx) {
        int temp = arr[i];
        arr[i] = arr[minIdx];
        arr[minIdx] = temp;

    }

    public static void main(String[] args) {
        SortColors sortColor = new SortColors();
        int[] arr = { 2, 0, 2, 1, 1, 0 };
        sortColor.sortColors(arr);

    }
}
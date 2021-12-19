import java.util.Arrays;

public class ReduceArraySizeToTheHalf {
    public int minSetSize(int[] arr) {
        int max = 0;
        for(int num : arr){
           max = Math.max(max, num);
        }
        int[] freq = new int[max+1];
        for(int num: arr){
            freq[num]++;
        }
        Arrays.sort(freq);
        System.out.println(Arrays.toString(freq));
        int sum = 0;
        int counter = 0;
        for(int i = freq.length -1; i >= 0; i--){
            sum+= freq[i];
            counter++;

            if(sum <= arr.length/2){
                return counter;
            }
        }
       return counter;
    }
}

import java.util.List;

public class ClosestNumber {
    public static List<Integer> closestNumbers(List<Integer> arr) {
        List<Integer> closestNumber = new ArrayList<>();
        Collections.sort(arr);
    
        int min = 0;
        for(int i = 0; i < arr.size()-1; i++){
            min = Math.min(min, arr.get(i) - arr.get(i+1) );
        }
        for(int i = 0; i<arr.size()-1; i++){
            if(arr.get(i+1) - arr.get(i)== min){
                closestNumber.add(arr.get(i+1));
                closestNumber.add(arr.get(i));
            }
        }

    return closestNumber;
     }
}

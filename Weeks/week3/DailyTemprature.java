import java.util.Stack;

public class DailyTemprature {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> dailyTemp = new Stack<>();
        int[] answer = new int[temperatures.length];
        for(int i = 0; i <temperatures.length; i++){
                while(!dailyTemp.isEmpty() && temperatures[i]>temperatures[dailyTemp.peek()]){
                    int popped = dailyTemp.pop();
                    answer[popped] = i - popped;  
                }
             
            
              dailyTemp.push(i);
        }
         return answer;   
        
    }
}

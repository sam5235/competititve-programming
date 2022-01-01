
import java.util.Stack;

public class MinStack {
    Stack<int[]> stack1;
    int min = 0;

    public MinStack() {
        stack1 = new Stack<>();

    }

    public void push(int val) {
        int[] stcArray = new int[2];
        if (stack1.empty()) {
            min = val;
        } else {
            min = Math.min(min, val);
        }
        stcArray[0] = val;
        stcArray[1] = min;
        stack1.push(stcArray);
    }

    public void pop() {
        stack1.pop();
        if(!stack1.empty()){
            min = stack1.peek()[1];
        }
    }

    public int top() {
        return stack1.peek()[0];
    }

    public int getMin() {

        return stack1.peek()[1];
    }

}

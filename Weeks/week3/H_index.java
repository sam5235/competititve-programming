import java.util.Arrays;
import java.util.Stack;

public class H_index{

    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        Stack<Integer> st = new Stack<>();
        for (int num : citations) {
            st.push(num);
        }
        int numberPopped = 1;
        int popped = st.pop();
        if (popped == 0) {
            return 0;
        }
        if (st.isEmpty()) {
            return 1;
        }

        while (!st.isEmpty()) {
            if (popped == numberPopped) {
                if (popped == 0) {
                    return numberPopped - 1;
                }
                return popped;
            } else if (popped < numberPopped) {
                return numberPopped - 1;
            }
            popped = st.pop();
            numberPopped++;
        }
        if (popped == numberPopped) {
            return popped;
        } else if (popped < numberPopped) {
            return numberPopped - 1;
        }

        return numberPopped;
    }
}
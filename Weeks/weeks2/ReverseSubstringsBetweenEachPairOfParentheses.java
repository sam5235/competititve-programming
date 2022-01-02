import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseSubstringsBetweenEachPairOfParentheses {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> directQueue = new LinkedList<>(), reverseQueue = new LinkedList<>();
        int open = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                open++;
                stack.push(ch);
            } else if (ch == ')') {
                open--;
                while (stack.peek()!= '(') {
                    reverseQueue.add(stack.pop());
                }
                stack.pop();
                while (!reverseQueue.isEmpty()) {
                    if (open != 0) {
                        stack.push(reverseQueue.poll());
                    } else
                        directQueue.add(reverseQueue.poll());
                }

            } else {
                if (open == 0) {
                    directQueue.add(ch);
                } else
                    stack.push(ch);
            }

        }
        String out = "";
        while (!directQueue.isEmpty()) {
            out += directQueue.poll();
        }
        return out;

    }
}

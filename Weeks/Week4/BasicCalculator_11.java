import java.util.ArrayDeque;

public class BasicCalculator_11 {
    public int calculate(String s) {
        char c;
        StringBuilder bl = new StringBuilder();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c != ' ') {
                bl.append(c);
            }
        }
        s = bl.toString();
        int n = 0;
        char operator = '+';

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c != '*' && c != '/' && c != '+' && c != '-') {
                n = n * 10 + (c - '0');
            } else {
                operate(stack, n, operator);
                operator = c;
                n = 0;
            }
        }
        operate(stack, n, operator);
        int popped = 0;
        while (!stack.isEmpty()) {
            popped += stack.pop();
        }
        return popped;
    }
    void operate(ArrayDeque<Integer> stack, int n, char op) {
        if (!stack.isEmpty() && op == ('*')) {
            stack.push((stack.pop() * n));
        } else if (!stack.isEmpty() && op == ('/')) {
            stack.push((stack.pop()) / n);
        } else if (op == ('-')) {
            stack.push(-n);
        } else
            stack.push(n);
    }
}

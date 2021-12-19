import java.util.ArrayList;
import java.util.List;

public class ValidParenthesis {

    public boolean isValid(String s) {
        List<Character> stack = new ArrayList<Character>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (isOpening(curr)) {
                stack.add(curr);
            } else if (stack.isEmpty() == false && isComplement(stack.get(stack.size() - 1), curr)) {
                stack.remove(stack.size() - 1);
            } else
                return false;
        }
        return stack.isEmpty();
    }

    public boolean isOpening(char c) {
        if (c == '(' || c == '[' || c == '{') {
            return true;
        } else
            return false;
    }

    public boolean isComplement(char c1, char c2) {
        if (c1 == '(' && c2 == ')' || c1 == '[' && c2 == ']' || c1 == '{' && c2 == '}') {
            return true;
        } else
            return false;
    }

}

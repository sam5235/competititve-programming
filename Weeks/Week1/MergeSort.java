import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class MergeSort {
    
        public int[][] merge(int[][] intervals) {
            Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
            Stack<Integer> mergeStack = new Stack<>();
            for (int i = intervals.length - 1; i >= 0; i--) {
                mergeStack.push(intervals[i][1]);
                mergeStack.push(intervals[i][0]);
            }

            int first = mergeStack.pop();
            int second = mergeStack.pop();
            List<Integer> newIntervals = new ArrayList<>();
            while (!mergeStack.isEmpty()) {
                if (second >= mergeStack.peek()) {
                    mergeStack.pop();

                } else if (!mergeStack.isEmpty() && mergeStack.size() % 2 != 0) {
                    second = mergeStack.pop();
                } else {
                    newIntervals.add(first);
                    newIntervals.add(second);
                    if (!mergeStack.isEmpty()) {
                        first = mergeStack.pop();
                        second = first;
                    }
                }
            }
            newIntervals.add(first);
            newIntervals.add(second);
            int newSize = newIntervals.size() / 2;
            int[][] answer = new int[newSize][2];
            for (int i = 0; i < newSize; i++) {
                answer[i][0] = newIntervals.remove(0);
                answer[i][1] = newIntervals.remove(0);
            }
            return answer;
        }
    }



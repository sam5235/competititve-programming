public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        int counter = 0;
        int height = 0;
        for (int i = 0; i < path.length(); i++) {
            char ch = path.charAt(i);
            if (ch == 'U') {
                height++;
                if (height == 0) {
                    counter++;
                }
            } else if (ch == 'D') {
                height--;
            }
        }
        return counter;

    }
}

import java.util.List;

public class EqualStacks {
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        // Write your code here
        Collections.reverse(h1);
        Collections.reverse(h2);
        Collections.reverse(h3);
        int sumh1 = sum(h1);
        int sumh2 = sum(h2);
        int sumh3 = sum(h3);

        while (sumh1 != sumh2 || sumh1 != sumh3) {

            if (sumh1 > sumh2) {
                sumh1 = sumh1 - h1.get(h1.size() - 1);
                h1.remove(h1.size() - 1);

                // System.out.println(sumh1);
            } else if (sumh2 > sumh3) {
                sumh2 = sumh2 - h2.get(h2.size() - 1);
                h2.remove(h2.size() - 1);

            } else if (sumh3 > sumh1) {
                sumh3 = sumh3 - h3.get(h3.size() - 1);
                h3.remove(h3.size() - 1);

            }

        }
        if (sumh1 == sumh2 && sumh1 == sumh3) {
            return sumh1;
        }
        return 0;

    }

    public static int sum(List<Integer> h) {
        int sum1 = 0;
        for (int i = 0; i < h.size(); i++) {
            sum1 = sum1 + h.get(i);
            // System.out.println( h.get(i));
        }
        return sum1;
    }

}

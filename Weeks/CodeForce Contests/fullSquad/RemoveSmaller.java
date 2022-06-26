import java.io.*;
import java.util.*;

public class RemoveSmaller {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        // solution
        // starts................................................................

        int t = Integer.parseInt(br.readLine());
        for (int test = 0; test < t; test++) {
            int n = Integer.parseInt(br.readLine());
            String[] data = br.readLine().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(data[i]);
            }
            Arrays.sort(a);
            int j = 0;
            int i = 1;
            while (i < n) {
                if (a[i] - a[j] <= 1) {
                    j++;
                    i++;
                } else {
                    output.write("NO \n" );
                    break;
                }
            }
            if (i >= n) {
                output.write("YES \n");
            }

        }

        // solution
        // ends....................................................................

        output.flush();
    }
}

import java.util.*;
import java.io.*;

public class WBBalancedSubTree {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        // solution
        // starts................................................................

        int t = Integer.parseInt(br.readLine());
        for(int start = 0; start < t; start++){
            int n = Integer.parseInt(br.readLine());
            String[] data = br.readLine().split(" ");
            String colors = br.readLine();
            int[] a = new int[n - 1];
            for(int i = 0; i < n -1; i++){
                a[i] = Integer.parseInt(data[i]);
            }
            HashMap<Integer, ArrayList<Integer>> tree = new HashMap<>();
            for(int i = 0; i < n -1; i++){
                ArrayList<Integer> elem = tree.getOrDefault(a[i], new ArrayList<>());
                elem.add(i + 2);
                tree.put(a[i], elem);
            }
            HashMap<Integer, Character> map = new HashMap<>();
            for(int i = 0; i < n; i++){
                char ch = colors.charAt(i);
                map.put(i + 1, ch);
            }
            int[] ans ={0};
            dfs(tree, map,1, ans);
             output.write(ans[0] + "\n");
          

        }
        //end of solution
       output.flush();
    }
    public static int[] dfs(HashMap<Integer, ArrayList<Integer>> tree, HashMap<Integer,Character> map, int root, int[] counter){
        int[] colorCnt = new int[2];
        if(map.get(root) == 'B'){
            colorCnt[0]++;
        }else colorCnt[1]++;

        if(!tree.containsKey(root)){
            return colorCnt;
        }else{
            for(int i : tree.get(root)){
                int[] curr =  dfs(tree, map, i, counter) ;
                    colorCnt[0] += curr[0];
                    colorCnt[1] += curr[1];
            }
        }
        if(colorCnt[0] == colorCnt[1]) counter[0]++;
        return colorCnt;
    }
}

import java.io.*;
import java.util.*;
public class Reposts {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        // solution
        // starts................................................................

        int t = Integer.parseInt(br.readLine());
      
        HashMap<String, Integer> graph = new HashMap<>();
        int max = 0;
        for(int i = 0; i < t; i++){
            String[] data = br.readLine().split(" ");
            String name1 = data[0].toLowerCase();
            String  name2 = data[2].toLowerCase();
            int prev = graph.getOrDefault(name2, 0 ) + 1 ;
            max = Math.max(max, prev);
            graph.put(name1, prev);
            }
           System.out.println(max + 1);

        // solution
        // ends....................................................................

        output.flush();
    }
    // public static int dfs(HashMap<String, ArrayList<String>> graph, String name, int depth){
    //     if(!graph.containsKey(name)){
        
    //         return depth;
    //     }else{
    //         int max = depth;
    //         for(String st : graph.get(name)){
    //              max = Math.max(max, dfs(graph, st, depth + 1));
    //         }
    //         return max;
    //     }
    // }
}

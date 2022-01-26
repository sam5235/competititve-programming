import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        spiraling(matrix,ans, matrix.length,matrix[0].length, 0);
        return ans;
    }
    
     void spiraling(int[][] matrix,List<Integer> res, int n, int m, int start){
        if(m < 1 || n < 1){
            return;
    }else if(n == 1){
           for(int i  = start; i < start + m; i++) res.add((matrix[start][i]));
            
       }else if(n == 2){
               for(int i = start; i <start + m; i++) res.add((matrix[start][i]));
                   
               for(int i = start+(m-1); i >= start; i--) res.add(matrix[start + 1][i]);
              
       }else{
           for(int i  = start; i < start + m; i++)  res.add((matrix[start][i]));
              
           for(int i  = start +1; i < start +n -1; i++) res.add((matrix[i][start + m-1]));
            
           for(int i = start+(m-1); i >= start; i--) res.add(matrix[start + n - 1][i]);
            
           if(m != 1){
                for(int i  = start +n-2; i > start ; i--) res.add((matrix[i][start]));
          }
           spiraling(matrix, res, n-2, m-2,start + 1);
                     
       } 
    }
}

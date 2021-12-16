import java.util.Arrays;

public class KClosestPointstoOrigin {
    public int[][] kClosest(int[][] arr, int k) {
        int [][] cal = new int [arr.length][3];
         for (int i = 0; i < arr.length; i++ ){
            int d = distanceCalculator (arr[i][0], arr[i][1]); 
            cal [i][0] = arr [i][0]; 
            cal [i][1] = arr [i][1]; 
            cal [i][2] = d; 
         }
        
        Arrays.sort(cal, (a,b) -> a[2] - b[2]);  
        int [][]  closestArray = new int [k][2];
        for (int i = 0; i < k; i++){
            closestArray[i][0] = cal [i][0];
            closestArray[i][1] = cal [i][1];
        }
     
     return closestArray;
 }
     public static int distanceCalculator(int x, int y){
        return (x*x) + (y*y);
    } 

}

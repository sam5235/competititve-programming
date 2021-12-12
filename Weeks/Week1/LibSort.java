import java.util.Arrays;

public class LibSort {
    public static void main(String[] args) {
        int [][] arr = {{3,3},{5,-1},{-2,4}};
        int k = 2;
        int [][] cal = new int [3][3];
         for (int i = 0; i < 3; i++ ){
            int d = distanceCalculator (arr[i][0], arr[i][1]); 
            cal [i][0] = arr [i][0]; 
            cal [i][1] = arr [i][1]; 
            cal [i][2] = d; 
         }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(cal));
        Arrays.sort(cal, (a,b) -> a[2] - b[2]);
        System.out.println(Arrays.deepToString(cal));
        int [][]  closestArray = new int [k][2];
        for (int i = 0; i < k; i++){
            closestArray[i][0] = cal [i][0];
            closestArray[i][1] = cal [i][1];
        }
        System.out.println(Arrays.deepToString(closestArray));
    }
    public static int distanceCalculator(int x, int y){
        return (x*x) + (y*y);
    } 
}



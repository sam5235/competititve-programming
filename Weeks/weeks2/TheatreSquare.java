import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String line = sc.nextLine();
         String [] data= line.split(" ");
         long n = Long.parseLong(data[0]);
         long m =Long.parseLong(data[1]);
         long a = Long.parseLong(data[2]);
         long numberOfFlag = squareUnit(n,m,a);
        System.out.println(numberOfFlag);
        sc.close();
}
   public static long squareUnit(long n, long m, long a){
        long x ;
        long y ;
        if(n%a == 0){
           x = n/a; 
        } else x = n/a + 1; 
     if (m%a == 0){
        y = m/a;
    }else y = m/a + 1;
     
    long flagArea = (long) (a * a);
    long squarArea =(long) ((x*a) *(y*a));
    long numberOfFlag = squarArea/flagArea;
  return numberOfFlag;
}}
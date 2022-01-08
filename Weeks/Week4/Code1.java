import java.util.Scanner;

public class Code1 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       long n = sc.nextLong();
      long l = sc.nextLong();
      long r =  sc.nextLong();
       sc.close();
      long level = 0;
       long tempN = n;
       while(tempN >= 1){
        level++;
        tempN = tempN/2;
       }
      
      long cl = 1;
      long cr = (long) Math.pow(2,level)-1;
    
       System.out.println( findOne(n,l,r,cl,cr));
   }

    public static long findOne(long n,long l,long r,long cl,long cr) {

        if(l> cr || r < cl|| n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            
            long left = findOne(n/2, l,r,cl, (cl + cr) /2 -1);
            long mid  = findOne(n%2, l,r,(cl +cr)/2, (cl +cr)/2);
            long right = findOne(n/2, l,r,(cl +cr)/2 +1,cr );
            return left + mid +right;
        }


        
    }
}

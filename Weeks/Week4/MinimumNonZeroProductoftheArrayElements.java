public class MinimumNonZeroProductoftheArrayElements {
    static int mod = (int)(Math.pow(10,9)+7);
    public int minNonZeroProduct(int p) {
        
         long max =  (long) Math.pow(2,p)-1;
         long mid = (max /2) ;
         
        return (int)(((pow(max - 1, mid)) % mod * (max%mod) ) % mod);
    }
    
    long pow(long x, long p){
        if(p == 0){
            return 1;
        }else if(p == 1){
            return x % mod;
        }else{
            long val = pow(x, p/2) % mod ;
            val *=(val % mod);
            val%=mod;
            if(p % 2== 0){
                return val;
            }
            
            return (val *  (x % mod)) % mod;
            
        }
    }

}

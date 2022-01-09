public class CountGoodNumber {

        static int mod = 1000000000 + 7;
        public int countGoodNumbers(long n) {
         return (int) ((pow(5, n - (n/2)) % mod) * (pow(4, n/2) %mod) % mod);
        
        }
        long pow(int evOd, long n){
            if(n == 0){
                return 1;
            }else if(n == 1){
                return evOd;
            }else{
                long ans = pow(evOd, n/2)% mod;
                if(n%2 == 0){
                    return (ans * ans)% mod;
                }
                return ((ans*ans)%mod * evOd) % mod;
                
                
            }
        }
    }


public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        int x = 0;
        return  cheaker(n,x);
    }
    
    public boolean cheaker(int n, int x){
        if(n== Math.pow(3, x)){
            return true;
        }else if(n < Math.pow(3, x)){
            return false;
        }
        x++;
       return cheaker(n,x);
    }
}

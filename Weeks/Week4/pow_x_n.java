public class pow_x_n {
    public double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }
        if(n== 1){
            return x;
        } else if( n == -1){
            return 1/x;
        }
        double val =  myPow(x, n/2);
        if(n%2 == 0){
            return val * val;
        } else  {
            if(n<0){
                 return val * val * 1/x;
            }
            return val * val * x;
        }
    }
}

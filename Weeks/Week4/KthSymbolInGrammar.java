public class KthSymbolInGrammar {
    public int kthGrammar(int n, int k) {
        if(n == 1 || k == 1){
            return 0;
        }
        
        int val = kthGrammar(n-1,( k+1)/2);
        if(k == 2*(k/2) ){
           return val == 0? 1:0; 
        }else return val;
    }
}

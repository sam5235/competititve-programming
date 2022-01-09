public class FindKthBitInNthBinaryString {
    public char findKthBit(int n, int k) {
        if(n == 1){
            return '0';
        }else {
            int length = (int)Math.pow(2, n)-1;
            if(k > length/2 + 1){
                k = length/2 - (k -(length/2 + 2));
                return findKthBit(n-1, k) =='0' ? '1' : '0'; 
            }else if(k == length/2 + 1){
                return '1';
            }
            return findKthBit(n-1, k);
        }
    }
}
